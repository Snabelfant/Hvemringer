package dag.hvemringer

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.*
import org.junit.Test

class TelefonterrorTest {

    @Test
    fun testFinnes() {
        val s = Telefonterror.find("91667821")
        assertThat( s, containsString("Plagende"))
    }

    @Test
    fun testFinnesIkke() {
        val s = Telefonterror.find("83480486")
        assertThat( s, nullValue())
    }

}