import java.util.Scanner;
public class TaskQ {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        for (int i=1000;i>=0;i--){
            if(a*i*i*i+b*i*i+c*i+d==0){
                System.out.println(i+" ");
            }
        }
    }
}
