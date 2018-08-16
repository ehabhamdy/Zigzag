import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void edgeCaseTest() {
        assertEquals("No Matching",Main.convert("EHAB", 4), "EHAB");
        assertEquals("No Matching",Main.convert("", 4), "");
        assertEquals("No Matching",Main.convert("PAYPAL", 0), "PAYPAL");

    }

    @Test
    public void commonCaseTest(){
        assertEquals("No Matching",Main.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
        assertEquals("No Matching ",Main.convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
        assertEquals("No Matching ",Main.convert("EHAB", 2), "EAHB");
    }
}