val first_sum = 1000.00
val second_sum = 10_000.00
val first_sale = 100.00
val second_sale = 0.05
val is_customer_regular = true
val sale_to_regular_customer = 0.01
fun main() {
    println("Введите сумму покупки: ")
    var sum = readln().toDouble()
    val score_sale = if (is_customer_regular && sum < first_sum) sum * sale_to_regular_customer
    else if (is_customer_regular && (sum >= first_sum) && (sum < second_sum)) (sum - first_sale) * sale_to_regular_customer
    else if (is_customer_regular && (sum >= second_sum)) sum * sale_to_regular_customer * (1 - second_sale) + sum * second_sale
    else if (!is_customer_regular && sum < first_sum) sum
    else if (!is_customer_regular && (sum >= first_sum) && (sum < second_sum)) first_sale
    else if (!is_customer_regular && (sum >= second_sum)) sum * second_sale
    else return
    val score = sum - score_sale
    val sum_roubles = sum.toInt()
    val sum_kopecks = Math.round(sum - sum_roubles)
    val sale_roubles = score.toInt()
    val sale_kopecks = Math.round(score - sale_roubles)
    println("Покупка: $sum_roubles руб. $sum_kopecks коп.")
    if (is_customer_regular && sum < first_sum) {
        println("После применения 1-% скидки: $sale_roubles руб. $sale_kopecks коп.")
    }
    if (is_customer_regular && (sum >= first_sum) && (sum < second_sum)) {
        println("После применения скидки 100 рублей: ${(sum - 100).toInt()} руб. ${Math.round((sum - 100 - (sum - 100).toInt())*100)} коп.")
        println("После применения 1-% скидки: $sale_roubles руб. ${sale_kopecks} коп.\"")
    }
    if (is_customer_regular && (sum >= second_sum)) {
        println("После применения 5-% скидки: ${(sum * 0.05).toInt()} руб. ${Math.round((sum * 0.05 - (sum * 0.05).toInt())*100)} коп.")
        println("После применения 1-% скидки: $sale_roubles руб. ${sale_kopecks} коп.\"")
    }
    if (!is_customer_regular && sum < first_sum)
        println("У Вас нет никаких скидок")
    if (!is_customer_regular && (sum >= first_sum) && (sum < second_sum))
        println("После применения скидки 100 рублей: $sale_roubles руб. ${sale_kopecks} коп.\"")
    if (!is_customer_regular && (sum >= second_sum))
        println("После применения 5-% скидки: $sale_roubles руб. ${sale_kopecks} коп.\"")
}