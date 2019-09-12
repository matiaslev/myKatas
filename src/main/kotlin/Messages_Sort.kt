fun main() {

    val message = GenericChatMessage(3, "hola 3", TIMESTAMP_TYPE_MESSAGE)

    val allChatMessages: ArrayList<GenericChatMessage> = arrayListOf(
        GenericChatMessage(1, "hola 1", TIMESTAMP_TYPE_MESSAGE),
        GenericChatMessage(2, "hola 2", OTHER),
        message,
        GenericChatMessage(4, "hola 4", TIMESTAMP_TYPE_MESSAGE),
        GenericChatMessage(5, "hola 5", TIMESTAMP_TYPE_MESSAGE),
        GenericChatMessage(6, "hola 6", TIMESTAMP_TYPE_MESSAGE),
        GenericChatMessage(7, "hola 7", OTHER)
    )

    message.type = OTHER

    println(allChatMessages.last().text)
    println(allChatMessages.size)

    allChatMessages.apply {
        filter { it.type == OTHER }
        remove(find { it.idMessage == 3 })
    }
    allChatMessages.add(message)

    println(allChatMessages.last().text)
    println(allChatMessages.size)
}

val TIMESTAMP_TYPE_MESSAGE = "day"
val OTHER = "other"
data class GenericChatMessage(val idMessage: Int,val text: String, var type: String)