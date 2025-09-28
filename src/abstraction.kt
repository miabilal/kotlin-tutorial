fun main() {
    // 1. Instantiate (create an object of) GooglePay
    var googlePay = GooglePay()
    println("--- Initiating Google Pay ---")
    googlePay.PaymentProcess() // Calls the specific GooglePay implementation
    println("Payment Method: ${googlePay.Payment}\n")


    // 2. Instantiate ApplePay
    var applePay = ApplePay()
    println("--- Initiating Apple Pay ---")
    applePay.PaymentProcess() // Calls the specific ApplePay implementation
    println("Payment Method: ${applePay.Payment}\n")


    // 3. Instantiate Card
    var cardPay = Card()
    println("--- Initiating Card Payment ---")
    cardPay.PaymentProcess() // Calls the specific Card implementation
    println("Payment Method: ${cardPay.Payment}\n")
}

// The rest of your classes remain the same
abstract class Pay {
    abstract var Payment: String
    abstract fun PaymentProcess()
}

class GooglePay: Pay() {
    override var Payment: String = "Google Pay"
    override fun PaymentProcess() {
        println("Paying with Google Pay...")
    }
}

class ApplePay: Pay() {
    override var Payment: String = "ApplePay"
    override fun PaymentProcess() {
        println("Paying with ApplePay...")
    }
}

class Card: Pay() {
    override var Payment: String = "Card"
    override fun PaymentProcess() {
        println("Paying with Card...")
    }
}