import java.util.Scanner;
public class TaskK {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=0;
        int c=in.nextInt();
        for (int i=0;i<c;i++) {
            int b = in.nextInt();
            a += b;
        }
        System.out.println(a);
    }
}
