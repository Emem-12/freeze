package e_commerce
import e_commerce.product


class shoppingCart {
     var  cartItem = mutableListOf<product>()
  var totalcost = 0.0

    fun addProduct(product: product, quantity:Int){

           if( product.isAvailable()){
              println(" ${cartItem.add(product)}")
               println()
           }else{
               println("sorry! we are out of stock")
           }
    }

fun removeProduct (product: product){
    cartItem.remove(product)
        println("product has successfully been removed from your cart")

}
    fun calculateTotal():Double{
     //  var totalcost = 0.0
        for (product in cartItem)
            product.price = product.price!! + product.price!!
        return totalcost
    }

    fun checkout(){
        for (product in cartItem){
            var newQuantityInStock = product.quantityInStock!! -1
        }
        cartItem.clear()
        println("checkout is successful")
    }
}
