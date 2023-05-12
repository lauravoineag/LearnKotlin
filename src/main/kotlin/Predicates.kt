fun main(args:Array<String>):Unit{
    val ints = listOf(1,2,3,4,5)
    val greaterThanThree = { v:Int -> v > 3 } //create a predicate

    //var largeInts =ints.all{ it > 3} //do all ints have a value greater than 6- w/o predicate
    var largeInts =ints.all(greaterThanThree) // with predicate but we need to pass it in all method()
    println(largeInts)

    largeInts =ints.any{ it > 3} //do any ints in collection satisfy the predicate?
    println(largeInts)

    var numberLargeInts = ints.count{ it > 3} //count items that satisfy the predicate?
    println(numberLargeInts)

    var found =ints.find(greaterThanThree)
    println(found)
    var notFound = ints.find{it >6}
    println(found)



}