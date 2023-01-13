public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Мария";
        person2.age = 29;
        person2.speak();
        person2.sayHello();
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: " + year1);
        System.out.println("Второму человеку до пенсии: " + year2);

    }
}

class Person {
    String name;
    int age;

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ". Мне " + age + " лет ");
    }

    void sayHello() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Привет!");
        }
    }
}
