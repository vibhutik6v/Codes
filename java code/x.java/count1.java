import java.util.Scanner;
public class count1 {
    /* 
    public static void main(String[]args){
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();


        
        System.out.println(a,n);

    }
    
    }
}
*/




    public static int countDigits(int[] a,int n){
        int count=0;boolean isDistinct=true;
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(a[i]==a[j]){
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct==true){
                count++;
            }
            isDistinct=true;
        }
        return count;
    }


    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.print(countDigits(a,n));
    }
}
















