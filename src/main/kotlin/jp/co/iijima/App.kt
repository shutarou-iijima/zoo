package jp.co.iijima

import com.iijima.Cat
import com.iijima.Dog

class App {}

fun main(args: Array<String>) {
    val dog = Dog()
    println(dog.nakigoe())

    val cat = Cat()
    println(cat.nakigoe())
}
