fun main() {
    numbers()
    person()
    println(person().c)
    var operate=Calculator(23,20)
    operate.add()






}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
//fun names(){
//    numbers()

//}

//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun numbers(){
    var num = arrayOf(34,13,23,4,11)
    println(num.lastIndex)
    println(num.first())
    println(num.average())

}
//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun person(){
    var x="skills"
    println(x[0])
    println(x[1])
    println(x[2])
    println(x[3])
    println(x[4])

}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun pupils(){
    var people= arrayOf("Marrion","Yvonne","Super")
    return people.toString()
}
class Calculator(var num:Int var num2:Int){
    fun add(){
        var addition=num+num2

    }
    fun minus(){
        var subtract=num-num2


    }