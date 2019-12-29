package dag.hvemringer

import org.jsoup.Jsoup

object HvemDer {
    fun find(phoneNo: String): String? =
        Jsoup
            .parse(UrlReader.read("https://hvemder.no/$phoneNo"))
            .head()
            .getElementsByAttributeValue("name", "description")
            .takeIf { it.size == 1 }
            ?.get(0)
            ?.attr("content")
            ?.let {
                when {
                    it.contains("ingen informasjon") -> null
                    it.contains("Våre brukere har registrert at telefonnummer") -> it.replace(
                        Regex("Våre brukere har registrert at telefonnummer «.*» "),
                        ""
                    )
                    else -> it
                }
            }
}