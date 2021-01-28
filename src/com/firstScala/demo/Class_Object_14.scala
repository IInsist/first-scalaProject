package com.firstScala.demo

/**
 * @author fujh
 *  14、类和对象
 *    1、类是对象（Object）的抽象。类是抽象的，不占用内存，而对象是具体的，占用存储空间。类是用于创建对象的蓝图，
 *    它是一个定义包括在特定类型的，对象方法和变量的软件模板。
 *    2、Scala类是不声明为Public的，一个Scala源文件中可以有多个类
 *    3、类可以使用new关键字来实例化类，并访问类中的方法和变量。
 *      例如：val obj = new Class_Object_14()
 *    4、Scala类可以有参数，类似于带有参数的构造函数
 *      例如：class ClassTest(xx:String,yy:String){
 *          //类的体内
 *       }
 *    5、Scala继承，extends
 *      1）重写一个非抽象方法必须使用override修饰符
 *      2）重写超类中抽象方法不必须使用override修饰符
 *      2）只有主构造函数才可以往基类的构造函数里写参数
 *      4）只允许继承一个父类
 *    6、Scala单例对象
 *      1）Scala没有static关键，但是它是通过object关键字来申明一个Object，且名称和类名相同
 *      2）单例对象不能带有参数
 *      3）当单例对象和类名相同时，单例对象也被称为这个类的伴生对象
 */

/**
 * 将Class_Object_14类构造方法里的参数传送给ClassTest
 * override 关键字描述的是重写父类的属性或方法
 */
class Class_Object_14(override val x:String,override val y:String) extends ClassTest(x,y) {
  //声明第一个类

  //重写非抽象方法一定要携带override关键字
  def dddddd(): String = x+"-ddddddd-"+y
}

//Scala类可以有参数，类似于带有参数的构造函数
class ClassTest(xx:String,yy:String){
  //声明第二个类
  val x: String = xx
  val y: String = yy
  private val z = ""

  def showInfo():String={
    val info = x +"-父类的方法-"+ y
    info
  }
}

/**
 * 定义一个ClassTest类的单例对象，该单例对象可以访问类的私有属性，并且设定自己的属性和方法
 */
object ClassTest{

  //好像默认的方法(这里不太懂)
  def apply(str: String, str1: String) :String ={
    str1+str
  }

  private val str = "ssssss"
  def pppp(s:String): Unit ={
    println(s+"-单例类啦-"+str)
  }

}

object test{
  def main(args: Array[String]): Unit = {
    //通过类来实例化一个对象Object
    /*val d = new ClassTest("222222","444444")
    val str = d.showInfo()
    println(str)*/

    //实例化一个存在父类的方法
    val c4 = new Class_Object_14("画画的贝贝","嘟嘟嘟嘟的")
    println("调用父类的方法："+c4.showInfo())
    println()
    println("调用自己的方法："+c4.dddddd())

    println(ClassTest("sss","222"))  //这里不是实例化一个对象，而是通过单列对象进行对apply方法调用
    //调用单例类（中间省略了.()）
    ClassTest pppp "2222222"   //等同于ClassTest.pppp("2222222")
  }
}