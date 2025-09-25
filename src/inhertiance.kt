fun main(){
     var parent = ChidClass();
    println(parent.name)
    println(parent.name2)
    parent.method1()
    parent.method2()
}
open class ParentClass{
    var name =" i m parent ParentClass"
    fun method1(){
        println("Im parent class")
    }
}

class ChidClass: ParentClass() {
      var name2= "Child class"
    fun method2 (){
        println("Im child class")
    }

}