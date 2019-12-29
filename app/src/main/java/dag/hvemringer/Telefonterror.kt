package dag.hvemringer

import org.jsoup.Jsoup

object Telefonterror {
    fun find(phoneNo : String) : String? {
        val html = UrlReader.read("https://www.telefonterror.co.no/nummer/$phoneNo")
        val document = Jsoup.parse(html)
        return document.title()
    }
}