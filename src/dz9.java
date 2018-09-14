import java.util.Scanner;

public class dz9 {
    public static void main(String[] args) {
        System.out.println("Пррограмма определяет меньшее из двух чисел и заменяет половиной их суммы, а большое удвоенным их произведением ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Х и У ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        double newFirst;
        double newSecond;

        if (first > second) {
            newFirst = 2 * (first * second);
            newSecond = (first + second) / 2;
        } else {
            newSecond = 2 * (first * second);
            newFirst = (first + second) / 2;

        }
        System.out.println("Х теперь равен : " + newFirst);
        System.out.println("У теперь равен : " + newSecond);
    }

}
