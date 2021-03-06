object TestScalaDemo extends App {

  /**
    * 和 Java 的 List 不同，Scala 的 Lists 对象是不可修改的。
    * 它被设计用来满足函数编程风格的代码。它有点像 Java 的 String，String 也是不可以修改的，
    * 如果需要可以修改的 String 对像，可以使用 StringBuilder 类。
    */
  /*  val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val oneTwoThreeFour=oneTwo ::: threeFour
    println (oneTwo + " and " + threeFour + " were not mutated.")
    println ("Thus, " + oneTwoThreeFour + " is a new list")*/


  /*  val pair=(99,"Luftballons")
    println(pair._1)
    println(pair._2)*/


/*  var jetSet = Set("boxing", "air")
  jetSet +="Lear"
//  println(jetSet)

  val romanNumeral=Map(1->"I",2->"Ⅱ",3->"Ⅲ")
  println(romanNumeral)*/
  def printArgs(args:Array[String]):Unit={
    var i=0
    while (i<args.length){
      println(args(i))
      i+=1
    }
  }


 def printAgs(args:Array[String]):Unit={
    args.foreach(println)
  }


  val strings=new Array[String](3)
  strings(0)="a"
  strings(1)="b"
  strings(2)="c"

  printAgs(strings)
}
