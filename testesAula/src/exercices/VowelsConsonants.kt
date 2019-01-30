package exercices

fun countVowels(phrase: String): Int{
    val VOWELS = "aeiou"
    var totalVowels = 0

    for (letter in phrase){
        if (letter.toLowerCase() in VOWELS) totalVowels++
    }
    return totalVowels
}

fun countConsonants(phrase: String): Int {

    val VOWELS = "aeiou \n"
    var totalConsonants = 0
    for (letter in phrase) {
        if (letter.toLowerCase() in VOWELS) {
        }
        else {
            totalConsonants++
        }
    }
    return totalConsonants
}