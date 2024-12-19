package com.example.numbersquiz.domain.usecases

import com.example.numbersquiz.domain.entity.Question
import com.example.numbersquiz.domain.repository.GameRepository

class GenerateQuestionUseCase (
    private val repository: GameRepository
) {
    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}