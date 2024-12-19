package com.example.numbersquiz.domain.repository

import com.example.numbersquiz.domain.entity.GameSettings
import com.example.numbersquiz.domain.entity.Level
import com.example.numbersquiz.domain.entity.Question

interface GameRepository {
    fun generateQuestion (maxSumValue: Int, countOfOptions: Int): Question
    fun getGameSettings (level: Level): GameSettings
}