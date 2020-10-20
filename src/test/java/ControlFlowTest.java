import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControlFlowTest {
    ControlFlow instance;

    @BeforeEach
    void setUp(){

    }

    @Test
    void myMethodTest(){
         instance = new ControlFlow();
        String expected = "true";
        String actual = instance.myMethod(2);
        assertEquals(expected, actual);

    }

    @Test
    void switchMethodTest(){
         instance = new ControlFlow();
        String actual =instance.switchMethod(3);
        assertEquals("thats four", actual);
    }
    @Test
    void forMethodTest(){
        instance = new ControlFlow();
        String actual = instance.forMethod();

    }
}
