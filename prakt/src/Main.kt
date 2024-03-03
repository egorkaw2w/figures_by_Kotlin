fun main() {
    while (true) {


        print(
            """Приветствую тебя, давай считать фигуры
      |Выбирай фигуру:
      |1. Треугольник          |5.Круг
      |2.Параллелограмм        |6.Трапеция
      |3.Параллелипипед        |7.Ромб
      |4.Квадрат               |8.Прямоугольник
      |       Нажмите Escape для выхода ( не сделано)
      |Введите цифру: 
  """.trimMargin()
        );
        val choice = readln().toInt()
        when (choice) {
            1 -> {
                println(Treugolnik(readln()!!.toFloat(),readln()!!.toFloat(),readln()!!.toFloat()).countP())
                println(Treugolnik(readln()!!.toFloat(), readln()!!.toFloat() ,0.0F).countS())

            }
            2 -> {
                println(Parralelorgramm(readln()!!.toFloat(), readln()!!.toFloat()).countP())
                println(Parralelorgramm(readln()!!.toFloat(), readln()!!.toFloat()).countS())
            }
            3 -> {
                println(Parralepiped(readln()!!.toFloat(), readln()!!.toFloat(), readln()!!.toFloat()).countP())
                println(Parralepiped(readln()!!.toFloat(), readln()!!.toFloat(), readln()!!.toFloat()).countS())
            }
            4 -> {
                println(Kvadrat(readln()!!.toFloat()).countP())
                println(Kvadrat(readln()!!.toFloat()).countS())
            }
            5 -> {
                println(Crug(readln()!!.toFloat()).countP())
                println(Crug(readln()!!.toFloat()).countS())
            }
            6 -> {
                println(Trapecia(readln()!!.toFloat(),readln()!!.toFloat(),readln()!!.toFloat(),readln()!!.toFloat()).countP())
                println(Trapecia(readln()!!.toFloat(),readln()!!.toFloat(),readln()!!.toFloat(), 0.0F).countS())
            }
            7 -> {
                println(Romb(readln()!!.toFloat(), 0.0F).countP())
                println(Romb(readln()!!.toFloat(), readln()!!.toFloat()).countP())
            }
            8 -> {
                println(Pryamougolnik(readln()!!.toFloat(), readln()!!.toFloat()).countP())
                println(Pryamougolnik(readln()!!.toFloat(), readln()!!.toFloat()).countS())
            }
            27 ->{
                break
            }
        }

    }
}