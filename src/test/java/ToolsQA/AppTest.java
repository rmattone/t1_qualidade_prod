package ToolsQA;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    Classifica classifica = new Classifica();

    @DisplayName("Test get Origem")
    @Test
    public void testGet() {
        assertEquals("Origem", classifica.result(0.0,0.0));
    }

    @DisplayName("Test get Q4")
    @Test
    public void testGet() {
        assertEquals("Q4", classifica.result(4.5,-2.2));
    }
}
