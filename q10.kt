fun checkCharacter(ch: Char) 
{
    val vowels = listOf('a', 'e', 'i', 'o', 'u')

    if (ch.lowercaseChar() in vowels)
  {
        println("$ch is a vowel")
    }
  else
  {
        println("$ch is a consonant")
    }
}

fun main()
{
    checkCharacter('B')
}
