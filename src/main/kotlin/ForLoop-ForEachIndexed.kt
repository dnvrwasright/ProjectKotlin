fun main(){
    val days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")

    days.forEachIndexed() {index, value ->
        println("Day $value with Index: $index")
    }
}