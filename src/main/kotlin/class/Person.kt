package io.github.katpb.`class`

class Person () {
    var name: String = ""
    var age: Int = 0
    constructor(_name: String, _age: Int) : this() {
        name = _name;
        age = _age;
    }

    fun action() : String{
        return "Person is doing something"
    }

} 

fun main() {
    val person = Person("Kathir", 30)
    println( person.action());
    println("person name is ${person.name} & age is ${person.age}")
}