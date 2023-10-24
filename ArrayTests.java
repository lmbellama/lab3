import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlaceMine(){
    int[] before = {1,2,3};
    int[] after = {3,2,1};
    assertArrayEquals(after, ArrayExamples.reversed(before));
  }

  @Test
  public void testReversedMine(){
    int[] before = {1,2,3};
    int[] after = {3,2,1};
    assertArrayEquals(after, ArrayExamples.reversed(before));
  }
}
