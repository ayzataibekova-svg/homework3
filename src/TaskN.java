import java.util.Scanner;
public class TaskN {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=0;
        int d=0;
        int e=0;
        for(int i=0;i<a;i++){
            int c=in.nextInt();
            if(c==0){
                b++;
            }
            if(c>0){
                d++;
            }
            if(c<0){
                e++;
            }
        }
        System.out.println(b +" "+ d +" "+ e);
    }
}
