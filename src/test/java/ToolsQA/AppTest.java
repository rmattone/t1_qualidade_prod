package ToolsQA;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    Classifica classifica = new Classifica();

    @DisplayName("Test get Origem")
    @Test
    public void testGetOrigem() {
        assertEquals("Origem", classifica.result(0.0,0.0));
    }

    @DisplayName("Test get Q1")
    @Test
    public void testGetQ1() {
        assertEquals("Q1", classifica.result(0.1, 0.1));
    }
    
    @DisplayName("Test get Q4")
    @Test
    public void testGetQ4() {
        assertEquals("Q4", classifica.result(4.5,-2.2));
    }
}
