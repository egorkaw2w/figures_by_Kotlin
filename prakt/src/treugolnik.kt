class Treugolnik(var dlina1: Float, var dlina2: Float, var dlina3: Float):Figure() {
    override fun countP(): Float {
        val result = dlina1 + dlina2 + dlina3
        return result
    }

    override fun countS(): Float {
        val result = 0.5 * (dlina1 * dlina2)
        return result.toFloat()
    }
}