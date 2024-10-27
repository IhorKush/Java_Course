package oop;

public class OOPDemo {

    public static void main(String[] args) {

        Person ihor = new Person();
        ihor.name = "Ihor Kush";
        ihor.age = 36;
        ihor.sayHello();

        Person ivan = new Person();
        ivan.name = "Ivan";
        ivan.age = 28;
        ivan.sayHello();

        PersonKT kotlinPerson = new PersonKT();
        kotlinPerson.setName("Nick");
        kotlinPerson.setAge(33);
        kotlinPerson.sayHello();

    }
}
