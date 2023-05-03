import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculatorSpek {
    val calculator = Calculator(NullResult())
    @Test
    fun canAddTwoNumbers() {
        val actual = calculator.add(12, 13)
        assertEquals(25, actual)
    }

}



