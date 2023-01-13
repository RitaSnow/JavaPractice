public class ParametryMetoda {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Роман");
        person1.age = 50;
        person1.speak();

    }
}

class Person {
    String name;
    int age;

    void setName(String username) {
        name = username;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ". Мне " + age + " лет ");
    }
}
