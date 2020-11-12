package srckotlin//fun tribonacci(s: DoubleArray, n: Int): DoubleArray {
//
//    // if n==0, then return an empty array
//    if (n == 0) return DoubleArray(0)
//
//    // the list of result
//    val result = DoubleArray(n)
//
//    // special cases
//    if (n < s.size) {
//        for (i in 0 until n) {
//            result[i] = s[i]
//        }
//        return result
//    }
//
//    // normal cases
//    for (i in s.indices) {
//        result[i] = s[i]
//    }
//
//    // calculation
//    for (i in s.size until n - 1) {
//        result[i] = result[i - 3] + result[i - 2] + result[i - 1]
//    }
//    return result
//}
//
//fun main(){
//    val a=tribonacci(doubleArrayOf(1.0,1.0,1.0,1.0,1.0),6)
//    for(i in a.indices)
//        print(a[i].toString()+" ")
//
//}
