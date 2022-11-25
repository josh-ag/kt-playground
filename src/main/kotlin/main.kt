fun main() {
    /*
    ===============
    TEMPLATE STRING
    ===============

    var greet:String = "Hello World!"
    val str2:String = "$greet \nI am a Kotlin Programmer."
    println(str2)
     */


    /*
    =====================
    CONDITION STATEMENT
    =====================

    fun maxOf(a:Int,b:Int){
        if(a > b) {
            println("$a is greater than $b")
        }else{
            println("$a is less than $b")
        }

    }



    //INLINE CONDITION STATEMENT IN FUN
    fun maxOf(a:Int, b:Int) = if(a>b) println("$a is greater than $b") else println("$a is less than $b")
    maxOf(b=10 , a=19)

     */




    /*
    =====================
        LOOP
   =======================

    //For Loop
    //immutable list
    val items = listOf<String>("Apple", "Google","Amazon","Tesla", "Uber")

    println("Top 5 Silicon Valley Companies:")
    for(index in items.indices){
        println("$index ${items[index]}")
    }

    //ForEach Loop
    val items = listOf<String>("Apple", "Google","Amazon","Tesla", "Uber")
    println("Top 5 Silicon Valley Companies: ")
    items.indices.forEach {index->
        println("$index ${items[index]}")
    }

    //While Loop
    val items = listOf<String>("Apple", "Google","Amazon","Tesla", "Uber")
    var index = 0
    println("\nTop 5 Silicon Valley Companies: ")
    while (index < items.size){
        println("$index ${items[index]}")
        index++
    }

    //ForEachIndexed Loop
    val companies = arrayOf("Apple","Amazon","Google","Facebook","Tesla")
    println("\nTop 5 most valued company in Silicon Valley: ")
    companies.forEachIndexed(){ index,company->
        println("$index $company")
    } */



    /*
    ==========================
    WHEN STATEMENT
    ==========================

    var companies = arrayOf("Apple","Google", "Amazon","Tesla","Facebook","Uber")

    when(companies.size){
        0-> println("There are No valued Company in Silicon Valley")
        else -> println("There are ${companies.size} top valued companies in Silicon Valley")
    }

    var name:String?="Gems"
    when(name){
        null-> println("Hello, your name can't be determined")
        "steven"-> println("Hello, your name is Steven")
        "Victor" -> println("Hello, your name is Victor!")
        else-> println("Hello, Your name is $name!")
    }
  */


    /*
    =============================
    List Types
    //arrayOf()||mutableArrayOf()
    //listOf() || mutableListOf()
    //mapOf() || mutableMapOf()



    //mapOf()

    var myMap = mapOf(1 to "Agbo",2 to "gems",3 to "joshua","name" to "gems")
    for(key in myMap){
        println(key)
   }

    //loop through map
    myMap.forEach{entry->
        println(entry)
    }
    loop through map keys
    return only map keys
    println("Map Keysd")
    for(key in myMap.keys){
        println("$key")
    }

    //loop through map values
    println("\nMap Value: ")
    for(value in myMap.values) println("$value")
  */

    /*
    ===============
    Vararg
    ===============

    var companies = arrayOf("App","Google","Amazon","Tesla", "Microsoft","Facebook")
    println("\nTop 5 most valued companies in Silicon Valley: ")
    fun textVararg(vararg items:String){
        for(item in items){
            println(item)
        }

    }

    textVararg(*companies)

    val persons = listOf<String>("gem", "josh","john", "chinedu", "I_josh")
    val newPersons =  persons
        .filter{ it-> it.startsWith('j') }
        .sortedBy{ it }
        .map{ it-> it.toUpperCase() }

    for(person in newPersons) println(person)
 */

    /*
    =============================
    CLASSES
    =============================
     */
    val gems = Person("Gem","Joshua")
    gems.nickName = "Gems"


    gems.printInfo()

//    var companies = listOf<String>("Apple","Google","Amazon","Tesla", "Microsoft","Facebook")

  var myMap = mapOf("name" to "joshua", "age" to 23, "occupation" to "Software Engineer")
    //access entry of a map
    println(myMap["name"])

    //traverse a map
    for((k,v) in myMap) println("$k to $v")


//    val values = mapOf( "Occupation" to "Software Engineer")
//    val email = values["email"] ?: throw IllegalStateException("Email is missing!")

    fun transform(color: String): Int = when(color){
        "Red" -> 1
        "Green" -> 2
        "Blue" -> 3
        else -> throw IllegalStateException("Illegal Color Param")
    }

    val colorTransform = transform("Green")
    println("This color map to $colorTransform")

    var a:Int = 2
    var b:Int = 10
    println(b)

    b = a.also { b = a }
    println(b)

    var ab:Int
//   for(company in companies){
//       when(company) {
//           "Apple" -> println("$company Sweet!")
//           "Google" -> println("$company Geeky (`_`) ")
//           "Tesla" -> println("$company Intelligence (`.`)")
//           else -> println(company)
//       }
//   }


}