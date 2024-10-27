package oop;

public class OOPDemo {

    public static void main(String[] args) {

        //Java
        Person ihor = new Person();
        ihor.name = "Ihor Kush";
        ihor.age = 36;
        ihor.sayHello();

        Person ivan = new Person("Ivan", 30);
        ivan.sayHello();

        Person john = new Person("John");
        john.sayHello();

        //Kotlin
        PersonKT kotlinPerson = new PersonKT();
        kotlinPerson.setName("Gabriella");
        kotlinPerson.setAge(33);
        kotlinPerson.sayHello();

        var selena = new PersonKT("Selena Gomez");
        selena.sayHello();
    }
}
