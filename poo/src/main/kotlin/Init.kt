class Animal(var species: String) {
    var sound: String = ""
    init {
        if (species == "dog") sound = "DogSound.mp3"
        if (species == "cat") sound = "CatSound.mp3"
    }
}

fun main() {
    var dogMau = Animal("dog")
    println(dogMau.sound)
}