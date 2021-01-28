package com.firstScala.demo

/**
 * @author fujh
 * 16、模式匹配
 *  1、 Scala提供了强大的模式匹配，应用也非常广泛。
 *  2、类似于Java的Switch/Case，但是功能比Switch/Case要强大
 *  3、使用示例1：  def 方法名:返回值 = 匹配变量 match {
 *                    case 匹配变量值 => 响应结果
 *                    case 匹配变量值 => 响应结果
 *                    case 匹配变量值 => 响应结果
 *                    case _ => 响应结果  //default默认响应结果
 *                }
 *  4、关键字：match、case、=>
 */
object PatternMatching_16 {

  /**
   * 定义了一个匹配模式
   * 定义匹配number参数的值，返回一个字符串，使用关键字
   * @param number
   * @return
   */
  def testMatch(number:Int):String = number match {
    case 1 => "？？？？"
    case 2 => "嘿嘿"
    case 3 => "啦啦啦"
    case _ => "wa de 发ke" //default
  }

  def main(args: Array[String]): Unit = {
    //1、简单使用模式匹配
    println(testMatch(1))
    println(testMatch(2))
    println(testMatch(3))
    println(testMatch(4))

    //2、使用样例类来使用匹配模式
    val p1 = Person("小黑", 11)
    val p2 = Person("小白", 12)
    val p3 = Person("小黄", 13)
    val p4 = Person("小兰", 14)
    val p5 = Person("小瓜", 15)
    val list = List(p1,p2,p3,p4,p5) //List是不变集合，所以需要初始化好

    for(p <- list){
      p match {
        case Person("小黑",11) => p.toString
        case Person("小白",12) => p.toString
        case Person("小黄",13) => p.toString
        case _ => p.toString
      }
      println("第二次输出："+p)
    }
  }

}

/**
 * 申明一个样例类，关键字：case
 * @param name
 * @param age
 */
case class Person(name:String,age:Int){
  /**
   * 重写toString方法
   * @return
   */
  override def toString:String={
    //println(name+"-"+age)
    name+"-"+age
  }
}



