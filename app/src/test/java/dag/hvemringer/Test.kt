package dag.hvemringer

import org.junit.Test
import java.lang.Exception

class Test {
    @Test
    fun test() {
        var k = "closure"

        val map = mapOf(
            "a" to lookUp("yyyy", ::ff),
            "b" to lookUp("yyyy"){_,_ ->"qwer"},
            "abc" to lookUp("123x") { p, _ ->  k = "ny"; ff(p) },
        "def" to lookUp("123y") {_,_ -> ff(k); k="dd"; ff(k+"a") },
        "ghi" to lookUp("123z") {_,_ -> ff("123zz") },
        "jkl" to lookUp("123a") { p, _ -> println(p); "ff-$p"}
        )

        println(map)
    }

    private fun lookUp(phoneNo: String,  f: (String, String) -> String?) = try {
        f(phoneNo, "z")
    } catch (e: Exception) {
        e.toString()
    }

    private fun ff(s: String): String? {
        println("i ff:$s")
        return "ff-$s"
    }

    private fun ff(s: String, s2 : String): String? {
        println("i ff:$s")
        return "ff-$s"
    }

}