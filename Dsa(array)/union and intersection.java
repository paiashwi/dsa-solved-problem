import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	   
	Scanner s=new Scanner(System.in);
	int a[]=new int[5];
    int b[]=new int[3];
    
  System.out.println("array 1");
     for(int i=0;i<a.length;i++)
    {
      a[i]=s.nextInt();  
    }
    System.out.println("array 2");
    for(int i=0;i<b.length;i++)
    {
      b[i]=s.nextInt();  
    }
    HashSet<Integer>h=new HashSet();
    for(int i=0;i<a.length;i++)
    {
        h.add(a[i]);
    }
    for(int i=0;i<b.length;i++)
    {
        h.add(b[i]);
    }
    System.out.println("union of array"+h+"\n");
    
    HashSet<Integer>h1=new HashSet();
     System.out.println("Intersection of array ");
     
    for(int i=0;i<a.length;i++)
    {
        h1.add(a[i]);
    }
     for(int i=0;i<b.length;i++) 
     {
         if(h1.contains(b[i]))
         {
               System.out.println(""+b[i]);
         }
     }
}
}
