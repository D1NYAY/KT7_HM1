package com.example.kt7_hm1.domain.usecases

import com.example.kt7_hm1.domain.model.Note
import com.example.kt7_hm1.domain.repository.NoteRepository

class DeleteNotesUseCase(private val noteRepository: NoteRepository) {
    
    fun deleteNotes(note: Note) = noteRepository.deleteNote(note)
}