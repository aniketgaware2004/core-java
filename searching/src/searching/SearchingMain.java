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
	//binary search through recurssion.
	public static int recBinarySearch(int [] arr, int left, int right, int key){
		int index;
		int mid=(left+right)/2;
		if(right<left)
			return -1;
		if(key==arr[mid])
			return mid;
		if(key< arr[mid])
			index=recBinarySearch(arr,left,mid-1,key);
		else
			index=recBinarySearch(arr,mid+1,right,key);
		return index;
		
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
		
		index=recBinarySearch(arr,0,arr.length-1,key);
		if(index!=-1)
			System.out.println("key found at index: "+index);
		else
			System.out.println("key not found");
		
	}

}
