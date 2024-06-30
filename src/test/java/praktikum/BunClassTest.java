package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunClassTest {
    @Test
    public void testGetName() {
        Bun bun = new Bun("Cinnamon Bun", 2.5f);
        assertEquals("Cinnamon Bun", bun.getName());
    }

    @Test
    public void testGetPrice() {
        Bun bun = new Bun("Cinnamon Bun", 2.5f);
        assertEquals(2.5f, bun.getPrice(), 0.001); // Проверка с погрешностью 0.001 из-за работы с float
    }
}
