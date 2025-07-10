package sorting;
import java.util.*;
public class BubbleSort {
	public static void BubbleSort(int [] arr) {
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1 ;j++ ) {
				 if(arr[j]>arr[j+1]) {
					 int temp= arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
	}
	
	public static void main (String[]args) {
		int [] arr= {6,4,2,8,3,1};
		System.out.println("before"+Arrays.toString(arr));
		BubbleSort(arr);
		System.out.println("After"+Arrays.toString(arr));
	}

}
