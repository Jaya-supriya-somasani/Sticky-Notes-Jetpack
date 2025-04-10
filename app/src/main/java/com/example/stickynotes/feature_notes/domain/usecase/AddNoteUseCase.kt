package com.example.stickynotes.feature_notes.domain.usecase

import com.example.stickynotes.feature_notes.domain.model.InValidNoteException
import com.example.stickynotes.feature_notes.domain.model.Note
import com.example.stickynotes.feature_notes.domain.repository.NoteRepository

data class AddNoteUseCase(private val noteRepository: NoteRepository) {
    @Throws(InValidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InValidNoteException("Title of the note can't be empty")
        }
        if (note.content.isBlank()){
            throw InValidNoteException("Content of the note can't be empty")
        }
        noteRepository.insertNote(note)
    }
}