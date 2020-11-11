val map = mapOf('C' to 'G', 'G' to 'C', 'A' to 'T', 'T' to 'A')

fun makeComplement(dna : String) : String {
    return dna.map { map[it] }.joinToString(separator = "")
}
fun main(){
    println(makeComplement(""    ))
}