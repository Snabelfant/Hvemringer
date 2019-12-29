package dag.hvemringer

import org.jsoup.Jsoup

object _1881 {
    fun find(phoneNo: String): String? =
        Jsoup.parse(UrlReader.read("https://www.1881.no/?query=$phoneNo"))
            .title()
            ?.replace(" - 1881.no", "")
            ?.replace(", $phoneNo", "")
            ?.let {
                when {
                    it.contains("Gir deg treff") -> "Reservert"
                    it.contains("Ingen treff") -> null
                    it.contains("ukjent nummer") -> null
                    else -> it

                }
            }
}