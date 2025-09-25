// Example of polymorphism


fun main(){
    //objectss
//    var ract: Shape =Rectangle()
//    ract.Draw()
//
//    var cricle: Shape =Circle()
//    cricle.Draw()

    // you can also create in array as the following example
    var array= arrayOf(Rectangle(),Circle(),Square())
    for (Shape in array){
        Shape.Draw()
    }

}

//Parent class or Main Class
open class Shape{
    open fun Draw(){
        println("Drawing is started")
    }
}
//BElow is child clasess
class Rectangle : Shape() {
    override fun Draw(){
        println("Rectangle is drawing")
    }
}
class Circle: Shape(){
    override fun Draw() {
        println("Circle is drawing")
    }
}
class Square : Shape(){
    override fun Draw() {
        println("Square is drawing")
    }
}