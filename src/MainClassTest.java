import org.junit.Test;

import java.util.Locale;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {
        String s = this.getClassString();

        if (s.contains("hello")^s.contains("Hello")) {
            System.out.println("Word found");
        } else {
            System.out.println("Word not found");
        }
    }
}
