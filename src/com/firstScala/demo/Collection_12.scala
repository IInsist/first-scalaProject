package com.firstScala.demo

import scala.collection.mutable
//导入不可变Map
//import scala.collection.immutable.Map
//导入可变Map

//导入不可变Set
//import scala.collection.immutable.Set
//导入可变Set
/**
 * @author fujh
 *  12、集合
 *    1、Scala集合分为可变集合和不可变集合
 *      可变集合：在scala.collection.mutable包下，例如：Iterator、Map、Set
 *      不可变集合：在scala.collection.immutable包下，例如：List、Map、HashMap、Set
 *        不可变集合永远不会改变，但是仍然可以添加、移除、删除、更新操作，在这些操作下每一种情况都会返回一个新集合、同时使原来的集合不回复阿生改变。
 *
 *    2、以下几种常用集合
 *      List集合、Set集合、Map映射、元组、Iterator迭代器
 */
object Collection_12 {
  def main(args: Array[String]): Unit = {
    //1、List集合（不变集合），一旦被定义则永远不会改变。
    val list:List[String] = List("1","2")

    val list2 = list.+:("2222")  //在左侧添加 “2222” 元素，结果： 2222,1,2
    println("list2:"+list2.toString())

    val list3 = list.:+("2222")  //在右侧添加 “2222” 元素，结果： 1,2,2222
    println("list3:"+list3.toString())

    val list4 = list2.::("33333")  //在开头添加 “33333” 元素，结果： 33333,2222,1,2
    println("list4:"+list4.toString())

    //经过上述几个操作后，list变量集合始终没有发生变化，仍然是：1,2
    for (a <- list){
      println(a)
    }

    //将List中值都添加到StringBuilder对象中，并设定分隔符“|”
    val builder = new StringBuilder()
    println("builder:"+builder)

    //2、Map 键值对映射
    /**
     * Map分为可变和不可变两种，区分如下：
     *  可变Map所在包：scala.collection.mutable.Map
     *  不可可变Map所在包：scala.collection.immutable.Map
     *
     *  不可变Map一旦被定义，则永远都不会发生改变，但是仍然可以进行操作，在每一次操作之后都会形成新的集合。
     */
    val map : mutable.HashMap[String,String] = new mutable.HashMap()  //声明的是可变Map
    val map2 = new mutable.HashMap[String,String]  //声明的是可变Map
    //添加键值对
    map += ("键1"->"值")
    map += ("键2"->"值2")
    map += ("键3"->"值3")
    map += ("键4"->"值4")

    map2 += ("1"->"1")
    map2 += ("2"->"2")
    map2 += ("3"->"3")
    map2 += ("4"->"4")
    map2 += ("5"->"5")

    //移除键值对
    map -= "键3"

    //获取值
    println("获取键对应的值："+map("键2"))

    //获取所有键的Set
    val set = map.keySet
    for (a <- set){
     println("key:"+ a +"  value:"+map(a))
    }

    println()
    println()
    //合并Map
    val mapAll = map ++ map2
    //遍历合并后的mapAll
    mapAll.keys.foreach(key =>
      println("key"+ key +"  value:"+mapAll(key))
    )

    //3、Set集合是没有重复元素的集合，所有的元素都是唯一的
    /**
     * Set分为可变和不可变，默认采用不可变。如下区别：
     *  可变Set集合所在包：scala.collection.mutable
     *  不可变Set集合所在包：scala.collection.immutable
     */
    val setObj = mutable.Set[String]("1","2","3")
    val setObj2 : mutable.Set[String] = mutable.Set("11","22","33")

    //添加元素
    setObj += "4"
    setObj += "5"
    setObj += "5"

    setObj2 += "44"
    setObj2 += "55"
    setObj2 += "66"

    //删除元素
    setObj2 -= "66"

    println("Set学习")
    for (a <- setObj){
      println(a)
    }

    //合并Set
    val setAll = setObj ++ setObj2
    setAll.foreach(value =>
        println("合并后的值："+value)
    )

  }
}
