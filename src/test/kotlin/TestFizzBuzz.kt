import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

fun main() {
    convertsNumberSmallerThanTenAndNotMultiplierOfThreeNorFive()
    convertsToFizzWhenNumberIsSmallerThanTenAndMultiplierOfThree()
    convertsToFizzWhenNumberIsSmallerThanTenAndMultiplierOfFive()
    convertsTeensWhichIsNotMultiplierOfThreeNorFive()
    convertsTeensWhichIsMultiplierOfThreeAndFive()
    convertsTwentiesWhichIsNotMultiplierOfThreeNorFive()
    convertsThirtiesWhichIsNotMultiplierOfThreeNorFive()
}

@Test
fun convertsNumberSmallerThanTenAndNotMultiplierOfThreeNorFive() {
    assertEquals("two", toDecimal(2))
}

@Test
fun convertsToFizzWhenNumberIsSmallerThanTenAndMultiplierOfThree() {
    assertEquals("Fizz", toDecimal(3))
    assertEquals("Fizz", toDecimal(6))
}

@Test
fun convertsToFizzWhenNumberIsSmallerThanTenAndMultiplierOfFive() {
    assertEquals("Buzz", toDecimal(5))
}

@Test
fun convertsTeensWhichIsNotMultiplierOfThreeNorFive() {
    assertEquals("thirteen", toDecimal(13))
    assertEquals("nineteen", toDecimal(19))
}

@Test
fun convertsTeensWhichIsMultiplierOfThreeAndFive() {
    assertEquals("FizzBuzz", toDecimal(15))
}

@Test
fun convertsTwentiesWhichIsNotMultiplierOfThreeNorFive() {
    assertEquals("twenty two", toDecimal(22))
}

@Test
fun convertsThirtiesWhichIsNotMultiplierOfThreeNorFive() {
    assertEquals("thirty one", toDecimal(31))
}
