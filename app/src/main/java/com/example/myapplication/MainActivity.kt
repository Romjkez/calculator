package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val calculator = Calculator("", "", null)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonPlus.setOnClickListener { onPlus() }
        buttonMinus.setOnClickListener { onMinus() }
        buttonMulti.setOnClickListener { onMulti() }
        buttonDivide.setOnClickListener { onDivide() }
        buttonEnter.setOnClickListener { onResult() }
        buttonC.setOnClickListener { onC() }

        button0.setOnClickListener { onZero() }
        button1.setOnClickListener { onOne() }
        button2.setOnClickListener { onTwo() }
        button3.setOnClickListener { onThree() }
        button4.setOnClickListener { onFour() }
        button5.setOnClickListener { onFive() }
        button6.setOnClickListener { onSix() }
        button7.setOnClickListener { onSeven() }
        button8.setOnClickListener { onEight() }
        button9.setOnClickListener { onNine() }
    }

    private fun onC() {
        calculator.operation = OperationType.C
        onResult()
    }

    private fun onResult() {
        if (calculator.second.trim() == "" && calculator.operation == OperationType.DIVIDE) {
            resultView.text = "Error"
        } else
            resultView.text = calculator.calculate().toString()
        editDisplay.text = ""
        calculator.operation = null
        calculator.first = ""
        calculator.second = ""
    }

    private fun onPlus() {
        calculator.operation = OperationType.PLUS
        editDisplay.text = null
    }

    private fun onMinus() {
        calculator.operation = OperationType.MINUS
        editDisplay.text = null

    }

    private fun onMulti() {
        calculator.operation = OperationType.MULTI
        editDisplay.text = null

    }

    private fun onDivide() {
        calculator.operation = OperationType.DIVIDE
        editDisplay.text = null
    }

    private fun onZero() {
        if (calculator.operation == null) {
            calculator.first = calculator.first + "0"
            editDisplay.text = calculator.first
        } else {
            calculator.second = calculator.second + "0"
            editDisplay.text = calculator.second
        }
    }

    private fun onOne() {
        if (calculator.operation == null) {
            calculator.first = calculator.first + "1"
            editDisplay.text = calculator.first
        } else {
            calculator.second = calculator.second + "1"
            editDisplay.text = calculator.second
        }
    }

    private fun onTwo() {
        if (calculator.operation == null) {
            calculator.first = calculator.first + "2"
            editDisplay.text = calculator.first
        } else {
            calculator.second = calculator.second + "2"
            editDisplay.text = calculator.second
        }
    }

    private fun onThree() {
        if (calculator.operation == null) {
            calculator.first = calculator.first + "3"
            editDisplay.text = calculator.first
        } else {
            calculator.second = calculator.second + "3"
            editDisplay.text = calculator.second
        }
    }

    private fun onFour() {
        if (calculator.operation == null) {
            calculator.first = calculator.first + "4"
            editDisplay.text = calculator.first
        } else {
            calculator.second = calculator.second + "4"
            editDisplay.text = calculator.second
        }
    }

    private fun onFive() {
        if (calculator.operation == null) {
            calculator.first = calculator.first + "5"
            editDisplay.text = calculator.first
        } else {
            calculator.second = calculator.second + "5"
            editDisplay.text = calculator.second
        }
    }

    private fun onSix() {
        if (calculator.operation == null) {
            calculator.first = calculator.first + "6"
            editDisplay.text = calculator.first
        } else {
            calculator.second = calculator.second + "6"
            editDisplay.text = calculator.second
        }
    }

    private fun onSeven() {
        if (calculator.operation == null) {
            calculator.first = calculator.first + "7"
            editDisplay.text = calculator.first
        } else {
            calculator.second = calculator.second + "7"
            editDisplay.text = calculator.second
        }
    }

    private fun onEight() {
        if (calculator.operation == null) {
            calculator.first = calculator.first + "8"
            editDisplay.text = calculator.first
        } else {
            calculator.second = calculator.second + "8"
            editDisplay.text = calculator.second
        }
    }

    private fun onNine() {
        if (calculator.operation == null) {
            calculator.first = calculator.first + "9"
            editDisplay.text = calculator.first
        } else {
            calculator.second = calculator.second + "9"
            editDisplay.text = calculator.second
        }
    }

}
