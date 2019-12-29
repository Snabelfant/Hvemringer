package dag.hvemringer

import org.jsoup.Jsoup

object Telefonterror {
    fun find(phoneNo: String): String? =
        Jsoup
            .parse(UrlReader.read("https://www.telefonterror.co.no/nummer/$phoneNo"))
            .title()
            ?.let {
                when {
                    it.contains("Ønsker du å søke") -> null
                    it.contains("ukjent nummer") -> null
                    it.contains("Antall vurderinger") -> it.replace( Regex("^.+? . "), "").replace("Antall vurderinger: ","")
                    else -> it
                }
            }
}