package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] array1 = {"Yes","no","maybe","positive","negative","confirm"};
    	int x =_01_LinearSearch.linearSearch(array1, "positive");
        assertEquals(3, x);
        
        String[] array2 = {"Bob","Joe","John","Joeseph","Mike","Kyle", "Harry"};
    	int y=_01_LinearSearch.linearSearch(array2, "Mike");
        assertEquals(4, y);
        
        String[] array3 = {"Red","Blue","Green","Yellow","Orange","White", "Black"};
    	int z=_01_LinearSearch.linearSearch(array3, "Black");
        assertEquals(6, z);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] array1 = {12,34,56,78,90,12, 114};
    	int y=_02_BinarySearch.binarySearch(array1,1,200, 34);
        assertEquals(1, y);
    	
 
    }
}
