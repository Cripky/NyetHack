fun main() {
    var beverage = readLine()
        if (beverage != null) {
            beverage = beverage.capitalize()
        } else println("I can't do that without crashing - beverage wan null!")
    val beverageServed: String = beverage?: "Buttered Ale"
    println(beverageServed)
}