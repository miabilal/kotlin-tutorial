fun main(){
    var car =Car(name = "M5","BMW", model = 2023, color = "Black")
    var car2 =Car(CarName = "M4", CarModel = 2022)

}
class Car(name: String,brand: String,model: Int,color: String){
    constructor(CarName: String, CarModel: Int) :
            this(CarName, "BMW", CarModel, "Blue")

    init {
        println("CarName is : $name")
    }
    init {
        println("Model is : $model")
    }
    init {
        println("Brand is : $brand")
    }
    init {
        println("color is : $color")
    }

}
