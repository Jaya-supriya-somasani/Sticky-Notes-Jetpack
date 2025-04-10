package com.example.stickynotes.feature_notes.data.repositories

import com.example.stickynotes.feature_notes.data.data_source.NoteDao
import com.example.stickynotes.feature_notes.domain.model.Note
import com.example.stickynotes.feature_notes.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private val noteDao: NoteDao) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotes()
    }

    override suspend fun deleteNote(note: Note) {
        return noteDao.deleteNote(note = note)
    }

    override suspend fun insertNote(note: Note) {
        return noteDao.insertNote(note = note)
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id = id)
    }
}