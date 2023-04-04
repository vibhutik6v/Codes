
import java.util.*;







public class string {
    public static void main(String[]args){
        /* 
        String a="vibhuti";
        String b="kumar";
        String c=a+b;
        System.out.println(c.length());
        for(int i=0;i<c.length();i++){
            System.out.println(c.charAt(i));
        }
        */
        
        String s="vibhuti";
        int x=s.length();
        String rev=" ";
        for(int i=x-1;i>=0;i--){
            rev+=s.charAt(i);
            
        }
        System.out.print(rev);
    }
    
    
    }

