package dag.hvemringer

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class HvemDerTest {

    @Test
    fun testFinnes() {
        val s = HvemDer.find("91667821")
        assertThat( s, `is`("Ellen Hermansen, Son, Vestby"))
    }

    @Test
    fun testFinnesIkke() {
        val s = _1881.find("83480486")
        assertThat( s, `is`("Ingen treff"))
    }

    @Test
    fun testReservert() {
        val s = _1881.find("93480001")
        assertThat( s, `is`("Reservert"))
    }
}