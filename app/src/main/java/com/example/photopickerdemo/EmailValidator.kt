package com.example.photopickerdemo

import java.util.regex.Pattern

object EmailValidator {
    private val EMAIL_ADDRESS = Pattern.compile(
        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{2,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{2,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"
    )
    fun validate(email: String): Boolean
    {
        return EMAIL_ADDRESS.matcher(email).matches()
    }
}