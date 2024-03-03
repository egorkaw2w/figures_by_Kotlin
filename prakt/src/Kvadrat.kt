class Kvadrat(var dlina1:Float):Figure() {
    override fun countP(): Float {
        return dlina1 *4
    }

    override fun countS(): Float {
        return dlina1* dlina1
    }
}