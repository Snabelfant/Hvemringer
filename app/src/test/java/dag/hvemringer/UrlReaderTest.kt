package dag.hvemringer

import okhttp3.*
import org.hamcrest.CoreMatchers.notNullValue
import org.junit.Test

import org.junit.Assert.*
import java.io.IOException
import java.nio.charset.Charset

class UrlReaderTest {
     @Test
    fun download() {
        val s = UrlReader.read("https://vg.no")
        assertThat(s, notNullValue())
        assertTrue(s!!.length > 1000)
    }


}