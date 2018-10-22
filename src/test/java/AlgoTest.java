package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {

	SortDemoData data = new SortDemoData();
	
	public boolean isArraySorted(Item[] incomingArray) {
		boolean isSorted = false;
		if(incomingArray.length == 1) {
			isSorted = true;
			return isSorted;
		}
		for(int i=0;i<incomingArray.length-1;i++) {
			if(incomingArray[i+1].key >= incomingArray[i].key) {
				isSorted = true;
			}else {
				isSorted = false;
				break;
			}
		}
		
		return isSorted;
	}

	@Test
	public void IfArrayisSorted() {    
		
			//This test case covers 100% of the lines in the code. So this will be the Node Coverage test case
		    data.initializeArray("10 5 8 3 25 15");  
		    
		    Item[] unsortedArray = new Item[data.myArray.length];
			System.arraycopy(data.myArray, 0, unsortedArray, 0, data.myArray.length);
					   
			//Bubble sort
		    SortAlgos.bubbleSort(data.myArray);
		    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
		    assertFalse("...Previous Array must be unsorted...",isArraySorted(unsortedArray));	
		    
		    //Selection sort
			System.arraycopy(unsortedArray, 0, data.myArray, 0, unsortedArray.length);
			SortAlgos.selectionSort(data.myArray);
		    assertTrue("...Array must be sorted after selection sort...",isArraySorted(data.myArray));
		    assertFalse("...Previous Array must be unsorted...",isArraySorted(unsortedArray));	
		    
		    //Insertion sort
			System.arraycopy(unsortedArray, 0, data.myArray, 0, unsortedArray.length);
			SortAlgos.insertionSort(data.myArray);
			assertTrue("...Array must be sorted after insertion sort...",isArraySorted(data.myArray));
			assertFalse("...Previous Array must be unsorted...",isArraySorted(unsortedArray));
			
			//Merge sort
			System.arraycopy(unsortedArray, 0, data.myArray, 0, unsortedArray.length);
			SortAlgos.mergeSort(data.myArray);
			assertTrue("...Array must be sorted after merge sort...",isArraySorted(data.myArray));
			assertFalse("...Previous Array must be unsorted...",isArraySorted(unsortedArray));
			
			//Quick Sort
			System.arraycopy(unsortedArray, 0, data.myArray, 0, unsortedArray.length);
			SortAlgos.quickSort(data.myArray);
			assertTrue("...Array must be sorted after quick sort...",isArraySorted(data.myArray));
			assertFalse("...Previous Array must be unsorted...",isArraySorted(unsortedArray));


			//Heap Sort
			System.arraycopy(unsortedArray, 0, data.myArray, 0, unsortedArray.length);
			SortAlgos.heapSort(data.myArray);
			assertTrue("...Array must be sorted after heap sort...",isArraySorted(data.myArray));
			assertFalse("...Previous Array must be unsorted...",isArraySorted(unsortedArray));
			
	}
	
	@Test
	public void IfSortingWorksWithDuplicates() {
		 	data.initializeArray("10 5 8 3 25 15 8 3");  
		    
		    Item[] unsortedArray = new Item[data.myArray.length];
			System.arraycopy(data.myArray, 0, unsortedArray, 0, data.myArray.length);
			
			//Node Coverage and Edge Coverage
		    SortAlgos.bubbleSort(data.myArray);
		    
		    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
		    assertFalse("...Previous Array must be unsorted...",isArraySorted(unsortedArray));
	}
	
	@Test
	public void IfSortingWorksForSingleElement() {
		data.initializeArray("5");  
			    
		//Conditional Coverage and Edge Coverage
	    SortAlgos.bubbleSort(data.myArray);
	    
	    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
	}
	
	@Test
	public void IfSortingWorksForTwoElements() {
		data.initializeArray("100 5");  
	    
	    Item[] unsortedArray = new Item[data.myArray.length];
		System.arraycopy(data.myArray, 0, unsortedArray, 0, data.myArray.length);
			    
		//Conditional Coverage and Edge Coverage
	    SortAlgos.bubbleSort(data.myArray);
	    
	    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
	    assertFalse("...Previous Array must be unsorted...",isArraySorted(unsortedArray));

		data.initializeArray("5 100");  
		//Conditional Coverage and Edge Coverage
	    SortAlgos.bubbleSort(data.myArray);
	    
	    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));

	}
	
	@Test
	public void IfSortingWorksForNegativeNumbers() {
		data.initializeArray("-2 -4 -1 -23 -10 -6");  
	    
	    Item[] unsortedArray = new Item[data.myArray.length];
		System.arraycopy(data.myArray, 0, unsortedArray, 0, data.myArray.length);
		
		//Path Coverage and Edge Coverage
	    SortAlgos.bubbleSort(data.myArray);
	    
	    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
	    assertFalse("...Previous Array must be unsorted...",isArraySorted(unsortedArray));
	}
	
	@Test 
	public void IfSortingWorksForBothPositiveAndNegative() {
		data.initializeArray("-2 -4 1 23 -10 6");  
	    
	    Item[] unsortedArray = new Item[data.myArray.length];
		System.arraycopy(data.myArray, 0, unsortedArray, 0, data.myArray.length);
		
		//Path and Edge Coverage
	    SortAlgos.bubbleSort(data.myArray);
	    
	    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
	    assertFalse("...Previous Array must be unsorted...",isArraySorted(unsortedArray));
	} 
	
	@Test (expected=java.lang.NullPointerException.class)
	public void IfSortingWorksForNullArray() {
		//Edge Coverage
		SortAlgos.bubbleSort(null);	
	}

}
