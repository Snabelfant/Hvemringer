package dag.hvemringer

import org.jsoup.Jsoup

object _1881 {


    fun find(phoneNo : String) : String? {
        val html = UrlReader.read("https://www.1881.no/?query=$phoneNo")
        val document = Jsoup.parse(html)
        val title = document.title()

        if (title.contains("Gir deg treff")) {
            return "Reservert"
        }

        return document.title()?.replace(" - 1881.no","")?.replace(", $phoneNo","")
    }


}