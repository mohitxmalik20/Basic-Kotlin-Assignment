fun main() 
{

    val n = 10
    println("Prime numbers from 1 to $n are:")
    for (i in 2..n)
  {
        var isPrime = true
        for (j in 2 .. i-1) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }

        if (isPrime) {
            print("$i ")
        }
    }
}
