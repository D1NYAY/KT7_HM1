package com.example.kt7_hm1.domain.usecases

import com.example.kt7_hm1.domain.model.Note
import com.example.kt7_hm1.domain.repository.NoteRepository

class CreateNotesUseCase(private val noteRepository: NoteRepository) {
    
    fun createNotes(note: Note) = noteRepository.createNote(note)
}