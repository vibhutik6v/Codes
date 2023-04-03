public class switchx {
   // public class Switch {
    
        public static void main(String[] args) {
            int x=0,y=0;
            System.out.println("Entre a move");
Scanner sc =new Scanner (System.in);
char move =sc.next.charAt(0);
switch(move){
    case'L':
    x--;
    break;
    case'R':
    x++;
    break;
    case'U':
    y++;
    break;
    case'D':
    y--;
    break;
    default:
    System.out.println("Invalid");
}
        
}
}
