import java.math.BigInteger

// 최대 공약수를 구함
fun getGreatestCommonDivisor(A: Int, B: Int): Int {
    return BigInteger.valueOf(A.toLong()).gcd(BigInteger.valueOf(B.toLong())).toInt()
}