package e_commerce
//product class with properties
class product(s: String, i: Int, i1: Int) {
    var name: String? = null
    var price: Double? = null
    var quantityInStock: Int? = null

    //a method productinfo that returns a string with product details
    fun ProductInfo(): String {
        println("Hello there, the product details are as follows: ")
        return "the name of the product is $name,and each is sold at the rate of $price.we have $quantityInStock left"
    }

    fun isAvailable(): Boolean {
        if (quantityInStock!! > 0) {
            return true
        } else {
            return false
        }
    }
}
