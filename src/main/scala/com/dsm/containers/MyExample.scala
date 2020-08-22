package com.dsm.containers

object MyExample {
 def main(args: Array[String]): Unit = {

   case class Walnut(name: String, city: String, address: String)
   val Donut = Walnut("ChocolateDonut", "Bhilai", "Maroda")
   print(s"There is only one number and that is ${Donut.name}\n")
   print(s"There is only one number and that is ${Donut.city}\n")
   print(s"There is only one number and that is ${Donut.address}\n")

   println(s"\n")

   

//Difference between list and tuple is that tuple can contain data of multiple data types and List can hold only a single data type
//Difference between list[Any] and tuple is that tuple preserves the data types of the elements
// whereas List[Any] converts all the elements fof different data type into Any
   val donutIngredients = List[Any](1,"hello",2.2)
   for(list <- donutIngredients){
     println(s"The contents of the list is ${list}")
   }


//Difference between an Array and a List if List are immutable whereas Arrays are mutable
// Array is Invariant and List is Covariant

    val foods = List("Roti","Daal","Chawal", "Sabji","raita","GulabJamun","Lassi","")

   for(food <- foods if food == "Roti"){
     println("\nWe have found roti and we are so happy\n")
   }

// List comprehension, getting only selected values from the list and storing them in the new list

   val selectedIngredients: List[String]= for {
     food <- foods
     if(food =="chawal" || food == "Roti")
   } yield food

   println(s"The food which we have got today is ${selectedIngredients}\n")

//Defining a two dimensional array

    val twoDimensionalArray = Array.ofDim[String](2,2)
    twoDimensionalArray(0)(1) = "flour"
    twoDimensionalArray(0)(1) = "sugar"
    twoDimensionalArray(1)(0) = "egg"
    twoDimensionalArray(1)(1) = "syrup"

   for(x <- 0 until 2; y <- 0 until 2){
       println(s"The elements at the index ${(x,y)} = ${twoDimensionalArray(x)(y)} \n")
   }

   val numberRange = 1 to 5
   println(s"The number range is ${numberRange} \n")

//We can convert the above it into Array, Set or List according to our convenience

   val numberRangeList = (1 to 5).toList
   println(s"The Number range of the list is ${numberRangeList} \n")



// So we can use while loop as well in scala

   var numberOfCakes = 10
   while(numberOfCakes > 0){
    println(s"The number of cakes available is ${numberOfCakes}")
     numberOfCakes -= 1
   }

   var ranges = 0
   do {
     ranges += 1
     println(s"\n The current range is ${ranges}")

   }while(ranges < 5)

   val str1: String = null

   println(str1)




 }





}
