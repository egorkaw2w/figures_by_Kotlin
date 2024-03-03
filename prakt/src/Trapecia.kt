class Trapecia(var dlina1:Float,var dlina2:Float, var dlina3:Float,var dlina4:Float):Figure() {
    override fun countP(): Float {
        return dlina1 +dlina2 + dlina3+ dlina4
    }

    override fun countS(): Float {
        return ((dlina1 + dlina2)/ 2) * dlina3
    }
}