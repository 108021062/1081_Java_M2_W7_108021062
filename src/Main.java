import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x,y;
        x=n;
        y=n-1;
        for (int i=1;i<y;y--){
            x*=y;
        }
        System.out.println(x);
        }
    }

