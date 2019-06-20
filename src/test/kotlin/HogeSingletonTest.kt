import org.assertj.core.api.Assertions.assertThat
import org.grim3lt.example.kotlin.HogeSingleton
import org.junit.jupiter.api.Test

class HogeSingletonTest {
    @Test
    fun testInstanceCreation() {
        val instance = HogeSingleton.getInstance()

        assertThat(instance.toString().length)
            .isGreaterThan(0)
    }
}