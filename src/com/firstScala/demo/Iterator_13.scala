package com.firstScala.demo

/**
 * @author fujh
 *  13、迭代器
 *    迭代器不是一个集合，它是一个访问集合的方法
 *    迭代器访问集合的两个基本方法为：next() 和 hasNext()
 *    迭代器最好采用while循环方法进行进行迭代
 */
object Iterator_13 {
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](1,2,3,4,5,6,7,8,9,10)

    arr.foreach(i => println(i))
    println()
    println()
    val iterator = arr.iterator
    while (iterator.hasNext){
      val i = iterator.next()
      println(i)
    }

  }
}
