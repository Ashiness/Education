import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = Math.random() * 100;
        int b = (int) Math.round(a);
        System.out.println(b);
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("congratz");
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
        int y;
        int x;
        try {
            y = scanner.nextInt();
            x = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Pidoras");
            return;
        }
        int sum;
        switch (z){
            case 1:
                sum = y + x;
                break;
            case 2:
                sum = y - x;
                break;
            case 3:
                sum = y / x;
                break;
            case 4:
                sum = y * x;
                break;
            default:
                sum = -1;
        }
        System.out.println(sum);
        scanner.close();
    }
}