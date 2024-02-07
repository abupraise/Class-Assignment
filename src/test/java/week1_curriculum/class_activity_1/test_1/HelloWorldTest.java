package week1_curriculum.class_activity_1.test_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void sayHello() {
            HelloWorld helloWorld = new HelloWorld();
            String actual = helloWorld.sayHello();
            String expected = "Hello World";

            assertEquals(expected, actual);
        }
    }
