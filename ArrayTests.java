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
  public void testReversedMine(){
    int [] input1={1,2,3,4};
    assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(input1));

  }

  @Test
  public void testReversedInPlace(){
    //Changes the input array to be in reversed order
    int [] input1={1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,2,1}, input1);

  }


@Test
public void testAverageWithoutLowest(){
// Averages the numbers in the array (takes the mean), but leaves out the
// lowest number when calculating. Returns 0 if there are no elements or just
// 1 element in the array

double[] test2 = {0,5,5,5};
//output=5
double result=ArrayExamples.averageWithoutLowest(test2);
assertEquals(5,result,0.001 );
double[] test3 = {};
double result1=ArrayExamples.averageWithoutLowest(test3);
assertEquals(0,result1,0.001 );
double[] test4 = {8};
double result2=ArrayExamples.averageWithoutLowest(test4);
assertEquals(0,result2,0.001 );
double[] test5 = {1,1,2,2};
double result3=ArrayExamples.averageWithoutLowest(test5);
assertEquals(2,result3,0.001 );

}

  
}
