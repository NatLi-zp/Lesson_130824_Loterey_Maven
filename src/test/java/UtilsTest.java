import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    int[] array;
    int[] array2;
    int num;

    @BeforeEach
    void init() {
        array = new int[]{1, 2, 3, 4, 5};
        array2 = new int[]{11, 12, 13, 3, 15};
        num = 3;
        System.out.println("Before each test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test");
    }

    @Test
    void getLuckyArrayEqualsTest() {
        assertEquals(array.length, Utils.getLuckyArray().length);
    }

    @Test
    void isNumInArrayTest() {
        assertTrue(Utils.isNumInArray(array, num));
    }

    @Test
    void winNums() {
        assertEquals(1,Utils.winNums(array, array2));
    }

}