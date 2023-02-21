package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MainTest {

    public static final String welcomeText = "Welcome to the DNTP at Murex";
    @Test
    void checkWelcomeText() {
        Main mainProgram = new Main();
        assertEquals(welcomeText, mainProgram.getWelcomeText());
    }
}