fun letter(score: Int): String {

    val result: String;

    result = when (score) {

        in 90..100 -> "A"
        in 80 .. 89 -> "B"
        in 70..79 -> "C"
        in 60 .. 69 -> "D"
        else -> "F"

    }

    return result;


}

fun main() {
    val students = mutableMapOf("Demir" to 90, "Jackie" to 97, "Alfredo" to 78, "Mia" to 89)

    for ((name, score) in students){
        println("$name: $score -> ${letter(score)}")
    }


    print("Class average: ${students.values.average()}")
}