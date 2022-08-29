MAXMUM AND MINIMUM

import java.util.Scanner;

public class Main{
    public static void main(String argc[])
    {
        //int a[]=new int[5];
        int a[]={10,30,60,20,11};
       int  max=a[0],min=a[0];
        for(int i=1;i<a.length;i++)
        {
           if(a[i]>max)
           {
               max=a[i]; 
          }
        }
        
         System.out.println("MAXIMUM NUMBER:"+max);
         
          for(int i=1;i<a.length;i++)
        {
           if(a[i]<min)
           {
               min=a[i]; 
          }
        }
        
         System.out.println("MINIMUM NUMBER:"+min);


        }
        
}
