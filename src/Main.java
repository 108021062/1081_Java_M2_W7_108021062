import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        for (int a=2;a<=x;a++){
            int b=a;
            while (b%2==0){
                b/=2;
            }
            while (b%3==0){
                b/=3;
            }
            while (b%5==0){
                b/=5;
            }
            if (b==1){
                sum=sum+a;
            }
        }
        System.out.println(sum);
    }
}
