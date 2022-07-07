import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calc();
    }
    public static void calc(){
        Scanner scanner = new Scanner(System.in);
        int z;
        do {
            System.out.println("Choose operation  \n1 for + \n2 for - \n3 for /\n4 for *");
            try {
                z = scanner.nextInt();
            }catch(InputMismatchException e){
                z = 0;
                scanner.next();
            }
        }while (!(z == 1 || z == 2 || z == 3 || z == 4));
        double y;
        double x;
        try {
            y = scanner.nextDouble();
            x = scanner.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Wrong");
            return;
        }
        double sum = switch (z) {
            case 1 -> y + x;
            case 2 -> y - x;
            case 3 -> y / x;
            case 4 -> y * x;
            default -> -1;
        };
        System.out.println(sum);
        scanner.close();
    }
    public static void guess(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose minimum number of a pool: ");
        int min;
        min = scanner.nextInt();
        System.out.println(min);
        System.out.println("Choose maximum number of a pool: ");
        int max;
        max = scanner.nextInt();
        System.out.println(max);
            double a = (Math.random() * max) + min;
            int b = (int) Math.round(a);
            System.out.println(b);
        int z;
        do {
            System.out.println("Enter a number: ");

            try {
                z = scanner.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Input a number");
                z = 0;
                scanner.next();
                continue;
            }
            if (z > b){
                System.out.println("number is less");
            }else if(z < b){
                System.out.println("number is more");
            }
        }while (z != b);
        System.out.println("good");
        scanner.close();
    }
}