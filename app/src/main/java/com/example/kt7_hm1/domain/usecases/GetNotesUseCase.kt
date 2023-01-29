package com.example.kt7_hm1.domain.usecases

import com.example.kt7_hm1.domain.repository.NoteRepository

class GetNotesUseCase(private val noteRepository: NoteRepository) {

    fun getNotes() = noteRepository.getNote()
}