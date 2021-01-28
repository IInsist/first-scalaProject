package com.firstScala.demo

/**
 * @author fujh
 *  4、Scala访问修饰符：
 *    Scala的访问修饰符和Java基本一致，如下：
 *      public：公开的
 *      private：私人的
 *      protected：受保护的（仅子类和本身能访问，和包内其他类可访问）
 *
 *      注：没有任何关键字修饰的默认public
 */
object VisitModifier_4 {

  //内部类
  class Father{
    private def method(){
      println("helloworld ")
    }

    //内部类中的内部类
    class Son{
      //内部类可调用相对外部类中的private方法
      method()
    }

  }
}
