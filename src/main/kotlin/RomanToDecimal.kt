
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
    if (roman.isEmpty()) return 0
    return roman
        .toCharArray()
        .mapIndexed { i, c ->
            getSignOfCharacter(i, roman) * romanValue[c]!!
        }.sum()
}

fun getSignOfCharacter(i: Int, roman: String) =
    if (i < roman.indices.last && romanValue[roman[i]]!! < romanValue[roman[i + 1]]!!) -1 else 1
