import kotlin.test.assertEquals

fun main() {
    returnsZeroWhenNoNumberIsGiven()
    returnsNumberWhenOneNumberIsGiven()
    returnsSumWhenManyNumbersAreGiven()
    supportsNewLineDelimiter()
    supportsAssigningDelimiterWithOneCharacter()
    supportsAssigningManyDelimiters()
}

fun returnsZeroWhenNoNumberIsGiven() {
    val calculator = StringCalculator()
    assertEquals(calculator.add(""), 0)
}

fun returnsNumberWhenOneNumberIsGiven() {
    val calculator = StringCalculator()
    assertEquals(calculator.add("1"), 1)
}

fun returnsSumWhenManyNumbersAreGiven() {
    val calculator = StringCalculator()
    assertEquals(calculator.add("1,2"), 3)
}

fun supportsNewLineDelimiter() {
    val calculator = StringCalculator()
    assertEquals(calculator.add("1\n2", "\\n"), 3)
}

fun supportsAssigningDelimiterWithOneCharacter() {
    val calculator = StringCalculator()
    val delimiter = ";"
    val inputWithAssignedDelimiter = "//" + delimiter + "\n" + 1 + delimiter + 2
    assertEquals(calculator.add(inputWithAssignedDelimiter), 3)
}

fun supportsAssigningManyDelimiters() {
    val calculator = StringCalculator()
    val delimiter1 = ";"
    val delimiter2 = "'"
    val inputWithAssignedDelimiter = "//" + delimiter1 + delimiter2 + "\n" + 1 + delimiter1 + 2 + delimiter2 + 3
    assertEquals(calculator.add(inputWithAssignedDelimiter), 6)
}