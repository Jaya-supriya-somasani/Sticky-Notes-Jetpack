package com.example.stickynotes.feature_notes.domain.utils

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}