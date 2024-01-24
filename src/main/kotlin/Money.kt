data class Money(val amount: Int, val currency: String): Expression {
    override fun plus(addend: Expression): Expression {
        return Sum(this, addend)
    }

    override fun times(multiplier: Int): Expression {
        return Money(amount * multiplier, currency)
    }

    override fun reduce(bank: Bank, to: String): Money {
        val rate = bank.getRate(currency, to)
        return Money(amount / rate, to)
    }

    companion object {
        fun dollar(amount: Int) = Money(amount, "USD")
        fun franc(amount: Int) = Money(amount, "CHF")
    }
}

interface Expression {
    fun plus(expression: Expression): Expression
    fun times(multiplier: Int): Expression
    fun reduce(bank: Bank, to: String): Money
}

class Bank {
    private val rates = mutableMapOf<Pair<String, String>, Int>()
    
    fun reduce(expression: Expression, to: String): Money {
        return expression.reduce(this, to)
    }

    fun addRate(from: String, to: String, rate: Int) {
        rates[from to to] = rate
    }

    fun getRate(from: String, to: String): Int {
        return rates[from to to] ?: 1
    }
}

data class Sum(val augend: Expression, val addend: Expression): Expression {
    override fun plus(expression: Expression): Expression {
        return Sum(this, expression)
    }

    override fun times(multiplier: Int): Expression {
        return Sum(augend.times(multiplier), addend.times(multiplier))
    }

    override fun reduce(bank: Bank, to: String): Money {
        val amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
        return Money(amount, to)
    }
}
