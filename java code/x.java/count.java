
//package com.vibhuti ;

import java.util.*;

public class count {
    
    public static void main(String[]args)
   {
        Scanner sc = new Scanner(System.in);
      
    int n=sc.nextInt();
    int count=0;
    while(n>0){
        n=n/10;
        count=count+1;

    }
    System.out.print(count);

    }
    
}
