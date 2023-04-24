package com.example.photopickerdemo

import junit.framework.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmail(){
        assertTrue(EmailValidator.validate("azad@mag.cpm"))
    }
}