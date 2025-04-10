package com.example.stickynotes.feature_notes.presentation.notes

import com.example.stickynotes.feature_notes.domain.model.Note
import com.example.stickynotes.feature_notes.domain.utils.NoteOrder
import com.example.stickynotes.feature_notes.domain.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
