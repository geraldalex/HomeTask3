import java.util.Scanner;

public class dz5 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3!=0)
            System.out.println("Число " + a + " нацело на три не делится. ");
    }
}
