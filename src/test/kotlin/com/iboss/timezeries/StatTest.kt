package com.iboss.timezeries

import org.jetbrains.spek.api.Spek
import org.junit.Assert.*

/**
 * Created by ibosz on 1/4/59.
 */
class StatTest: Spek() { init {
    given("#zNormalize") {
        on("data is 1 2 3") {
            val data = arrayOf(1.0, 2.0, 3.0)
            it("should return -1 0 1") {
                assertArrayEquals(Stat.zNormalize(data), arrayOf(-1.0, 0.0, 1.0))
            }
        }
    }
}}