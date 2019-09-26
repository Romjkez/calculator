package com.example.myapplication

import java.io.IOException

class Calculator(var first: String, var second: String, var operation: OperationType?) {

    fun calculate(): Int {
        if (operation == OperationType.C) {
            return 0
        } else if (operation== OperationType.PLUS) {
            return first.toInt() + second.toInt()
        } else if (operation== OperationType.MINUS) {
            return first.toInt() - second.toInt()
        } else if (operation== OperationType.MULTI) {
            return first.toInt() * second.toInt()
        } else if (operation== OperationType.DIVIDE) {
            return first.toInt() / second.toInt()
        } else if (second == "") {
            return first.toInt()
        }  else if (first == "" || operation == null) {
            return second.toInt()
        } else throw IOException("Unknown operation")
    }
}
enum class OperationType {
    PLUS,
    MINUS,
    MULTI,
    DIVIDE,
    C
}