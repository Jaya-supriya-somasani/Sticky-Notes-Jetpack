package com.example.stickynotes.feature_notes.domain.repository

import com.example.stickynotes.feature_notes.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    fun getNotes(): Flow<List<Note>>

    suspend fun deleteNote(note: Note)
    suspend fun insertNote(note: Note)
    suspend fun getNoteById(id: Int): Note?
}