import java.io.*;

import java.util.*;
public class sort {

   /*  static void fun(int n){
        if(n==0)
        return;
        fun(n-1);
        System.out.println(n);
        fun(n-1);
        }
    public static void mian(String[] args){
        
        fun(3);
    }
    }
    */


	
/*static void fun(int n)
{
    if(n == 0)
        return;

    fun(n - 1);

    System.out.println(n);
    
    fun(n - 1);
}
public static void main(String [] args) 
{
    fun(3);
}

}
*/
static void fun(int n)
{
    if(n == 0)
        return;

    System.out.print(n+" ");

    fun(n - 1);

    System.out.print(n+" ");
}
public static void main(String [] args) 
{
    fun(3);
}

}