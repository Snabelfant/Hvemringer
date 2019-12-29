package dag.hvemringer

import java.lang.Exception

object LookUp {
    fun lookUp(phoneNo : String) = mapOf(
        "1881" to lookUp(phoneNo, _1881::find),
        "Telefonterror" to lookUp(phoneNo,  Telefonterror::find),
        "Hvem der?" to lookUp(phoneNo,  HvemDer::find)
    )

    private fun lookUp(phoneNo: String, f: (String) -> String?) = try {
        f(phoneNo)
    } catch (e: Exception) {
        e.toString()
    }
}