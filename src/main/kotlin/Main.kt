fun main() {
    val amount = 100
    println(moneyTransferFee(amount))
}
fun moneyTransferFee(amount: Int): Int {
    val tax = 0.75
    val minTax = 35
    val resultFee = if ((amount * (tax/100)).toInt() > minTax) amount * (tax/100) else minTax
    return resultFee.toInt()
}