open class Vehicle(val Make:String,
                   val Model:String,
                   val Year:Int,
                   val Weight:Int ){


    var needsMaintenance = false
    var tripsSinceMaintenance = 0

}

class Cars(Make:String,Model:String,Year:Int,Weight:Int,Switches:Int ):Vehicle(Make,Model,Year, Weight) {
    private var isDriving = true
    private val driveOrStopSwitch:IntRange = 1..Switches // Refers to the number of switches from drive to stop
    private fun drive() {
        isDriving = true
    }

    private fun stop() {
        isDriving = false
    }
    private fun repair(){
        tripsSinceMaintenance = 0
        needsMaintenance = false
    }
    fun counter() {
        for (i in driveOrStopSwitch) {
            if (isDriving) {
                stop()
                tripsSinceMaintenance += 1
            } else {
                drive()
            }
            if (tripsSinceMaintenance > 100) {
                needsMaintenance = true
                repair()
            }
        }
    }
}

class Planes(Make:String,Model:String,Year:Int,Weight:Int,Switches:Int ):Vehicle(Make,Model,Year, Weight){
    private var isFlying = false
    private val flyOrLandSwitch:IntRange = 1..Switches // Refers to the number of switches from fly to land

    private fun fly() {
        isFlying = true
    }

    private fun land() {
        isFlying = false
    }

    fun counter() {
        for (i in flyOrLandSwitch) {
            if (isFlying) {
                land()
                tripsSinceMaintenance += 1
            } else {
                fly()
            }
            if (tripsSinceMaintenance > 100) {
                needsMaintenance = true
                println("No more $Make flights Allowed until Repair!! " +
                        "The $Make $Model has attained Max Trips and needs REPAIR ASAP!!!\n\n")
                break
            }
        }
    }
}

fun main() {
    // Car Objects
    val tesla = Cars("Tesla","ModelX",2019,2000,154)
    tesla.counter()

    val toyota = Cars("Toyota","Corolla",2020,1500,200)
    toyota.counter()

    val audi = Cars("Audi","A3",2020,1425,205)
    audi.counter()

    // Plane Object
    val boeing = Planes("Boeing","787",2009,253000,500)
    boeing.counter()

    val gulfStream = Planes("GulfStream","G650",2008,24490,100)
    gulfStream.counter()

    val cessna = Planes("Cessna","CitationX",1996,9798,400)
    cessna.counter()

    // Printing Cars
    println("----------------------Cars----------------------")
    println("Make                 : ${tesla.Make}   ${toyota.Make}   ${audi.Make}")
    println("Model                : ${tesla.Model}  ${toyota.Model}  ${audi.Model}")
    println("Year                 : ${tesla.Year}    ${toyota.Year}     ${audi.Year} ")
    println("Weight               : ${tesla.Weight}    ${toyota.Weight}     ${audi.Weight}")
    println("TripsSinceMaintenance: ${tesla.tripsSinceMaintenance}      ${toyota.tripsSinceMaintenance}      ${audi.tripsSinceMaintenance} ")
    println("NeedsMaintenance     : ${tesla.needsMaintenance}   ${toyota.needsMaintenance}    ${audi.needsMaintenance}")

    // printing Planes
    println("\n\n-------------------------Planes-------------------------")
    println("Make                 : ${boeing.Make}   ${gulfStream.Make}   ${cessna.Make}")
    println("Model                : ${boeing.Model}      ${gulfStream.Model}         ${cessna.Model}")
    println("Year                 : ${boeing.Year}     ${gulfStream.Year}         ${cessna.Year} ")
    println("Weight               : ${boeing.Weight}   ${gulfStream.Weight}        ${cessna.Weight}")
    println("TripsSinceMaintenance: ${boeing.tripsSinceMaintenance}       ${gulfStream.tripsSinceMaintenance}           ${cessna.tripsSinceMaintenance} ")
    println("NeedsMaintenance     : ${boeing.needsMaintenance}    ${gulfStream.needsMaintenance}        ${cessna.needsMaintenance}")
}




