package oop

class PersonKT(var name: String, var age: Int) {

    //Empty constructor.
    constructor() : this("", 0)

    //Constructor with parameter "name".
    constructor(name: String) : this(name, 0) {
        this.name = name
    }

    fun sayHello() {
        println("Hello, my name is ${name}.")
    }
}