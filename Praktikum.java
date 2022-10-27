import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        currentHour();


    }
    public static void matrix() {
        int[][] matrix = {{1,2,3},
                {4,5,6},
                {7,8,9},
                {9,10,11}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void masSiv() {
        int[] abc = new int[12];

        for (int i=0; i<abc.length; i++) {
            abc[i]= i*10;
            System.out.println("Массивы "+abc[i]);
        }
        System.out.println();
    }
    public static void currentHour() {
        System.out.println("Который час?");
        Scanner scanner = new Scanner(System.in);
        int currentHour = scanner.nextInt();
        if ((currentHour<6)&&(currentHour>=0)||(currentHour>=22)&&(currentHour<=24)){
            System.out.println("Доброй ночи!");
        }
        else if((currentHour<12)&&(currentHour>=6)){
            System.out.println("Доброе утро!");
        }
        else if ((currentHour<18)&&(currentHour>=12)){
            System.out.println("Добрый день!");
        }
        else if((currentHour<22)&&(currentHour>=18)){
            System.out.println("Доброго вечера!");
        }
        else {
            System.out.println("Не правильное значение времени");
        }
    }
    public static void abc() {

    }
}