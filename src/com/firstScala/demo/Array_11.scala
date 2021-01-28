package com.firstScala.demo


/**
 * @author fujh
 *  11、数组
 *    数组用来存储固定大小的同类型元素，并且需要固定长度。
 *     需同集合概念分开
 */
object Array_11 {

  //声明一个String数组
  var arr = new Array[String](10)

  //声明一个Int数组
  var arrInt:Array[Int] = new Array[Int](10)

  def main(args: Array[String]): Unit = {

    //1、数组的相关操作
    arr(0) = "00000"
    arr(1) = "11111"
    arr(2) = "22222"
    arr(3) = "33333"
    arr(4) = "44444"

    for (a <- arr){
      println(a)
    }

    //2、for循环输出
    arrInt(0) = 0
    arrInt(1) = 1
    arrInt(2) = 2
    arrInt(3) = 3
    arrInt(4) = 4
    arrInt(5) = 5

    var sum = 0
    //计算集合中的和
    for (a <- 0 to (arrInt.length-1)){  // 输出次数为 0 - 数组长度
      sum += arrInt(a)
    }
    println("arrInt.toString() ==>" +arrInt.toString)
    println("输出总和："+sum)


    //3 多维数组 声明一个高2，宽2的二维数组
    val mArray = Array.ofDim[Int](2, 2)
    mArray(0)(0) = 1
    mArray(0)(1) = 2
    mArray(1)(0) = 11
    mArray(1)(1) = 22

    //输出数组的长度，只获取高的长度
    println("mArray.length="+mArray.length)

    //遍历多维数组
    for (i <- 0 to 1){  //高2
      for (j <- 0 to 1){  //宽2
        println("输出内容："+mArray(i)(j))
      }
    }

  }
}
