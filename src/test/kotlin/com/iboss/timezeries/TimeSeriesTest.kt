package com.iboss.timezeries

import org.jetbrains.spek.api.Spek
import org.junit.Assert.*

/**
 * Created by ibosz on 1/4/59.
 */
class TimeSeriesTest: Spek() { init {
    given("TimeSeries constructed on array(1.2, 2.4, 3.5, 2.4, 5.0) ") {
        val data = arrayOf(1.2, 2.4, 3.5, 2.4, 5.0)
        val timeSeries = TimeSeries(data)

        on("get underlying time-series data") {
            it("should result in array of time-series data as declared in construction") {
                assertArrayEquals(timeSeries.data, data)
            }
        }

    }
}}