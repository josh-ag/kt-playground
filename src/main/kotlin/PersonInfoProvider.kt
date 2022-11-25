interface PersonInfoProvider {
    fun printInfo(person: Person)
}

class BasicInfo:PersonInfoProvider{
    override fun printInfo(person: Person) {
        println("Person Info")
    }
}


fun main(){
    val provider = BasicInfo()
    provider.printInfo(Person())

}