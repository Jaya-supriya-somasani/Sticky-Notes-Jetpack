package com.example.stickynotes.feature_notes.presentation.notes

import com.example.stickynotes.feature_notes.domain.model.Note
import com.example.stickynotes.feature_notes.domain.utils.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()

    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}