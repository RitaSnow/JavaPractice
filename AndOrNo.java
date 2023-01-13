// И - &&
// НЕ - !
// ИЛИ - ||

public class AndOrNo {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        boolean bool = false;

        if(a == b && !bool){
            System.out.println("Это истина!");
        }

        if(a == b || bool){
            System.out.println("Это истина!");
        }
    }
}
