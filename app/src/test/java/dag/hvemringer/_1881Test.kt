package dag.hvemringer

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.nullValue
import org.junit.Assert.*
import org.junit.Test

class _1881Test {

    @Test
    fun testFinnes() {
        val s = _1881.find("93480487")
        assertThat( s, `is`("Ellen Hermansen, Son, Vestby"))
    }

    @Test
    fun testFinnesIkke() {
        val s = _1881.find("83480486")
        assertThat( s, nullValue())
    }

    @Test
    fun testReservert() {
        val s = _1881.find("93480001")
        assertThat( s, `is`("Reservert"))
    }
}