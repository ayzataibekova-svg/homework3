import java.util.Scanner;
public class TaskC{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        for (int i=a;i<=b;i++){
            int s = (int) Math.sqrt(i);
            if (s * s == i) {
                     System.out.print(i + " ");

            }
        }
    }
}