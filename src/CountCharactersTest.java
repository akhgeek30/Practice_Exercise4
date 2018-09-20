import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharactersTest {
    CountCharacters object;
    @Before
    public void setUp() throws Exception {
        object=new CountCharacters();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void countChar() {
        String input="asdfasdfasdfasdfasdfasdfasdf";
        int expected=7;
        assertEquals(expected,object.countChar(input,'a'));
    }
    @Test
    public void countChar1() {
        String input="Java is java again java again";
        int expected=10;
        assertEquals(expected,object.countChar(input,'a'));
    }
}