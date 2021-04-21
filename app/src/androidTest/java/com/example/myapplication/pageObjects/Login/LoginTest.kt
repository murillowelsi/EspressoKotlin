package com.example.myapplication.pageObjects.Login

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.myapplication.MainActivity
import com.example.myapplication.pageObjects.Login.robot.RobotLogin
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginTest {

    private val robot = RobotLogin()

    @get:Rule
    var mActivityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun loginTestPageObject() {
        robot.titleValidation()
        robot.putEmail()
        robot.closeKeyboard()
        robot.putPass()
        robot.closeKeyboard()
        robot.clickLoginButton()
        robot.checkLoggedText()
        robot.clickBackButton()
        robot.titleValidation()
    }

}