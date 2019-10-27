import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double x=0;
        for (double i=1;i<=n;i++){
            x+=1/((2*i-1)*(2*i));
        }
        System.out.println(x);
        }
    }

