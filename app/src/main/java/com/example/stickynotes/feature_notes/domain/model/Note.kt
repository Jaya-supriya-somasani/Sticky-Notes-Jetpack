package com.example.stickynotes.feature_notes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.stickynotes.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null,
) {
    companion object {
        val noteColor = listOf(RedOrange, RedPink, BabyBlue, Violet, LightGreen)
    }
}

class InValidNoteException(message: String) : Exception(message) {

}