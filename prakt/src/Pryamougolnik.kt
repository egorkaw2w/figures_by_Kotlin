class Pryamougolnik(var dlina1:Float,var dlina2:Float):Figure() {
    override fun countP(): Float {
        return (dlina1 + dlina2) * 2
    }

    override fun countS(): Float {
        return dlina1 * dlina2
    }
}