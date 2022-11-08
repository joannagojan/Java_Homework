import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class AssignmentNoTwoTest {

    @Test
    public void testThreeEqualNumbers() {
        int a = 1, b = 1, c = 1;
        int[] sorted = new ThreeNumberSorter(a, b, c).sort();
        int[] expected = {1, 1, 1};
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testTwoEqualNumbers() {
        int a = 3, b = 1, c = 3;
        int[] sorted = new ThreeNumberSorter(a, b, c).sort();
        int[] expected = {1, 3, 3};
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testThreeDifferentNumbers() {
        int a = 3, b = 1, c = 2;
        int[] sorted = new ThreeNumberSorter(a, b, c).sort();
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, sorted);
    }
}