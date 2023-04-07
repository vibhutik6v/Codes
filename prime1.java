


import java.util.*;


public class prime1 {
   public static void main(String[] args)
   {
      int num, i,temp=0;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = sc.nextInt();
     
      
      for(i=1; i<num; i++)
      {
         if(num%i == 0)
         {
            temp++;
            break;
         }
      }
      
      if(temp==0)
         System.out.println("\n Prime Number");
      else
         System.out.println("\n not Prime Number");
    }

    
}
