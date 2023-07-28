package com.example.unittestingdemoapplication.test

class Testing {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun validPassword(input: String) = when {

        input.isBlank() -> {
            "password is empty"
        }

        input.length < 6 -> {
            "password length less than  6"
        }

        input.length >= 15 -> {
            "password length greater then 15"
        }

        else -> {
            "valid"
        }
    }


    fun reversed(input: String?): String {
        return when {
            input == null -> {
                "input is null"
            }

            input.isEmpty() -> {
                "input is empty"
            }

            input.length == 1 -> {
                "input is only one length"
            }

            else -> {
                input.reversed()
            }
        }

    }

}