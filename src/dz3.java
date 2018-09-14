import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вычиссление стоимости покупки с учетом скидки  : ");
        double summa= sc.nextDouble();
        double  price =summa;
        if(summa>500&&summa<=1000){
            price =  summa - summa*0.03;
            System.out.println("Вам предоставляется скидка 3% ");
            System.out.println("Цена с учетом скидки : "+ price);

        }
        else if(summa>1000){
            price =  summa - summa*0.05;
            System.out.println("Вам предоставляется скидка 5% ");
            System.out.println("Цена с учетом скидки : "+ price);

        }else{
            System.out.println("Цена : " + price);
        }
    }
}
