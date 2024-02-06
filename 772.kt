import kotlin.math.pow
import kotlin.math.exp
import kotlin.math.abs
import kotlin.math.tan
fun main(){
    try {

        println("введите x:")
        var x=readLine()!!.toDouble()
        println("введите y:")
        var y=readLine()!!.toDouble()
        println("введите z:")
        var z=readLine()!!.toDouble()

        var a = (3+(exp(y-1)))/(1+x.pow(2)*abs(y-tan(z)))
        var b = 1+abs(y-x)+(((y-x).pow(2))/2)+(((abs(y-x)).pow(3))/3)
        println(String.format("%.2f",a))
        println(String.format("%.2f",b))
    }
    catch (e:Exception ){ println("error")}

}