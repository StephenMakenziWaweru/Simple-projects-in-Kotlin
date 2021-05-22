fun main() {
    //This is a Fizz Buzz Test checking for multiples of 3 & 5 and prime numbers

    println("Fizz Buzz Test")

    val numbers = 1..100

    for (i in numbers){
        if (i%3==0 && i%5==0) {                                            // Multiples of 3 and 5
            println("FizzBuzz")
        }else if (i%3==0){                                                 // Multiples of 3
            println("Fizz")
        }else if (i%5==0) {                                                // Multiples of 5
            println("Buzz")
        }else if (i>1 && (i==2 || i==3 || (i-1)%6==0 || (i+1)%6==0)){      // Prime Numbers
            println("Prime")
        }else println(i)                                                   // All other numbers
    }
}