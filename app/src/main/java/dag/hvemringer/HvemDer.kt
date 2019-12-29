package dag.hvemringer

import org.jsoup.Jsoup

object HvemDer {
    fun find(phoneNo : String) : String? {
        val html = UrlReader.read("https://hvemder.no/$phoneNo")
        val document = Jsoup.parse(html)
        val elements = document.head().getElementsByAttributeValue("name", "description")
        return if (elements.size == 1)  elements[0]?.attr("content") else null
    }
}