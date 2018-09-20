import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString object;
    @Before
    public void setUp() throws Exception {
        object=new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
    object=null;
    }

    @Test
    public void reverseString() {
        String input=new String("a quick brown fox jumps over the lazy dog");
        String expectedOutput=new String("a kciuq nworb xof spmuj revo eht yzal god");
       assertEquals(expectedOutput,object.removeChar(input));
    }

    @Test
    public void reverseString2() {
        String input=new String("a lazy guy will find a shortcut to solution");
        String expectedOutput=new String("a yzal yug lliw dnif a tuctrohs ot noitulos");
        assertEquals(expectedOutput,object.removeChar(input));
    }
}