
import java.util.Scanner;
public class TaskS {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int c=0;
        for(int i=0;i<=a;i++) {
            for (int j=0;j<i && c<a;j++) {
                System.out.print(i+" ");
                c++;
            }
        }
    }
}
