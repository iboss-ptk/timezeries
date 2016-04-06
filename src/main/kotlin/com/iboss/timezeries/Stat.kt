package com.iboss.timezeries

/**
 * Created by ibosz on 1/4/59.
 */
object Stat {
    fun zNormalize(data: Array<Double>): Array<Double> {
        val mean = data.reduce { sum, current -> sum + current } / data.size
        val sumDiffMeanSquared = data.reduce { sum, current -> sum + Math.pow(current - mean, 2.0) }
        val sd = Math.sqrt(sumDiffMeanSquared / data.size)
        return data.map { (it - mean) / sd }.toTypedArray()
    }
}