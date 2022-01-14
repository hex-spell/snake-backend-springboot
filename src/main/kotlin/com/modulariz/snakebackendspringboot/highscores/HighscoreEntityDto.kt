package com.modulariz.snakebackendspringboot.highscores

import java.io.Serializable

data class HighscoreEntityDto(val id: Int? = null, val username: String? = null, val points: Int? = null) : Serializable
