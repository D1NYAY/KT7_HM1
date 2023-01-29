package com.example.kt7_hm1.domain.repository

import com.example.kt7_hm1.domain.model.Note

interface NoteRepository {

    fun createNote(note: Note)

    fun editNote(note: Note)

    fun deleteNote(note: Note)

    fun getNote() : List<Note>
}