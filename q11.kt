fun main() 
{
    var num = 54673
    var sum = 0

    while (num != 0) 
  {
        val digit = num % 10
        sum = sum + digit
        num = num / 10
    }
    print("Sum of digits = $sum")
}
