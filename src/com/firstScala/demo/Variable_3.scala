package com.firstScala.demo

/**
 * @author fujh
 *  3、Scala变量：
 *    1、使用关键字var声明变量。
 *    2、使用关键字val申明常量。
 */
object Variable_3 {

  def main(args: Array[String]): Unit = {

    /**
     * 变量：变量是一种使用方便的占位符，用于引用计算机的内存地址，变量创建后会占用一定的内存空间
     */

    //1、声明变量，该变量可以再次被赋值
    var str : String = "heloworld"
    println(str)

    //2、声明常量，声明的常量不能再次被赋值
    val cons : String = "我是一个常量"
    println("声明一个常量："+cons)

    //3、变量类型的声明，在变量名后面添加冒号和具体变量类型。如下
    var var1 : Integer = 11
    println("输出一个声明了类型的变量："+var1)

    //4、变量类型引用
    // Scala在声明变量时不一定需要设定变量的类型，可以赋予变量初始值，通过初始值来推断出变量的数据类型（但不给定初始值会抛出异常）。如下：
    var var2 = 111;   //会被推断为int类型
    val val1 = "啦啦啦啦啦，我是卖报的小行家 \n"  //会被推断为String类型
    var var3 =  """嘿嘿H阿什顿发阿萨德发送大的
               多行字符串
        """ //会被推断为String类型
    println("打印一些变量类型引用的变量："+var2+"---- val1="+val1+"---var3="+var3)

    //5、多变量声明
    var var5,var6 = 1111;    //这两个变量的初始值都是1111
    println("多变量申明："+var5+"---var6="+var6)


  }

}
