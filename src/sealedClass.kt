fun main(){
    var loading = Loading()
    var failure = Result.Failure()
    var sucess = Sucess()
    stateCheck(loading)
    stateCheck(failure)
    stateCheck(sucess)


}
fun stateCheck(state:Result){
    when(state){
        is Loading -> println("Loding")
        is Result.Failure -> println("Failed")
        is Sucess -> println("Sucessful")
    }
}

sealed class Result {
    class Failure:Result(){

    }
}
class Loading:Result(){}
class Sucess:Result(){}