public class Arrays {
    public static void main(String[] args) {

        // int number = 10; // примитивный тип данных
        // char character = 'a'; // примитивный тип данных
        // String s = "Hello"; // ссылочный тип данных
        // String s1 = new String("Hello"); // ссылочный тип данных
        // int[] numbers = new int[5]; // массив - ссылочный тип данных

        int[] numbers = new int[5]; // 0 1 2 3 4
        for (int i = 0; i < numbers.length; i++) { // число от нуля, пока число меньше длины массива, добавлять +1
            numbers[i] = i * 10; // инициализируем элементы массива
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();

        int[] numbers1 = { 1, 2, 3 }; // другой вариант инициализации элементов массива
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }

}
