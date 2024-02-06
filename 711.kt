import kotlin.math.pow
import kotlin.math.sqrt
fun main(){
    try {

        println("введите r")
        var r=readLine()!!.toDouble()
        println("введите a:")
        var a=readLine()!!.toDouble()


        var b= sqrt((2*((r*2).pow(2)))-2*(2*r)*(sqrt(((2*r).pow(2))-((a.pow(2))/4))))
       println(String.format("%.2f",b))
    }
    catch (e:Exception ){ println("error")}

}