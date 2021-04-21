package com.example.myapplication.formatoBasico

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TesteFormatoBasico {

    //serve para dizer qual vai ser a primeira tela a ser iniciada no projeto de testes
    @get:Rule
    var mActivityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun loginWithSuccess() {
        Espresso.onView(ViewMatchers.withText("Test App Murillo")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.editTextTextEmailAddress)).perform(ViewActions.typeText("murillo.welsi@gmail.com"))
        Espresso.onView(ViewMatchers.withId(R.id.editTextTextPassword)).perform(ViewActions.typeText("123456"))
        Espresso.closeSoftKeyboard()
        Espresso.onView(ViewMatchers.withId(R.id.button_first)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withText("Logged in")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.button_second)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withText("Test App Murillo")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}