package com.lucas.study.scala.CombinationAndInheritance.TraitInheritance

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-1
 * Time: 上午11:12
 * To change this template use File | Settings | File Templates.
 */
class BlueBird extends Bird with Fly with Walk with Eat {

    def flyWithNothing() {
        println("Blue Bird Fly With Nothing!")
    }

    override def eat() {
        println("Blue Bird Is Eating Something!")
    }
}
