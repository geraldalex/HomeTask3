import java.util.Scanner;

public class dz8 {
    public static void main(String[] args) {
        System.out.println("Программа определяет равен ли квадрат введенного числа сумме кубов его цифр  ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите трехзначное число : ");
        int chislo = sc.nextInt();
        int first = chislo/100;
        int second = chislo/10%10;
        int third = chislo%100%10;
        if (Math.pow(chislo,2)==Math.pow(first,3)+Math.pow(second,3)+Math.pow(third,3))
            System.out.println("Равен");
        else
            System.out.println("Не равен");
    }

}
