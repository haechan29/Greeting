# The Projects to Practice TDD.

### This practice was designed from below
[Greeting](https://github.com/testdouble/contributing-tests/wiki/Greeting-Kata)
[String Calculater](https://medium.com/@marlenac/learning-tdd-with-katas-3f499cb9c492)

</br>

## Gained benefit of
### 1. The code looking good

For example, the main __greet()__ method which converts ``name list`` into ``greeting text`` is like below.
```
fun greet(vararg names: String): String {
    if (names.isEmpty()) return "Hello, my friend."
    val (normalNames, shoutedNames) = getNormalAndShoutedNames(names)
    return toGreeting(normalNames, shoutedNames)
}
```

</br>

And __getNormalAndShoutedNames()__ method is as below.
```
fun getNormalAndShoutedNames(names: Array<out String>): Pair<List<String>, List<String>> = names
    .fold(mutableListOf<String>() to mutableListOf<String>()) { (normalNames, shoutedNames), name ->
        if (isShouted(name)) shoutedNames.add(name) else normalNames.add(name)
        normalNames to shoutedNames
    }
```

</br>

The code looks so simple that the intention of developer's easy to understand.

</br>

### 2. The code being safer.

The production code is __29 lines__. While the test code is __42 lines__.</br>
This lessons the vulnerability of malfunction.</br>
And the test has higher quality than of made after implementing production codes.










