package com.laychv.arch_lifecycle

import android.content.Intent
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.laychv.about_lifeceycle.test", appContext.packageName)
    }

    @Test
    fun start() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        appContext.startActivity(Intent(appContext, LifecycleActivity::class.java))
    }
}