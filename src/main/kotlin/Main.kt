val firstSum = 1000.00
val secondSum = 10_000.00
val firstSale = 100.00
val secondSale = 0.05
val isCustomerRegular = true
val saleToRegularCustomer = 0.01
fun main() {
    println("Введите сумму покупки: ")
    var sum = readln().toDouble()
    val scoreSale =
        if (isCustomerRegular) {
            if (sum < firstSum) {
                sum * saleToRegularCustomer
            } else if ((sum >= firstSum) && (sum < secondSum)) (sum - firstSale) * saleToRegularCustomer
            else if ((sum >= secondSum)) sum * saleToRegularCustomer * (1 - secondSale) + sum * secondSale
            else return
        } else {
            if (sum < firstSum) sum
            else if ((sum >= firstSum) && (sum < secondSum)) firstSale
            else if ((sum >= secondSum)) sum * secondSale
            else return
        }
    val score = sum - scoreSale
    println("Покупка: $sum")
    if (isCustomerRegular) {
        if (sum < firstSum) {
            println("После применения скидки 1%: $scoreSale")
        }
        if ((sum >= firstSum) && (sum < secondSum)) {
            println("После применения скидки 100 рублей: ${sum - secondSale}")
            println("После применения 1-% скидки: $scoreSale")
        }
        if (sum >= secondSum) {
            println("После применения 5-% скидки: ${sum * secondSale}")
            println("После применения 1-% скидки: $scoreSale")
        }
    }
    if (!isCustomerRegular) {
        if (sum < firstSum)
            println("У Вас нет никаких скидок")
        if ((sum >= firstSum) && (sum < secondSum))
            println("После применения скидки 100 рублей: $scoreSale")
        if (sum >= secondSum)
            println("После применения 5-% скидки: $scoreSale")
    }
}