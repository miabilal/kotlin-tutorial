class Outerclass {
    private var name ="im Outeerclass"

  inner  class innerClass {

        fun inClass(){
            println("im inner class$name")
        }
    }
}
fun main (){
    var Abc= Outerclass().innerClass()
    Abc.inClass()
}