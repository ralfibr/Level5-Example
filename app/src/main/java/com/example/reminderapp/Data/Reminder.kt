package com.example.reminderapp.Data

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

/**
 * reminder data class
 */
@Parcelize
@Entity(tableName = "reminderTable")

data class Reminder(
    @ColumnInfo(name = "reminder")
    var reminderText: String,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
) : Parcelable
