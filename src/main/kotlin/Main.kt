import java.math.BigInteger

fun main() {
    println("1+2+3+4...")
    var accumulator = 0
    for(i in 0..150){
        accumulator+=i
        println("$i,$accumulator")
    }
    var accumulator1 = BigInteger("1")
    println("1*2*3*4...")
    for(i in 1..150){
        accumulator1 = accumulator1.multiply(BigInteger.valueOf(i.toLong()))
        println("$i,$accumulator1")
    }
}