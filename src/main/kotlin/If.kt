fun main() {
    val timeOpen = 8
    val timeClosed = 10
    val timeNow = 11

    val classstatus = if (timeNow >= timeClosed) {
        "Class Already Closed"
    } else if (timeNow >= timeOpen) {
        "Class Is Open"
    } else{
        "Class Is Not Open Yet"
    }

    println(classstatus)

}
