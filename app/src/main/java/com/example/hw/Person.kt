package com.example.hw

import java.io.Serializable

data class Person(
    var firstName: String = "",
    var lastName: String = "",
    var dob: String = "",
    var login: String = "",
    var password: String = ""
) : Serializable
