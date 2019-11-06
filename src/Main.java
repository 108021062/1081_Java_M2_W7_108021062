import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       long x=sc.nextLong();
       int sum=0;int a=0;
       while (x>0) {
           a++;
           sum += x % 10;
           x = x / 10;
       }
        System.out.println(a);
        System.out.println(sum);
       }
    }

