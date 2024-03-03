public class Crug(var dlina1: Float): Figure() {
    override fun countP(): Float {
        var result = 2 * pi * dlina1
        return result
    }

    override fun countS(): Float {
        var result = pi * (dlina1 * dlina1)
        return result
    }


}