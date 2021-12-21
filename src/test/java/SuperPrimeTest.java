import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SuperPrimeTest {
    private SuperPrime superprime;
    @Before
    public void setup(){
        superprime = new SuperPrime();
    }
    @Test
    public void test1_31(){
        int[] test = superprime.analizeSuperPrime(1,31);
        assertEquals(3,test[0]);
        assertEquals(61,test[1]);


    }
    @Test
    public void test2_100(){
        int[] test = superprime.analizeSuperPrime(2,100);
        assertEquals(8,test[0]);
        assertEquals(418,test[1]);


    }
    @Test
    public void test9900_10000(){
        int[] test = superprime.analizeSuperPrime(9900,10000);
        assertEquals(4,test[0]);
        assertEquals(39762,test[1]);


    }
    @Test
    public void test501_599(){
        int[] test1 = superprime.analizeSuperPrime(501,599);
        assertEquals(0,test1[0]);
        assertEquals(0,test1[1]);


    }
}
