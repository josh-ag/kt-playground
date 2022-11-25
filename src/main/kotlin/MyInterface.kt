interface MyInterface {
    val prop:Int //abstract prop

    val propWithImplementation:String //prop with implementation
//        get() = "foo"
        get() {
            return "Foo!"
        }

    fun foo(){
        println(prop)
    }
}

//class Child:MyInterface{
//    override val prop:Int = 30 //implement interface prop
//}

//Other way class implement interface
class Child(override val prop:Int=100):MyInterface


interface TestInterface {
    fun foo()
    fun bar(){
        println("Am a Kotlin programmer")
    }
}

class MyTestClass:TestInterface{
    override fun foo() {
        println("Hello World!")
    }

}

//resolving override conflict
interface A{
    fun foo()
    fun bar(){
        println("Interface A")
    }
}

interface B{
    fun foo()
    fun  bar(){
        println("Interface B")
    }
}

interface C{
    fun foo(){
        println("C Foo")
    }
    fun bar(){
        println("C Bar")
    }
}

class ImplB:B{
    override fun foo() {
        println("B foo")
    }
}

class ResolveOverrideConflict : A,B,C{
    override fun bar() {
        super<A>.bar()
        super<B>.bar()
        super<C>.bar()
    }

    override fun foo(){
        print("Hello World")
    }

}

fun main(){
    val testClass = MyTestClass()
    testClass.foo()
    testClass.bar()

    val myObj = Child(250)
    myObj.foo()
    println(myObj.propWithImplementation)

    val testOverrideConf = ResolveOverrideConflict()
    testOverrideConf.foo()
//    testOverrideConf.bar()
}

