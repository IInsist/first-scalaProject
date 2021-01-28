package com.firstScala.demo

/**
 * @author fujh
 *  10、字符串
 *    在Sclca中定义的String其实就是Java的String类。在Scala中没有字符串类
 */
object String_10 {

  //定义一个字符创常量
  val str :String = "HELLO_WORLD"

  def main(args: Array[String]): Unit = {
    println("输出常量："+str)

    var sb = new StringBuilder()
    sb.append("22222")
    println(sb)

    var sf = new StringBuffer("awsdfasdf")
    sf.append("12122222")
    println(sf)
  }
}
