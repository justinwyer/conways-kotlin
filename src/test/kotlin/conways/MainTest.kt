package conways

import org.junit.jupiter.api.*
import assertk.assertThat
import assertk.assertions.*

class MainTests {
    @Test
    fun `should add two numbers`() {
        assertThat(add(1, 3)).isEqualTo(4)
    }
}