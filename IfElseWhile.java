public class IfElseWhile {
    public static void main(String[] args) {
        int myInt = 15;
        if (myInt < 10) {
            System.out.println("Это меньше десяти");
        } else if (myInt > 20) {
            System.out.println("Это больше двадцати");
        } else {
            System.out.println("ни одно из этого");
        }

        int value = 0;
        while (value < 5) {
            System.out.println("Таки да" + value);
            value = value + 1;
        }

    }
}
