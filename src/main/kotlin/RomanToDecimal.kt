
val romanValue = mutableMapOf<Char, Int>().apply {
    this['I'] = 1
    this['V'] =	5
    this['X'] =	10
    this['L'] =	50
    this['C'] =	100
    this['D'] =	500
    this['M'] =	1000
}

fun toDecimal(roman: String): Int {
    val romanValues = roman.map { romanValue[it] ?: 0 }
    val signs = roman.getSigns()
    return romanValues.zip(signs).sumOf { (value, sign) ->
        value * sign
    }
}

fun String.getRomanValue(i: Int) = try {
    romanValue[this[i]] ?: 0
} catch(_: Exception) {
    0
}

fun String.getSigns() = indices
    .map { i -> getRomanValue(i) to getRomanValue(i + 1) }
    .map { (cur, next) ->
        cur >= next
    }.map { isPositive ->
        if (isPositive) 1 else -1
    }
