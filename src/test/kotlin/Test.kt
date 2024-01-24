import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

fun main() {
    greetsToMyFriendWhenNoNameIsGiven()
    greetsToNameWhenOneNameIsGiven()
    greetsToNameWithShoutingWhenOneShoutedNameIsGiven()
    greetsToNamesWhenNamesAreGiven()
    greetsToNamesWithShoutingWhenShoutedNamesAreGiven()
    greetsToNamesNormallyAndWithShoutingWhenBothNormalAndShoutedNamesAreGiven()
}

@Test
fun greetsToMyFriendWhenNoNameIsGiven() {
    assertEquals(greet(), "Hello, my friend.")
}

@Test
fun greetsToNameWhenOneNameIsGiven() {
    assertEquals(greet("John"), "Hello, John.")
}

@Test
fun greetsToNameWithShoutingWhenOneShoutedNameIsGiven() {
    assertEquals(greet("JOHN"), "HELLO JOHN!")
}

@Test
fun greetsToNamesWhenNamesAreGiven() {
    assertEquals(greet("John", "Jane"), "Hello, John, and Jane.")
    assertEquals(greet("John", "Jane", "Jack"), "Hello, John, Jane, and Jack.")
}

@Test
fun greetsToNamesWithShoutingWhenShoutedNamesAreGiven() {
    assertEquals(greet("JOHN", "JANE"), "HELLO JOHN AND JANE!")
}

@Test
fun greetsToNamesNormallyAndWithShoutingWhenBothNormalAndShoutedNamesAreGiven() {
    assertEquals(greet("John", "JANE"), "Hello, John. AND HELLO JANE!")
}