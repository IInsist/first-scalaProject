package com.firstScala.demo

/**
 * Trait（特征）实现类，使用extends关键字进行实现Trait
 */
class Trait_impl_15 extends Trait_15 {

  /**
   * 声明一个抽象方法
   *
   * @param a
   * @param b
   * @return
   */
  override def showInfo(a: String, b: String): String = {
    a+"-我不想加班-"+b
  }

}

object Trait_impl_15{
  def main(args: Array[String]): Unit = {
    val c = new Trait_impl_15()
    println(c.showInfoShiXian("天啦噜","害"))
  }
}
