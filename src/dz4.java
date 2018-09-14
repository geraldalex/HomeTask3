import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {
        System.out.println("Введите целое число : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Число " + a +" - четное");
        }else
            System.out.println("Число " + a +" - нечетное");
    }
}
