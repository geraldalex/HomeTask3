import java.util.Scanner;

public class dz6 {

        static int minute;
        static int day;
        static double costMinute = 5.52;
        static double price = 0;


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Вычисление стоимости разговора по телефону ");
            System.out.println(" Введите исходные данные :  ");
            System.out.print("Длительность разговора (целое количество минут) :   ");
            minute = sc.nextInt();
            System.out.print("День недели (1 - понедельник, ... 7 - воскресенье)) :   ");
            day = sc.nextInt();
            calculationOfValue(minute, day);


        }
        public static void calculationOfValue(int minute, int day){
            if(day ==1||day ==2||day ==3|| day ==4||day ==5){
                price = minute*costMinute;
                System.out.println("Стоимость разговора :  " + price);


            }else{
                price = minute*costMinute*0.2;
                price = minute*costMinute - price;

                System.out.println("Предоставляется скидка 20% ");
                System.out.println("Стоимость разговора :  " + price);

            }
        }


    }

