class LightParamsTest {
    fun testCase1_1() {
        println("TC 1.1 (parameters pass validation; (checkTime = 1, minBrightness = 0.75f) = 1)")
        val tcResult = setLightParams(checkTime = 1, minBrightness = 0.75f)
        return 1 if tcResult == 1 else "Failed"
    }

    fun testCase1_2() {
        println("TC 1.1 (parameters don't pass validation; (checkTime = -1, minBrightness = 0.5f) = -1)")
        val tcResult = setLightParams(checkTime = -1, minBrightness = 0.5f)
        return -1 if tcResult == -1 else "Failed"
    }

    fun testCase1_3() {
        println("TC 1.1 (parameters don't pass validation; (checkTime = 1, minBrightness = -2f) = -2)")
        val tcResult = setLightParams(checkTime = 1, minBrightness = -2f)
        return -2 if tcResult == -2 else "Failed"
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
