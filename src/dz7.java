import java.util.Scanner;

public class dz7 {
    public static void main(String[] args) {
        System.out.println("Программа определяет какая из цифр трехзначного числа больше ");
        int variant;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите трехзначное число : ");
        int chislo = sc.nextInt();
        int first = chislo/100;
        int second = chislo/10%10;
        int third = chislo%100%10;
        System.out.println(" Введите нужный вариант 1, 2, 3 - а)первая или последняя б)первая или вторая в)вторая или последняя : ");
        variant = sc.nextInt();

        switch (variant){
            case 1:
                if(first>third)
                    System.out.println("Первая  ");
                else
                    System.out.println("Последняя ");
                break;

            case 2:
                if(first>second)
                    System.out.println("Ппервая  ");
                else
                    System.out.println("Вторая  ");
                break;

            case 3:
                if(second>third)
                    System.out.println("Вторая  ");
                else
                    System.out.println("Последняя ");
                break;


        }


    }

}
