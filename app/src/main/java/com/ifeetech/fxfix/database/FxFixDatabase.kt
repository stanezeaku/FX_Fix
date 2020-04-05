package com.ifeetech.fxfix.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [FxFix::class], version = 1, exportSchema = false)
abstract class FxFixDatabase: RoomDatabase(){

    abstract val fxFixDatabaseDao: FxFixDatabaseDao

    companion object{

        @Volatile
        private var INSTANCE: FxFixDatabase? = null

        fun getInstance(context: Context) : FxFixDatabase{
            synchronized(this){
                var instance = INSTANCE

                if (instance == null){

                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        FxFixDatabase::class.java,
                        "fx_fix_databased"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }

                return instance
            }
        }
    }
}