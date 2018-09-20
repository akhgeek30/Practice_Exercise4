import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortStringTest {
    SortString object;
    @Before
    public void setUp() throws Exception {
        object=new SortString();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void sorting() {
        String input="this is america";
        String expected="[america, is, this]";
        assertEquals(expected,object.sorting(input));
    }

    @Test
    public void sorting2() {
        String input="lion fox bear bee anaconda";
        String expected="[anaconda, bear, bee, fox, lion]";
        assertEquals(expected,object.sorting(input));
    }
}