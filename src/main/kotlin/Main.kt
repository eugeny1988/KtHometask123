val firstSum = 1000.00
val secondSum = 10_000.00
val firstSale = 100.00
val secondSale = 0.05
val isCustomerRegular = true
val saleToRegularCustomer = 0.01
fun main() {
    println("Введите сумму покупки: ")
    var sum = readln().toDouble()
    println("Покупка: $sum")
    var scoreSale: Double
    if (isCustomerRegular) {
        if (sum < firstSum) {
            scoreSale = sum * saleToRegularCustomer
            println("После применения скидки 1%: ${sum - scoreSale}")
        } else if ((sum >= firstSum) && (sum < secondSum)) {
            scoreSale = (sum - firstSale) * saleToRegularCustomer
            println("После применения скидки 100 рублей: ${sum - firstSale}")
            println("После применения 1-% скидки: ${sum - firstSale - scoreSale}")
        } else if ((sum >= secondSum)) {
            scoreSale = sum * saleToRegularCustomer * (1 - secondSale) + sum * secondSale
            println("После применения 5-% скидки: ${sum - sum * secondSale}")
            println("После применения 1-% скидки: ${sum - scoreSale}")
        }
    } else {
        if (sum < firstSum) {
            println("У Вас нет никаких скидок")
        } else if ((sum >= firstSum) && (sum < secondSum)) {
            scoreSale = firstSale
            println("После применения скидки 100 рублей: ${sum - scoreSale}")
        } else if ((sum >= secondSum)) {
            scoreSale = sum * secondSale
            println("После применения 5-% скидки: ${sum - scoreSale}")
        }
    }
}