package com.ifeetech.fxfix

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.ifeetech.fxfix.database.FxFix
import com.ifeetech.fxfix.database.FxFixDatabase
import com.ifeetech.fxfix.database.FxFixDatabaseDao
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FxFixDatabaseTest{

    private lateinit var fxFixDao: FxFixDatabaseDao
    private lateinit var db: FxFixDatabase

    @Before
    fun createDb(){
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        // Using an in memory database because the information stored here disappears when the
        // process is killed.
        db = Room.inMemoryDatabaseBuilder(context, FxFixDatabase::class.java)
        // Allowing main thread queries, just for testing.
            .allowMainThreadQueries()
            .build()
        fxFixDao = db.fxFixDatabaseDao
    }

    @After
    @Throws(Exception::class)
    fun closeDb(){
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun insertAndGetFxFix(){
        val fxFix = FxFix()
        fxFixDao.insert(fxFix)
        val recentFxFix = fxFixDao.getRecentFxFix()
        assertEquals(recentFxFix?.lotSize, -1)
    }
}