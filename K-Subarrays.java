/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main{
	
	
	 public static boolean isPrime(int num){
	        
	        if(num==0||num==1)
	            return false;
	           
	        for(int i=2;i<=num/2;i++){
	            if(num%i==0)
	                return false;
	        }
	        
	        return true;
	    }
	 
	 public static long gcd(long a, long b)
	    {
		 
		 if(b==0)
			 return a;
		 else
	        return gcd(b, a%b);
	    }
	 
	 
	public static String solve(long a[],long n,long k) {
	
		long G=0;
		long cnt=0;
		long g=0;
		
		for(int i=0;i<n;i++) {
			G=gcd(G,a[i]);
		}
		
		for(int i=0;i<n;i++) {
			g=gcd(g,a[i]);
			if(g==G) {
				cnt++;
			    g=0;
			}
			if(cnt==k)
				break;
		}
		
		//System.out.println(cnt);
		if(cnt==k)
			return "YES";
		else
		   return "NO";    
	 }
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0) {
			
		long n=sc.nextLong();
		long k=sc.nextLong();
		long[] arr=new long[(int) n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
		}
			
		System.out.println(solve(arr,n,k));
      
    
      
   }
		
	}

}
	
	
