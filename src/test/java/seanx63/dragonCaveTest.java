package seanx63;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.Test;

public class dragonCaveTest {
    @Test
    public void testInputs() {
        assertEquals(1, dragonCave.inputProcess(new Scanner("1"))); // Check that inputs correspond to the correct caves 
        assertEquals(1, dragonCave.inputProcess(new Scanner("one")));
        assertEquals(1, dragonCave.inputProcess(new Scanner("One")));
        assertEquals(2, dragonCave.inputProcess(new Scanner("2")));
        assertEquals(2, dragonCave.inputProcess(new Scanner("two")));
        assertEquals(2, dragonCave.inputProcess(new Scanner("Two")));
    }
}
        