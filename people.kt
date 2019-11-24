data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Daniel", 40), Person("Anna", 11))
}

fun main(args: Array<String>) {
    println(getPeople())
}
