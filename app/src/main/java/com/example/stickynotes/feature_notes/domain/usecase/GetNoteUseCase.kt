package com.example.stickynotes.feature_notes.domain.usecase

import com.example.stickynotes.feature_notes.domain.model.Note
import com.example.stickynotes.feature_notes.domain.repository.NoteRepository

class GetNoteUseCase(private val repository: NoteRepository) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}