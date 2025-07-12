package sorting;
import java.util.*;
public class MoreImpBubbleSort {
	public static void moreImpbubblesort(int[] arr) {
		boolean swapflag=false;
		//n-1 passses
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]> arr[j+1]) {
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					swapflag= true;
				}
			}
			if(!swapflag)  
				break;
		}
		
		public static void insertionSort(int [] arr) {
			//n-1 passes
			for(int  i=1; i< arr.length ; i++) {
				//COPY LAST ELEMENT INTO TEMP VARIABLE
				int j, temp=arr[i];
				for( j=i-1; j>=0 && arr[j]> temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1]= temp;
			}
		}
	
		
		public static void main(String[] args) {
			int [] arr= {6,4,2,8,3,1};
			System.out.println("Before:"+Arrays.toString(arr));
			//moreImpbubblesort(arr);
			//System.out.println("After:"+Arrays.toString(arr));
			
			insertionSort(arr);										
			System.out.println("After:"+Arrays.toString(arr));
			
		}

}
