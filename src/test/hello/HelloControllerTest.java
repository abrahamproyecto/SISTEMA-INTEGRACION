package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloControllerTest {

        @Test
        public void test(){
            HelloController hc = new HelloController();
            hc.index();
            assertTrue(true);
        }
}
