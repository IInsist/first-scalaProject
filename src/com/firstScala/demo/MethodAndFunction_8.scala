package com.firstScala.demo

/**
 * @author fujh
 * 8、方法与函数
 *  Scala中的函数（方法）和Java类似，是组成类的一部分。
 *  函数（方法）可以赋值给一个变量
 *  函数（方法）可以当做一个参数传入另一个方法体内
 *  函数（方法）定义关键字：
 *      def 方法名 ([参数]) : [返回类型]  = {
 *            方法主体
 *        }
 */
object MethodAndFunction_8 {

  /**
   * 声明方法
   *  关键字：def 方法名 ([参数]) : [返回类型]
   * @param info 参数，可定义类型
   * @return 返回String类型的值
   */
  def shwoInfo(info : String): String = "我输出的信息："+info

  /**
   * 设定Int返回类型
   * @param a
   * @param b
   * @return 返回类型为 Int
   */
  def testMethmod(a :Int,b:Int):Int ={
    a+b
  }

  /**
   * 设定方法Void类型， 不带返回值
   * @param a
   * @param b
   */
  def voidMethod(a :Int,b:Int) :Unit = {
    println("a:"+a)
    println("b:"+b)
  }
  /**
   * 主程序，不带返回值
   * @param args
   */
  def main(args: Array[String]): Unit = {
    //方法调用
    val str = shwoInfo("啦啦啦啦啦")
    println(str)

    val sum = testMethmod(1111, 2222)
    println("sum:"+sum)

    voidMethod(111, 2222)
  }

}
