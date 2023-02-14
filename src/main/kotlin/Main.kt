fun main() {
    var num1 = 12
    var num2 = 2
    var sum = num1 + num2
    println(sum)

    var num3 = 4
    var num4 = 2
    var difference = num3 - num4
    println(difference)

    var num5 = 18
    var num6 = 2
    var division = num5 / num6
    println(division)

    var num7 = 2
    var num8 = 2
    var product = num7 * num8
    println(product)

    var num9 = 19
    var num10 = 2
    var remainder = num9 % num10
    println(remainder)

    var phone = "iphone "
    var price = 100000
    var phoneprice = "iphone ";100000
    println(phone + price)

    var greetings = "hello "
    var name = "ada"
    var greetingsname = "helloada"
    println(greetings+name)
    person("Mary")


    addition(12,3)
    difference(20,12)
    product(2,2)
    remainder(21,5)
   var g= sum(6,8)
    println(g)
    var h= difference(10,5)
    println(h)
    var k =total(12,12,12,12)
    println(k)
    var r =remaining(21,2)
    println(r)
    var salutations="hello"
    var names="Ada"
    var salutationsnames = "hello Ada"
    println(salutationsnames)
    greetings("Ishimwe")
  fact("life is good")

}

     fun addition(num1:Int,numb2:Int){
         var addition =(num1+numb2)
         println(addition)

     }
     fun difference(number3:Int,number4:Int){
         var difference = (number3-number4)
         println(difference)

     }
fun product(numer3:Int,number4:Int){
    var product = (numer3 * number4)
    println(product)}

    fun remainder(numb4:Int,numb5:Int){
        var remainder = (numb4 % numb5)
        println(remainder)
}
fun sum(number8:Int,number9:Int):Int {
    var sum = number8 + number9
    return sum

}
fun number(numb10:Int,num11:Int):Int {
    var difference = numb10 - num11
    return difference
}
fun total(num11:Int,num12:Int,num13:Int,num14:Int,):Int {
    var total= num11+num12+num13+num14
    return total

}
fun remaining(num15:Int,num16:Int,):Int{
    var remaining= num15 % num16
    return remaining
}
fun person(word:String){
    println("Hello " + word)

}
fun greetings(greet:String){
    println("hello " + greet)

}
fun fact(fact:String){
    println (fact)

}
