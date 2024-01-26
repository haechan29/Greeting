fun greet(vararg names: String): String {
    if (names.isEmpty()) return "Hello, my friend."
    val (normalNames, shoutedNames) = getNormalAndShoutedNames(names)
    return toGreeting(normalNames, shoutedNames)
}

fun toGreeting(normalNames: List<String>, shoutedNames: List<String>): String {
    val normalGreeting = if (normalNames.isNotEmpty()) "Hello, ${normalNames.joinToString(", ", ", and ", "")}." else ""
    val shoutedGreeting = if (shoutedNames.isNotEmpty()) "HELLO ${shoutedNames.joinToString(" ", " AND ", "")}!" else ""
    val and = if (shoutedGreeting.isNotEmpty() && normalGreeting.isNotEmpty()) " AND " else ""
    return normalGreeting + and + shoutedGreeting
}

fun getNormalAndShoutedNames(names: Array<out String>): Pair<List<String>, List<String>> = names
    .fold(mutableListOf<String>() to mutableListOf<String>()) { (normalNames, shoutedNames), name ->
        if (isShouted(name)) shoutedNames.add(name) else normalNames.add(name)
        normalNames to shoutedNames
    }

fun isShouted(name: String) = name[name.lastIndex].isUpperCase()

fun Collection<String>.joinToString(default: String, beforeLast: String, last: String) = foldIndexed("") { i, acc, cur ->
    acc + cur + getTransition(i, this.indices.last, default, beforeLast, last)
}

fun getTransition(i: Int, lastIndex: Int, default: String, beforeLast: String, last: String) = when {
    i < lastIndex - 1   -> default
    i == lastIndex - 1  -> beforeLast
    else                -> last
}