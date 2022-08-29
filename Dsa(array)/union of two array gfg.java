class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
       
        //Your code here
       // int a[]=new int[n];
    //    int b[]=new int[m];
        HashSet<Integer>h=new HashSet<>();
         for(int i=0;i<a.length;i++)
         {
             h.add(a[i]);
           
             
         }
         for(int i=0;i<b.length;i++)
         {
             h.add(b[i]);
            
         }
         
        
         return h.size();
    }
   
}
