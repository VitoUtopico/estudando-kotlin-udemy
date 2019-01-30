package exercices

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {

    @Test fun reverseUsingSB(){

        Assert.assertEquals("?êcov iav omoc iO",reverseUsingSB("Oi como vai você?"))

    }

    @Test fun reverseUsingLoop(){

        Assert.assertEquals("arbac ed ép arbadaC", reverseUsingLoop("Cadabra pé de cabra"))

    }
}