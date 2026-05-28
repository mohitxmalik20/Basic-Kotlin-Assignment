fun calsimpleintrest(p: Double, r: Double, t: Double): Double
{
    return (p * r * t) / 100
}
fun main()
{
    val principal = 60000.0
    val rate = 7.0
    val time = 3.0

    val si = calsimpleintrest(principal, rate, time)

    println("Simple Interest = $si")
}
