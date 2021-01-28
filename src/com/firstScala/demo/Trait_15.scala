package com.firstScala.demo

/**
 * @author fujh
 * 16、Scala Trait（特征）
 *  1、相当于Java的接口，实际上比Java的接口功能还要强大，
 *  2、与接口不同的是，它还可以定义属性和方法的是实现
 *  3、Scala的Trait（特征）更像Java的抽象类，抽象类中可以存在已实现的方法
 *  4、与Java接口一致，实现类可以同时实现多个接口，Scala类可以实现多个Trait（特征），extends关键字进行实现
 *  5、特征的构造顺序：
 *    1）先不了解这个
 */
trait Trait_15 {

  /**
   * 声明一个抽象方法
   * @param a
   * @param b
   * @return
   */
  def showInfo(a:String,b:String):String

  /**
   * 声明一个实现方法
   * @param a
   * @param b
   * @return
   */
  def showInfoShiXian(a:String,b:String):String={
    println("我自己是可以实现方法滴呦")
    println("所以我更像一个抽象类")
    showInfo(a,b)
  }

}
