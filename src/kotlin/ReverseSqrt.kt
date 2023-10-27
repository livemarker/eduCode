package kotlin

import kotlin.math.sqrt

fun main(args: Array<String>) {
    val list = ArrayList<String>()
    list.add("  121 ")
    list.add("4  3")
    list.add("    25   36  ")
    list.add("    251231231231           361231231  ")
    list.add("    2444445   36.2332  ")
    getNumbersSqrt(list)
}

fun getNumbersSqrt(list: List<String>) {
    list.forEach {
        var number = ""
        it.forEach { char ->

            if (char != ' ') {
                number += char
            } else {
                if (number.isNotEmpty()) {
                    println(String.format("%.4f", sqrt(number.toDouble())))
                    number = ""
                }
            }
        }
    }
}
