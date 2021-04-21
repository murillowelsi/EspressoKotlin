package com.example.myapplication.pageObjects.Login.robot


import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myapplication.R
import com.example.myapplication.pageObjects.Login.constants.ConstantsLogin.APP_TITLE
import com.example.myapplication.pageObjects.Login.constants.ConstantsLogin.SUCCESS_EMAIL
import com.example.myapplication.pageObjects.Login.constants.ConstantsLogin.SUCCESS_PASS
import com.example.myapplication.pageObjects.Login.constants.ConstantsLogin.TEXT_LOGGED

class RobotLogin {
    fun titleValidation() {
        onView(withText(APP_TITLE)).check(matches(ViewMatchers.isDisplayed()))
    }

    fun putEmail() {
        onView(withId(EMAIL)).perform(typeText(SUCCESS_EMAIL))
    }

    fun putPass() {
        onView(withId(PASS)).perform(typeText(SUCCESS_PASS))
    }

    fun closeKeyboard() {
        closeSoftKeyboard()
    }

    fun clickLoginButton() {
        onView(withId(BTN_LOGIN)).perform(ViewActions.click())
    }

    fun checkLoggedText() {
        onView(withText(TEXT_LOGGED)).check(matches(ViewMatchers.isDisplayed()))
    }

    fun clickBackButton() {
        onView(withId(BTN_BACK)).perform(ViewActions.click())
    }

    companion object {
        private const val EMAIL = R.id.editTextTextEmailAddress
        private const val PASS = R.id.editTextTextPassword
        private const val BTN_LOGIN = R.id.button_first
        private const val BTN_BACK = R.id.button_second
    }
}