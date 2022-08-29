import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   
	Scanner s=new Scanner(System.in);
	int a[]=new int[9];
	int left=0,right=a.length-1;
	for(int i=0;i<a.length;i++)
	{
	    a[i]=s.nextInt();
	}
	while(left<=right)
	{
	    if(a[left]<0&&a[right]<0)
	    {
	        left++;
	    }
	    else if(a[left]>0&&a[right]<0)
	    {
	        int temp=a[left];
	        a[left]=a[right];
	        a[right]=temp;
	   
	        left++;
	        right--;
	    }
	    else if(a[left]>0&&a[right]>0)
	    {
	        right--;
	    }
	    else{
	       
	        left++;
	         right--;
	    }
	}
	System.out.println("ELEMENT AFTER NEGATIVE");
	for(int i=0;i<=a.length;i++)
	{
	    System.out.println(""+a[i]);
	}
	
	}
}
