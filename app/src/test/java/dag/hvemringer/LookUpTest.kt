package dag.hvemringer

import org.junit.Test

import org.junit.Assert.*

class LookUpTest {

    @Test
    fun lookUp() {
        val map = LookUp.lookUp("91667821")
        println(map)
        val map2 = LookUp.lookUp("46667834")
        println(map2)
    }
}