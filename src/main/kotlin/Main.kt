val firstSum = 1000.00
val secondSum = 10_000.00
val firstSale = 100.00
val secondSale = 0.05
val isCustomerRegular = true
val saleToRegularCustomer = 0.01
fun main() {
    println("Введите сумму покупки: ")
    var sum = readln().toDouble()
    val scoreSale = if (isCustomerRegular && sum < firstSum) sum * saleToRegularCustomer
    else if (isCustomerRegular && (sum >= firstSum) && (sum < secondSum)) (sum - firstSale) * saleToRegularCustomer
    else if (isCustomerRegular && (sum >= secondSum)) sum * saleToRegularCustomer * (1 - secondSale) + sum * secondSale
    else if (!isCustomerRegular && sum < firstSum) sum
    else if (!isCustomerRegular && (sum >= firstSum) && (sum < secondSum)) firstSale
    else if (!isCustomerRegular && (sum >= secondSum)) sum * secondSale
    else return
    val score = sum - scoreSale
    val sumRoubles = sum.toInt()
    val sumKopecks = Math.round(sum - sumRoubles)
    val saleRoubles = score.toInt()
    val saleKopecks = Math.round(score - saleRoubles)
    println("Покупка: $sumRoubles руб. $sumKopecks коп.")
    if (isCustomerRegular && sum < firstSum) {
        println("После применения 1-% скидки: $saleRoubles руб. $saleKopecks коп.")
    }
    if (isCustomerRegular && (sum >= firstSum) && (sum < secondSum)) {
        println("После применения скидки 100 рублей: ${(sum - 100).toInt()} руб. ${Math.round((sum - 100 - (sum - 100).toInt()) * 100)} коп.")
        println("После применения 1-% скидки: $saleRoubles руб. ${saleKopecks} коп.\"")
    }
    if (isCustomerRegular && (sum >= secondSum)) {
        println("После применения 5-% скидки: ${(sum * 0.05).toInt()} руб. ${Math.round((sum * 0.05 - (sum * 0.05).toInt()) * 100)} коп.")
        println("После применения 1-% скидки: $saleRoubles руб. ${saleKopecks} коп.\"")
    }
    if (!isCustomerRegular && sum < firstSum)
        println("У Вас нет никаких скидок")
    if (!isCustomerRegular && (sum >= firstSum) && (sum < secondSum))
        println("После применения скидки 100 рублей: $saleRoubles руб. ${saleKopecks} коп.\"")
    if (!isCustomerRegular && (sum >= secondSum))
        println("После применения 5-% скидки: $saleRoubles руб. ${saleKopecks} коп.\"")
}