package com.example.unittestingdemoapplication.test

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class)
class Parameterized(val input1: Int,val input2: Int,val resultData: Int) {

    @Test
    fun parameterizedName() {
        val testing = Testing()
        val result = testing.add(input1, input2)
        assertEquals(resultData, result)
    }

    companion object {

        @JvmStatic
        @Parameters(name = "{index}: {0} + {1} = {2}")
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf(10, 10, 20),
                arrayOf(20, 10, 30),
                arrayOf(20, 20, 40)
            )
        }
    }
}