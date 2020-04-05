package com.ifeetech.fxfix.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface FxFixDatabaseDao {

    @Insert
    fun insert(fxFix: FxFix)

    @Update
    fun update(fxFix: FxFix)

    @Query("SELECT * FROM fx_fix_table WHERE id = :key")
    fun get(key: Long): FxFix

    @Query("DELETE FROM fx_fix_table")
    fun clear()

    @Query("SELECT * FROM fx_fix_table ORDER BY id DESC")
    fun getAllFxFix(): LiveData<List<FxFix>>

    @Query("SELECT * FROM fx_fix_table ORDER BY id DESC LIMIT 1")
    fun getRecentFxFix(): FxFix?

}