package com.example.stickynotes.feature_notes.domain.usecase

import com.example.stickynotes.feature_notes.domain.model.Note
import com.example.stickynotes.feature_notes.domain.repository.NoteRepository

class DeleteNoteUseCase(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) {
        noteRepository.deleteNote(note )
    }
}