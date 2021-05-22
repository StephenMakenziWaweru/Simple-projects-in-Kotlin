fun main() {

    /*
    Mutable is the ability to change: Mutable arrays can be added or removed, similarly mutable lists can be performed
    functions to those of mutable arrays. However, while immutable arrays prevent changing the size the array but allow
    changing of elements in the array, immutable lists can neither change in size nor particular elements.


    Arrays are data structures that are well suited for arithmetic operations due to their sequential memory storage
    On the other hand, lists are interfaces in most languages. This means that the type of operations supported by
    either of the data types differs in some cases.
    Lists can also hold elements belonging to different data types while arrays only support a single data type.
    In terms of memory, arrays are more memory efficient while lists take more memory since each element has its own
    memory

    As such arrays are better suited in applications that requires frequent access to the elements in the array.
    In contrast, lists are preferred where changes such as removal or addition are needed

     */


    //EXAMPLES
    //Arrays
    val names = arrayOf("Steve", "Mak", "Ken", "Jack", "Uhuru", "Raila")
    println(names[4])

    //Lists
    val listOfNames = mutableListOf("Kennedy","Moses","Margaret","Missy",4,false)
    listOfNames.add(4,"Kamwana")
    println(listOfNames)
}