Kth element

TYPE 1:

public class Main
{
	public static void main(String[] args) {
	    int a[]={5,8,12,7,6,2,4,11};
	    int i,j,k=4;
		for (i=0;i<a.length-1;i++ ) 
		{
		    for(j=i+1;j<a.length;j++)
		    {
		       if(a[i]<a[j]) 
		       {
		           int temp=a[i];
		           a[i]=a[j];
		           a[j]=temp;
		       }
		    }
		    if(i==k-1)
		    {
		     System.out.println(k+" Maximum Kth element "+a[i]);
		   
		    }
	
		}
		
		for(i=0;i<a.length;i++){
		System.out.println(" Array order "+a[i]);
		}
		for (i=0;i<a.length-1;i++ ) 
	     	{
		
		    for(j=i+1;j<a.length;j++)
		    {
		       if(a[i]>a[j]) 
		       {
		           int temp=a[i];
		           a[i]=a[j];
		           a[j]=temp;
		       }
		    }
		    if(i==k-1)
		    {
		     System.out.println(k+" Minimum Kth element "+a[i]);
		    }
		}
	
		for(i=0;i<a.length;i++){
		System.out.println(" Array order "+a[i]);
	}
}
}


TYPE 2:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a[]=new int[5];
	    int i,j,k=4;
	   
	    Scanner s=new Scanner(System.in);
	    for(i=0;i<a.length;i++)
	    {
	        a[i]=s.nextInt();
	    }
		for (i=0;i<a.length-1;i++ ) 
		{
		    for(j=i+1;j<a.length;j++)
		    {
		       if(a[i]<a[j]) 
		       {
		           int temp=a[i];
		           a[i]=a[j];
		           a[j]=temp;
		       }
		    }
		    if(i==k-1)
		    {
		     System.out.println(k+" Maximum Kth element "+a[i]);
		   
		    }
	
		}
		
		for(i=0;i<a.length;i++){
		System.out.println(" Array order "+a[i]);
		}
		for (i=0;i<a.length-1;i++ ) 
	     	{
		
		    for(j=i+1;j<a.length;j++)
		    {
		       if(a[i]>a[j]) 
		       {
		           int temp=a[i];
		           a[i]=a[j];
		           a[j]=temp;
		       }
		    }
		    if(i==k-1)
		    {
		     System.out.println(k+" Minimum Kth element "+a[i]);
		    }
		}
	
		for(i=0;i<a.length;i++){
		System.out.println(" Array order "+a[i]);
	}
}
}



