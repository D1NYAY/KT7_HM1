package com.example.kt7_hm1.domain.usecases

import com.example.kt7_hm1.domain.model.Note
import com.example.kt7_hm1.domain.repository.NoteRepository

class EditNotesUseCase(private val noteRepository: NoteRepository) {
    
    fun editNotes(note: Note) = noteRepository.editNote(note)
}