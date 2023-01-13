public class ArraysOfStrings {
    public static void main(String[] args) {
        // создаем массив
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "Джава";
        
        for(int i = 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }

        System.out.println();

        for(String string:strings){ // тип данных(String)-имя переменной(string:может быть любое)-имя массива(strings)
            System.out.println(string); // выводим переменную, которая ссылается на каждый элемент массива поочереди
        }

        int[] numbers = {1,2,3};
        int sum = 0;
        for(int x:numbers){
            sum = sum+x;
        }
        System.out.println();
        System.out.println(sum); // выведет 0+1+2+3, потому что цикл for each
    }
    
}
