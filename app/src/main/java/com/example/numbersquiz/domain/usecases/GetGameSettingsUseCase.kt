package com.example.numbersquiz.domain.usecases

import com.example.numbersquiz.domain.entity.GameSettings
import com.example.numbersquiz.domain.entity.Level
import com.example.numbersquiz.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}