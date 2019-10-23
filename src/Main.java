import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum =0;
        for(int i =3;i <=n;i+=3){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
