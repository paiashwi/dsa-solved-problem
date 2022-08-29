8REVERSE ORDER IN ARRAY

Type1:User input

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   int a[]=new int[5];
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter a array");
	   for(int i=0;i<a.length;i++){
	       a[i]=s.nextInt();
	       }
	        System.out.println("array element is");
	       for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]+"");
            } 
	       System.out.println("array element in reverse is");
	       for(int i=a.length-1;i>=0;i--)
            {
                System.out.println(a[i]+"");
            } 
	   }
}


Type:2 without user giving input

import java.util.Scanner;

public class Main{
    public static void main(String argc[])
    {
        int i=0;
        int a[]={10,20,30,40,50};
       
        System.out.println("ARRAY IS:");
        for(i=0;i<a.length;i++){
            System.out.println(a[i]+"");
        }
        System.out.println("REVERSE ARRAY IS:");
        for(i=a.length-1;i>=0;i--)
        {
        System.out.println(a[i]+"");
    }
}
}
