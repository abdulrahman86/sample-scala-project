package sample.project.scala.scalaapp

import sample.project.scala.Test


/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    val test = new Test;
    
    println( test.print());
    println("concat arguments = " + foo(args))
  }

}
