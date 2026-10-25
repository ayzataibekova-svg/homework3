import java.util.Scanner;
public class TaskR {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        int e=in.nextInt();
        int f=0;
        for(int i=0;i<1000;i++){
                if(i!=e& a*i*i*i+b*i*i+c*i+d==0) {
                    f++;


                }
        }
        System.out.println( f);

    }
}
