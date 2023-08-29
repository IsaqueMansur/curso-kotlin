import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.Test

fun returnTrueIfA(value: String): Boolean {
    return value === "a"
}

class MainTest {
    @Test
    fun testCountXO() {
        Assertions.assertTrue(countXO("xxoo"))
        Assertions.assertFalse(countXO("xxoo"))
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxoo"))
        Assertions.assertTrue(returnTrueIfA("b"))
    }
}