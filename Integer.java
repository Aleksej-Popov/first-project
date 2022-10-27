import java.util.Scanner;
public class Integer {


    public static void Privet(String[] args){
            System.out.println("Который час?");
            Scanner scanner = new Scanner(System.in);
            int currentHour = scanner.nextInt();
            if (currentHour>=22){
                System.out.println("Доброй ночи!");
            } else if(currentHour<6){
                System.out.println("Доброй ночи!");
            } else if(currentHour<12) {
                System.out.println("Доброе утро!");
            } else if (currentHour<18) {
                System.out.println("Добрый день!");
            } else {
                System.out.println("Доброго вечера!");
            }
        }


}

