package com.lucas.study.scala.CombinationAndInheritance.TraitInheritance

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-1
 * Time: 上午11:14
 * To change this template use File | Settings | File Templates.
 */
object Test extends App {
    val bird = new BlueBird
    println(bird.name)
    bird.fly()
    bird.walk()
    bird.flyWithNothing()
    bird.eat()
}
