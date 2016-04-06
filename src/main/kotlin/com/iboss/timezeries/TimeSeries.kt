package com.iboss.timezeries

/**
 * Created by ibosz on 1/4/59.
 */
class TimeSeries(val data: Array<Double>) {
    fun toSAX(saxNum: Int): SAX {
        return SAX(arrayOf('a'))
    }
}