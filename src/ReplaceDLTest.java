import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceDLTest {
    ReplaceDL object;

    @Before
    public void setUp() throws Exception {
        object = new ReplaceDL();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void replaceCharacter() {
        String[] input = {"daily", "dry"};
        String[] expected = {"faity", "fry"};
        assertEquals(expected, object.replaceCharacter(input));
    }

    @Test
    public void replaceCharacter2() {
        String[] input = {"dairy", "lady"};
        String[] expected = {"fairy", "tafy"};
        assertEquals(expected, object.replaceCharacter(input));
    }
}