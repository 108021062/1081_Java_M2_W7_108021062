import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=1,y=0;
        for (int i=1;i<=n;i++){
            x*=2;
            y+=x;
        }
        System.out.println(y);
        }
    }

