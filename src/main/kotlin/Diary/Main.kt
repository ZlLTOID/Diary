import java.time.LocalDateTime

fun main(args: Array<String>) {
    val dateTime: LocalDateTime = LocalDateTime.now()
    println(dateTime.toLocalDate())
}