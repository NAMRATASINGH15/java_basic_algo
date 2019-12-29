package search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class interpolationSearch {
	public static List<Integer> sort(List<Integer> a,int n){
	      
	       for (int i = 0; i < n-1; i++) { 
	            for (int j = 0; j < n-i-1; j++) { 
	                if (a.get(j) > a.get(j+1)) 
	                { 
	                	int temp1 =a.get(j+1);
	                	a.set(j+1, a.get(j));
	                	a.set(j, temp1);
	                } 
	            }
	        }
	       System.out.println("array has been shorted");
		return a;
	}
	
	public static int rank(int key,List<Integer> a,int hi) {
		int lo =0;
		hi = hi -1;
	
		
		while (lo <= hi && key >= a.get(lo) && a.get(hi)<= key) {
			if(hi==lo) {
				if(a.get(hi)==key) {
					return a.get(hi);
				}
				return -1;
			}
		int mid= lo + (((hi - lo) / 
	            (a.get(hi) - a.get(lo))) * (key - a.get(lo)));
		
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
		for(int i = 0 ;i<num;i++) {
			in1 = input.nextInt();
			arr1.add(in1);
		}
         arr1= sort(arr1,num);
        System.out.println(arr1);
         System.out.println("insert the number to be searched");
		 int key = input.nextInt();
			if(rank(key,arr1,num)<0) {
				System.out.println("number is not present");
			}
			else{
				System.out.println("number is present");
			}
		
		
	}



}
