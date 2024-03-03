class Parralepiped(var dlina1: Float, var dlina2: Float, var dlina3: Float):Figure() {
    override fun countP(): Float {
        val result = 4 * (dlina1 + dlina2 + dlina3)
        return  result
    }

    override fun countS(): Float {
        var result = 2 * (dlina1*dlina2 + dlina2*dlina3 + dlina1*dlina3)
        return result
    }
}