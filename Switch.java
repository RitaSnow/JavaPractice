import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("тебе ноль лет");
                break;
            case 7:
                System.out.println("ты первоклашка");
                break;
            case 18:
                System.out.println("йей, можно покупать алкоголь");
                break;
            default:
                System.out.println("ни одно из условий не подошло");
                scanner.close();
        }

    }
}
