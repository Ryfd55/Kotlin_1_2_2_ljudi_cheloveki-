fun main() {
    println("Введите количество лайков:")
    val likes: Int =
        readLine()!!.toInt()
val res = getCheloveki(likes)
        print("Понравилось $likes $res")
}

fun getCheloveki (amount: Int): String= if (amount%10 == 1)
    "человеку"
    else  "человекам"
