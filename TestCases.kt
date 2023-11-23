package com.example.safeco.unitTest

import junit.framework.TestCase.assertEquals
import org.junit.Test


class LightParamsTest {
    @Test
    fun testCase1_1() {
        val tcResult = setLightParams(checkTime = 1, minBrightness = 0.75f)
        assertEquals(1, tcResult)
    }

    @Test
    fun testCase1_2() {
        val tcResult = setLightParams(checkTime = -1, minBrightness = 0.5f)
        assertEquals(-1, tcResult)
    }

    @Test
    fun testCase1_3() {
        val tcResult = setLightParams(checkTime = 1, minBrightness = -2f)
        assertEquals(-2, tcResult)
    }
}


const val SUCCESS = 1
const val PERIOD_ERROR = -1
const val BRIGHTNESS_ERROR = -2

fun setLightParams(checkTime: Int?, minBrightness: Float?): Int {
    if (checkTime == null || checkTime < 0 || checkTime > 99) return PERIOD_ERROR;
    if (minBrightness == null || minBrightness < 0 || minBrightness > 1) return BRIGHTNESS_ERROR

    return SUCCESS;
}
