class StringCalculator {
    fun add(s: String, vararg delimiters: String): Int {
        if (s.isEmpty()) return 0
        if (!s.startsWith("//")) return s.split(delimiters.added(",")).sumOf { it.toInt() }
        val (_, newDelimiters, numbers) = s.split(arrayOf("//", "\n"))
        return add(numbers, *newDelimiters.map { it.toString() }.toTypedArray())
    }
}

fun String.split(delimiters: Array<String>) = split(delimiters.joinToString("|").toRegex())

inline fun <reified T> Array<out T>.added(vararg t: T) = mutableListOf<T>()
        .also { it.addAll(this) }
        .also { it.addAll(t) }
        .toTypedArray()