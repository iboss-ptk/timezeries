package com.iboss.timezeries

import org.jetbrains.spek.api.Spek
import org.junit.Assert.*

/**
 * Created by ibosz on 1/4/59.
 */
class SAXTest: Spek() { init{
    given("constructor works correctly") {
        val sax = SAX(arrayOf('a', 'b', 'c'))
        on("get underlying data") {
            it("should result as what is defined in constructor") {
                assertArrayEquals(sax.data, arrayOf('a', 'b', 'c'))
            }
        }
    }
}}