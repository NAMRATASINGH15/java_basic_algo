package search;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class binarySearch {
	public static List<Integer> sort(List<Integer> a){
		 int n = a.size(); 
	        

	        for (int i = 0; i < n-1; i++) { 
	            for (int j = 0; j < n-i-1; j++) { 
	                if (a.get(j) > a.get(j+1)) 
	                { 
	                	int temp1 =a.get(j+1);
	                	a.set(j+1, a.get(j));
	                	a.set(j, temp1);
	                	
	                	
	                	System.out.println(a.get(j+1));
	                } 
	            }
	        }
		return a;
	}
	public static int rank(int key,List<Integer> a) {
		int lo =0;
		int hi = a.size()-1;
		while (lo <= hi) {
		int mid=lo+(hi-lo)/2;
		if(key<a.get(mid))hi=mid-1;
		else if(key>a.get(mid))lo=mid+1;
		else
		return mid;
		}
		return -1;
	}

	
	public static void main(String[] args) {
		System.out.println("enter the size of arrayr");
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		List<Integer> arr1 = new ArrayList<Integer>();
		System.out.println("insert the array");
		int in1;
		for(int i = 0 ;i<num-1;i++) {
			in1 = input.nextInt();
			arr1.add(in1);
		}
         arr1= sort(arr1);
        System.out.println(arr1);
         System.out.println("insert the number to be searched");
		 int key = input.nextInt();
			if(rank(key,arr1)<0) {
				System.out.println("number is not present");
			}
			else{
				System.out.println("number is present");
			}
		
		
	}

}
