//fun main() {
//
//    val printMessage = {message: String -> println(message)}
//    printMessage("Hello World")
//
//    val sumB: (Int, Int) -> Int = {x,y -> x+y}
//    println(sumB(5,4))
//
//    // Simple Download request
//    fun downloadData(url: String, completion: ()->Unit){
//        completion()
//    }
//    //call downloadDataFunction
//    downloadData("facebook.com") {
//        println("Code runs after completing")
//    }
//    fun downCarData(url:String, completion: (Car)->Unit){
//        val car = Car("Tesla","ModelX","Blue")
//        completion(car)
//    }
//    downCarData("fake.com"){car ->
//        println(car.color)
//
//    }
//}