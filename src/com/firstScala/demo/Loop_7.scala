package com.firstScala.demo

import scala.util.control.Breaks.break

/**
 * @author fujh
 *  7、循环
 *    1、for循环
 *    2、while循环
 *    3、doWhile循环
 */
object Loop_7 {
  def main(args: Array[String]): Unit = {

    //1、for循环

    //1.1、简单遍历数组
    var list = List(1,2,3,4,5,6,7,8,9,10)
    for ( a <- list){   //a变量可以不用var关键字声明，但只能在for循环语句体中使用
      println(a)        // A <- B 指代将B的值赋予给A
    }
    println("")

    //1.2、
    for (a <- 1 to 10){   // 1 to 10 直到从1到10
      println(a)
    }
    println("")

    //1.3、
    for (a <- 1 until 10){   // 1 to 10 直到从1到10，1到10但不包括10
      println(a)
    }
    println("")

    //1.4、for循环过滤
    for (a <- list if a!=3 ; if a > 8 ){   //条件过滤，多个条件会进行叠加，多个条件可通过; 进行隔开
      println(a)
      break()
    }
    println("")

    //1.5、将循环的结果返回至一个目标变量中
    //关键字：yield 变量名
    var yieldResult = for {a <- list if a > 3; if a < 7}yield a
    for(a <- yieldResult){
      println(a)
    }
    println(yieldResult)

    //2、while循环
    var a = 0
    while (a<10){
      println(a)
      a+=1
      if(a==5){
        println("helloworld")
      }
    }
    println("")

    //3、doWhile循环，至少执行一次
    a = 0
    do{
      println(a)
      a+=1
    }while(a<20)

  }
}
