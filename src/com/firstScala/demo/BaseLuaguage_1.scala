// Scala语言表示的包名，和Java语言相同
package com.firstScala.demo

//Scala引用关键字和Java语言相同
import java.lang.String
import java.util._   //引用包内所有成员方法
import java.time.{LocalDate,LocalTime,LocalDateTime} //引用包内多个成员方法
import java.util.{HashMap => JavaHahMap}  //重命名应用成员的名称
import java.util.{HashMap => _,_} //引入util包下除了HashMap的所有成员。

/**
 * @author fujh
 *  1、基础语法学习类
 */
object BaseLuaguage_1 {

  /**
   * 主程序，输出helloworld
   * @param args
   */
  def main(args: Array[String]): Unit = {
    println("Hello Scala!")

    // ; Scala语言分号符可有可无。分号的存在只会作为换行符的作用
    println("Hello Scala!")
  }
}
