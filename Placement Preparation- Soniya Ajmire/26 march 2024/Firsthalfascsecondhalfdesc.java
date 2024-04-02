import java.util.*;

class Firsthalfascsecondhalfdesc
{
   static void printOrder(int[] a, int n)
   {
     int temp;
     for(int i=0;i < n-1;i++)
     {
        for(int j = 0;j < n/2; j++) { if(a[j]>a[j+1])
            {
              temp=a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
            }
        }

        for(int j = n/2;j < n-1; j++)
        {
            if(a[j] < a[j+1])
            {
               temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
            }
         }
      }

      for(int i = 0; i < n; i++)
         System.out.print(a[i] + " ");

   }
   public static void main(String[] args)
   {
       int[] arr = {5,7,9,6,8,3,4,25};
       int n = arr.length;
       printOrder(arr, n);
    }
}