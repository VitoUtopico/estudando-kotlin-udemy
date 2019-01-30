package exercices

fun reverseUsingSB(str: String) =  StringBuilder(str).reverse().toString()

fun reverseUsingLoop(phrase: String): String{

    var inverted = StringBuilder()
    var max = phrase.length - 1

    for (i in max downTo 0){
        inverted.append(phrase[i])
    }
    return inverted.toString()
}