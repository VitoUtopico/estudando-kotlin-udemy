package testePackage

import java.util.*

fun Bananada (fruta: String): String{
    if (fruta == "banana"){
        return "bananadas infinitas"
    }
    return "Não conheço essa fruta"
}



fun main(args: Array<String>) {

    val calendar: Calendar = Calendar.getInstance()
    println("${calendar.get(Calendar.DAY_OF_WEEK)}_${calendar.get(Calendar.DAY_OF_MONTH)}/${calendar.get(Calendar.MONTH)}/${calendar.get(Calendar.YEAR)}")
}