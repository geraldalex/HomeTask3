import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first;
        double second = 0;
        double result;
        System.out.println("Введите делимое:  ");
        first = sc.nextDouble();
        System.out.println("Введите делитель:  ");
        second = sc.nextDouble();
        while(second == 0){
            System.out.println("Делитель не должен быть равен нулю!");
            System.out.println("Введите делитель: ");
            second = sc.nextDouble();
            if(second > 0)
                break;
        }
        result = first/second;
        System.out.println("Частное введенных чисел:  " + result);


    }
}
