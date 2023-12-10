package game

fun main(args: Array<String>) {
    val options: Array<String> = arrayOf("Камень", "Ножницы","Бумага", "Ящерица", "Спок")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random()*optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice){
        println("Пожалуйста, введите один из вариантов: ${optionsParam.joinToString(", ")}.")
        val userInput = readLine()
        if (userInput != null && optionsParam.any { it.equals(userInput.filter { !it.isWhitespace() }, true) }){
            isValidChoice = true
            userChoice = userInput.filter { !it.isWhitespace()}
        }
        if (!isValidChoice) println("Введенено неправильное значение. Попробуйте еще раз.")
    }
    return (userChoice)
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    if (userChoice.equals(gameChoice, ignoreCase = true)) result = "Ничья!"
    else if ((userChoice.equals("Ножницы", ignoreCase = true) && (gameChoice == "Бумага" || gameChoice == "Ящерица")) ||
        (userChoice.equals("Бумага", ignoreCase = true) && (gameChoice == "Камень" || gameChoice == "Спок")) ||
        (userChoice.equals("Камень", ignoreCase = true) && (gameChoice == "Ящерица" || gameChoice == "Ножницы")) ||
        (userChoice.equals("Ящерица", ignoreCase = true) && (gameChoice == "Спок" || gameChoice == "Бумага")) ||
        (userChoice.equals("Спок", ignoreCase = true) && (gameChoice == "Ножницы" || gameChoice == "Камень"))) result = "Ты победил!"
    else result = "Ты проиграл!"
    println("Ты выбрал $userChoice. Я выбрал $gameChoice. $result")
}