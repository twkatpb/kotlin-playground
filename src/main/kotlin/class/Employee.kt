package io.github.katpb.`class`

data class Employee(
    val id : Int,
    val name : String
)

fun main() {
    val emp = Employee(1, "Pukazhiniyan.K")
    println(emp)

    val emp1 = Employee(1, "Kathir")

    println("equality check : ${emp.equals(emp1)}")

    val emp2 = emp.copy(1, "Kathir");

    println("equality check : ${emp.equals(emp2)}")
    println( emp.hashCode() );
    println( emp1.hashCode() );
    println( emp2.hashCode() );


}