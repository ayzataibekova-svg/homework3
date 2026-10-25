import java.util.Scanner;
public class TaskM {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=0;
        for(int i=0;i<a;i++){
            int c=in.nextInt();
            if (c==0) {
                b++;

            }
        }
        System.out.println(b);
    }
}
