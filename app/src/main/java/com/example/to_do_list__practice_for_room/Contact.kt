package com.example.to_do_list__practice_for_room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact (

    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)