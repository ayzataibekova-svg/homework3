import java.util.Scanner;
public class TaskI {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                b++;
                System.out.print(b);
            }
        }
    }
}
