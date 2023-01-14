fun main() {
    println("Введите количество лайков:")
    val likes: Int =
        readLine()!!.toInt()
    val res = getCheloveki(likes)
    print("Понравилось $likes $res")
}

fun getCheloveki(amount: Int): String {
    var am1 = amount
    var count = 0
    for (i in 1..2) {
        am1 %= 10
        if (am1 != 1)
            break else
            count++
        am1 = amount / 10
    }
    return if (count == 2) {
        "человекам"
    } else {
        if (amount % 10 == 1)
            "человеку"
        else "человекам"
    }
}

