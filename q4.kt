fun main() {
    var num = 7654321
    var reverse = 0
    while (num != 0) {
        val digit = num % 10
        reverse = reverse * 10 + digit
        num = num / 10
    }
    print("Reversed number is $reverse")
}
