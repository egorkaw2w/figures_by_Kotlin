class Parralelorgramm(var dlina1: Float, var dlina2: Float,):Figure() {
    override fun countP(): Float {
    val result = 2* (dlina1 + dlina2)
        return  result
    }

    override fun countS(): Float {
        val result =  dlina1 * dlina2
        return result
    }
}