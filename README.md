# The Projects to Practice TDD.

### This practice was designed from below
[Greeting](https://github.com/testdouble/contributing-tests/wiki/Greeting-Kata)
&nbsp;&nbsp;
[String Calculater](https://medium.com/@marlenac/learning-tdd-with-katas-3f499cb9c492)
&nbsp;&nbsp;
[Roman Numbers](https://github.com/TDD-Katas/roman-numerals#problem-description)
</br></br>

## Gained benefit of
### 1. The code looking good

For example, the __romanToDecimal()__ method which converts ``Roman numeral`` into ``decimal`` is like below.
```
fun romanToDecimal(roman: String): Int {
    if (roman.isEmpty()) return 0
    return roman
        .toCharArray()
        .mapIndexed { i, c ->
            getSignOfCharacter(i, roman) * romanValue[c]!!
        }.sum()
}

fun getSignOfCharacter(i: Int, roman: String) =
    if (i < roman.indices.last && romanValue[roman[i]]!! < romanValue[roman[i + 1]]!!) -1 else 1

```

</br>

And this is the code __doing exactly the same__ without ``TDD``

```
fun romanToDecimal(roman: String): Int {
    var sum = 0
    for (i in roman.indices.first until roman.indices.last) {
        val cur = roman[i]
        val next = roman[i + 1]
        if (cur == 'I' && (next == 'V' || next == 'X'))
            sum -= 2 * romanValue['I']!!
        if (cur == 'X' && (next == 'L' || next == 'C'))
            sum -= 2 * romanValue['X']!!
        if (cur == 'C' && (next == 'D' || next == 'M'))
            sum -= 2 * romanValue['C']!!
    }
    for (c in roman.toCharArray()) {
        sum += romanValue[c]!!
    }
    return sum
}
```

</br>

The former code looks simpler and is easier to understand developer's intention.

</br>

### 2. The code being safer.

Among the TDD practice projects I've implemented,</br>
the average production code is __21.6 lines__, whereas the test code is __43.6 lines__.</br>
This lessons the vulnerability of malfunction.</br>
And the test has higher quality than of made after implementing production codes.










