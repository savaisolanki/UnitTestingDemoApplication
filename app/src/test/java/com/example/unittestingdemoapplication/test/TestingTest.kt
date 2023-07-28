package com.example.unittestingdemoapplication.test

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class TestingTest {
    private lateinit var testing: Testing

    @Before
    fun before() {
        testing = Testing()
        println("Before test cases ")
    }

    @After
    fun after() {
        println("After test cases ")
    }

    @Test
    fun addition_true() {
        val result = testing.add(10, 20)
        assertEquals(30, result)
    }

    @Test
    fun addition_false() {
        val result = testing.add(20, 20)
        assertEquals(40, result)
    }

    @Before
    fun setUp() {
        println("Before password Validation")
    }

    @After
    fun tearDown() {
        println("After password Validation")

    }

    @Test
    fun validPassword_blank() {
        testing = Testing()
        val result = testing.validPassword("")
        assertEquals("password is empty", result)
    }

    @Test
    fun validPassword_less_then_6() {
        testing = Testing()
        val result = testing.validPassword("savai")
        assertEquals("password length less than  6", result)
    }


    @Test
    fun validPassword_greater_then_15() {
        testing = Testing()
        val result = testing.validPassword("savaisavaisavaisavai")
        assertEquals("password length greater then 15", result)
    }




    @Test
    fun validPassword() {
        testing = Testing()
        val result = testing.validPassword("savaisolanki")
        assertEquals("valid", result)
    }

    @Test
    fun reversed_null() {
        testing= Testing()
        val result=testing.reversed(null)
        assertEquals("input is null", result)
    }

    @Test
    fun reversed_empty() {
        testing= Testing()
        val result=testing.reversed("")
        assertEquals("input is empty", result)
    }

    @Test
    fun reversed_one() {
        testing= Testing()
        val result=testing.reversed("a")
        assertEquals("input is only one length", result)
    }

    @Test
    fun reversed_valid() {
        testing= Testing()
        val result=testing.reversed("sks")
        assertEquals("sks", result)
    }
}