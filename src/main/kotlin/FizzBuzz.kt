val decimals = mutableMapOf<Int, String>().apply {
    this[1] = "one"
    this[2] = "two"
    this[3] = "three"
    this[4] = "four"
    this[5] = "five"
    this[6] = "six"
    this[7] = "seven"
    this[8] = "eight"
    this[9] = "nine"
    this[10] = "ten"
    this[11] = "eleven"
    this[12] = "twelve"
    this[13] = "thirteen"
    this[14] = "fourteen"
    this[15] = "fifteen"
    this[16] = "sixteen"
    this[17] = "seventeen"
    this[18] = "eighteen"
    this[19] = "nineteen"
    this[20] = "twenty"
    this[30] = "thirty"
    this[40] = "fourty"
    this[50] = "fifty"
    this[60] = "sixty"
    this[70] = "seventy"
    this[80] = "eighty"
    this[90] = "ninety"
}

fun toDecimal(number: Int): String {
    if (number % 15 == 0) return "FizzBuzz"
    if (number % 5 == 0) return "Buzz"
    if (number % 3 == 0) return "Fizz"
    if (number < 20) return decimals[number] ?: ""
    val one = number % 10
    val ten =  number - one
    return "${decimals[ten] ?: ""} ${decimals[one] ?: ""}"
}