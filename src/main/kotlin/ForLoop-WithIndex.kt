fun main(){
    val days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")

    for ((index,value) in days.withIndex()){
        println("Value $value with Index $index")
    }
}