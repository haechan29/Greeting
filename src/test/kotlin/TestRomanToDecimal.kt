import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

fun main() {
    convertsEmptyInputToZero()
    convertsCharacter()
    supportsNumberWithTwoCharactersAndAddition()
    supportsNumberWithTwoCharactersAndSubtraction()
    supportsNumberWithAddition()
    supportsNumberWithSubtraction()
}

@Test
fun convertsEmptyInputToZero() {
    assertEquals(toDecimal(""), 0)
}

@Test
fun convertsCharacter() {
    assertEquals(toDecimal("X"), 10)
    assertEquals(toDecimal("D"), 500)
}

@Test
fun supportsNumberWithTwoCharactersAndAddition() {
    assertEquals(toDecimal("II"), 2)
    assertEquals(toDecimal("MD"), 1500)
}

@Test
fun supportsNumberWithTwoCharactersAndSubtraction() {
    assertEquals(toDecimal("IV"), 4)
    assertEquals(toDecimal("XC"), 90)
}

@Test
fun supportsNumberWithAddition() {
    assertEquals(toDecimal("MMVI"), 2006)
}

@Test
fun supportsNumberWithSubtraction() {
    assertEquals(toDecimal("MCMXLIV"), 1944)
}