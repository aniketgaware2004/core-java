package searching;
import java.util.*;
public class SearchingMain {
	public static int LinearSearch(int [] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static int BinarySearch(int []arr, int key) {
		int left=0;
		int right=arr.length-1;
	    while(left<=right) {	
		int mid=(left+right)/2;
		if(key== arr[mid])
			return mid;
		if(key<arr[mid])
			right=mid-1;
		else
			left=mid+1;
	}
	    return -1;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [] arr= {10, 20, 30, 40, 50, 460};
		Arrays.sort(arr);
		System.out.println("enter a key");
		int key= sc.nextInt();
		
		int index =LinearSearch(arr, key);
		if(index!=-1)
			System.out.println("key found at index: "+ index);
		else
			System.out.println("key not found.");
		
	    index=BinarySearch(arr,key);
		if(index!=-1)
			System.out.println("key found at index: "+ index);
		else
			System.out.println("key not found.");
		
	}

}
