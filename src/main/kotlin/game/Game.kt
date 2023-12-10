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
        if (userInput != null && userInput in optionsParam){

            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("Введенено неправильное значение. Попробуйте еще раз.")
    }
    return (userChoice)
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    if (userChoice == gameChoice) result = "Ничья!"
    else if ((userChoice == "Ножницы" && (gameChoice == "Бумага" || gameChoice == "Ящерица")) ||
        (userChoice == "Бумага" && (gameChoice == "Камень" || gameChoice == "Спок")) ||
        (userChoice == "Камень" && (gameChoice == "Ящерица" || gameChoice == "Ножницы")) ||
        (userChoice == "Ящерица" && (gameChoice == "Спок" || gameChoice == "Бумага")) ||
        (userChoice == "Спок" && (gameChoice == "Ножницы" || gameChoice == "Камень"))) result = "Ты победил!"
    else result = "Ты проиграл!"
    println("Ты выбрал $userChoice. Я выбрал $gameChoice. $result")
}