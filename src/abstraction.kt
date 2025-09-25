//Abstraction in Kotlin


fun main(){

    var Pay=GooglePay()
      Pay.PaymentProcess()

}

abstract class Pay{
    abstract var Payment: String
 abstract   fun PaymentProcess()
}

class GooglePay:Pay() {
    override var Payment: String="Google Pay"


    override fun PaymentProcess() {
        println("Pay with googlePay")
    }
}

class ApplePay:Pay(){
    override var Payment:String= "ApplePay"
    override fun PaymentProcess() {
        println("Pay with ApplePay")
    }
}
class Card:Pay(){
    override var Payment:String= "Card"
    override fun PaymentProcess() {
        println("Pay with Card")
    }
}