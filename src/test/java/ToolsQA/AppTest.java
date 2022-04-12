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

    @DisplayName("Test get Q1")
    @Test
    public void testGet() {
        assertEquals("Q1", classifica.result(0.1,0.1));
    }
}
