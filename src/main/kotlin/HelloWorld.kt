package io.github.katpb

import kotlin.reflect.typeOf

fun main() {
    var name = "kathir"
//    name = "suganya"

    var result = if (name.length == 6) {
        "your name length is equal to 6"
    } else {
        "your name length is not equal to 6"
    }
    println(result)
}