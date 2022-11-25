class Person (private val firstName:String = "John", private val lastName:String = "Doe"){

    var nickName:String? = null
        set(value){
            field = value
            println("\$Settr: My new alias is $value")
        }

    fun printInfo(){
        println("My name is $firstName $lastName and my nickname is $nickName")
    }

}