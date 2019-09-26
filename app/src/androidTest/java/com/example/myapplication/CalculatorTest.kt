package com.example.myapplication

import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import java.io.IOException
import java.lang.ArithmeticException

class CalculatorTest {

    lateinit var calc: Calculator

    @Before
    fun setUp() {
        calc = Calculator("", "", null)
    }

    @After
    fun tearDown() {
    }

    @Test
    fun calculatePlus(){
        calc.first = "1"
        calc.second = "2"
        calc.operation=OperationType.PLUS
        assertEquals(3, calc.calculate())
    }

    @Test
    fun calculateMinus(){
        calc.first = "5"
        calc.second = "1"
        calc.operation=OperationType.MINUS
        assertEquals(4, calc.calculate())
    }

    @Test
    fun calculateDivide(){
        calc.first="10"
        calc.second="2"
        calc.operation=OperationType.DIVIDE
        assertEquals(5, calc.calculate())
    }

    @Test
    fun calculateMulti(){
        calc.first="20"
        calc.second="5"
        calc.operation=OperationType.MULTI
        assertEquals(100, calc.calculate())
    }

    @Test(expected = ArithmeticException::class)
    fun calculateDivideZero(){
        calc.first="1"
        calc.second="0"
        calc.operation=OperationType.DIVIDE
        assertEquals(1, calc.calculate())
    }

    @Test(expected = IOException::class)
    fun calculateUnknownException(){
        calc.first="1"
        calc.second="0"
        calc.operation=null
        assertEquals(1, calc.calculate())
    }
}