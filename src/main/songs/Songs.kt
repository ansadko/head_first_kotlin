class Song(val title: String, val artist: String) {
    //Определяем свойства title и artist.
    fun play() {
        println("Playing the song $title by $artist")
    }
    //Добавляем функции play и stop.
    fun stop() {
        println("Stopped playing $title")
    }
}

fun main(args: Array<String>) {
    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}