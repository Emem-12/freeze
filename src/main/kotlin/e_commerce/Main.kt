package e_commerce

import e_commerce.shoppingCart

fun main(){
    val product1 = product("perfume", 10000,60)
    val product2 = product("body cream", 8000,45)
    val product3 = product("cologne", 20000,30)

    val shoppingCart = shoppingCart()
    shoppingCart.addProduct(product1,3)
     shoppingCart.addProduct(product2,6)
    shoppingCart.addProduct(product3,8)

    val totalCost = shoppingCart.calculateTotal()
    println("Total cost: $totalCost")

    shoppingCart.checkout()
    println("checkout complete")

    println("updated stock for $product1: ${product1.quantityInStock}")
    println("updated stock for $product2: ${product2.quantityInStock}")
    println("updated stock for $product3: ${product3.quantityInStock}")





}




