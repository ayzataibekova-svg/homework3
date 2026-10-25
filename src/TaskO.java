import java.util.Scanner;
public class TaskO {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int b=in.nextInt();
        boolean a=false;
        for(int i=0;i<b;i++) {
            int c = in.nextInt();
            if (c == 0) {
                a = true;
            }
        }
            if (a) {
                System.out.println("Yes");
            }
            else{
                System.out.println("False");
            }

    }
}
