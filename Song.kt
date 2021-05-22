fun main() {
    // Favorite Song: Just Give Me a Reason
    // Attributes of my favorite song

//    val artist = "Pink"           // This is the main artist
//    val featured = "Nate"         // Pink was assisted by Nate
//    val producer = "Jeff" // Jeff is the producer
//    val releaseDate = 2012        // The song was released in the year 2012
//    val genre = "Pop"             // It is a pop song
//    val duration = 4.02           // It lasts for for about 4 minutes
//    val isEnjoyable = true        // Its a good song that one can enjoy

    println("The artist is ${artist()}")

    println("The song was released in ${year()}")

    println("It is a ${genre()} song")
}

fun artist():String{
return "Pink"
}

fun year():Int{
return 2012
}

fun genre():String{
return "Pop"
}