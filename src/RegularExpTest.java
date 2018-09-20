import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpTest {
    RegularExp object;
    @Before
    public void setUp() throws Exception {
        object=new RegularExp();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void checkRegEx() {
        boolean expected=true;
        String input="This is Harry";
        assertEquals(expected,object.checkRegEx(input));
    }

    @Test
    public void checkRegEx2() {
        boolean expected=false;
        String input="This is Henry";
        assertEquals(expected,object.checkRegEx(input));
    }
}