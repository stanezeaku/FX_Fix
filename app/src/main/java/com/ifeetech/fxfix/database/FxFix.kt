package com.ifeetech.fxfix.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fx_fix_table")
data class FxFix(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    @ColumnInfo(name = "leverage")
    val leverage: Int = 0,
    @ColumnInfo(name = "margin")
    val margin: Int = 0,
    @ColumnInfo(name ="lot_size")
    val lotSize: Int = -1,
    @ColumnInfo(name = "trade_size")
    val tradeSize: Int = 0,
    @ColumnInfo(name = "lot_value")
    val lotValue: Int = 0
)