package com.firstScala.demo

/**
 * @author fujh
 *  9、闭包
 *    1、闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。
 *    2、闭包通常将可以简单的认为是可以访问一个函数里面局部变量的另一个函数。
 *
 *    闭包：简单认为是可以访问一个函数里面局部变量的另一个函数。
 */
object Closure_9 {

  /**
   * 声明一个方法
   * @param i
   * @return
   */
  def testMethod(i:Int):Int = {
    i  //如果只剩一行，可以省略return关键字
  }

  var ttt = testMethod(2)

  var a = 1
  var factor = 3
  var multiplier  = (i:Int) => i * factor   //这里就形成了一个闭包，闭包就是可以访问函数里面的局部变量，这里访问的是i

  def main(args: Array[String]): Unit = {
    //方法调用
    println("testMethod:"+ttt)
    println("testMethod:"+testMethod(112123))

    println(multiplier(2222))
    println(multiplier(4444))
  }

}
