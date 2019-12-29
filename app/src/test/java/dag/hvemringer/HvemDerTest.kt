package dag.hvemringer

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.nullValue
import org.junit.Assert.*
import org.junit.Test

class HvemDerTest {

    @Test
    fun testFinnesIkke() {
        val s = HvemDer.find("83480486")
        assertThat( s, nullValue())
    }

    @Test
    fun testFinnes() {
        val s = HvemDer.find("46667834")
        assertThat( s, `is`("brukes av firmaet FIRMANAVN UKJENT til telefonsalg eller andre uønskede oppringninger."))
    }

}