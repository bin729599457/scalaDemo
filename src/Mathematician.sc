
var msg="hello world"
var masg=square(3)


/**
  * Scala 函数以 def 定义，之后是函数的名称（如 max )，然后是以逗号分隔的参数。
  * Scala 中变量类型是放在参数和变量的后面，以 ： 隔开。
  * 这样做的一个好处是便于“ type inference ”。刚开始有些不习惯（如果你是 Pascal 程序员可能会觉得很亲切）。
  * 同样如果函数需要返回值，它的类型也是定义在参数的后面（实际上每个Scala函数都有返回值，
  * 只是有些返回值类型为 Unit ，类似于 void 类型）。
  */
def square(x: Int) =
  {x * x}
square(2)

def max(x:Int,y:Int) : Int ={
   if (x >y) x
   else y
}
max(6,7)

def greet() = println("hello")
greet()

/**
  * Scala 不支持 ++i 和 i++ 运算符，因此需要使用 i += 1 来加一。
  * 这段代码看起来和 Java 代码差不多，实际上 while 也是一个函数，
  * 你自然可以利用 Scala 语言的扩展性，实现 while 语句，
  * 使它看起来和 Scala 语言自带的关键字一样调用。
    Scala 访问数组的语法是使用 () 而非 [] 。
  */
val args=Array("I","like","scala")
var i=0;
while (i<args.length){
  println(args(i))
  i+=1
}

args.foreach(arg =>println(arg))

args.foreach( println)

/**
  * 因此这里的 0 to 2， 其实为 (0).to(2) 调用的为整数类型的 to 方法，to 方法使用一个参数。
  * Scala 中所有的基本数据类型也是对象（和 Java 不同），因此 0 可以有方法（实际上调用的是 RichInt 的方法），
  * 这种只有一个参数的方法可以使用操作符的写法（不用 . 和括号），实际上 Scala 中表达式 1+2 ，最终解释为 (1).+(2)+，
  * 这也是 Int 的一个方法，和 Java 不同的是，Scala 对方法的名称没有太多的限制，你可以使用符号作为方法的名称。
  */
val greetStrings = new Array[String](3)
greetStrings(0)= "Hello"
greetStrings(1)= ","
greetStrings(2)= "world!\n"
for(i <- 0 to 2)
  print(greetStrings(i))

