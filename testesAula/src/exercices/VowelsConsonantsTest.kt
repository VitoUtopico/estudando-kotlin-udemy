package exercices

import org.junit.Assert
import org.junit.Test

class VowelsConsonantsTest {

    @Test fun countVowels() = Assert.assertEquals(5, "Banana boats")

    @Test fun countConsonants() = Assert.assertEquals(6, "Banana boats")
}