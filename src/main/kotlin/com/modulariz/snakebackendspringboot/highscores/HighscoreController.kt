package com.modulariz.snakebackendspringboot.highscores

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.persistence.Cacheable
import javax.validation.Valid

@RestController
@Cacheable
class HighscoreController {
    @Autowired
    lateinit var highscoreRepository: HighscoreRepository
    @GetMapping
    fun getHighscores(): MutableList<HighscoreEntity> {
        val highscores = highscoreRepository.findAll()

        return highscores
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun postHighscore(@Valid @RequestBody highscore: HighscoreEntityDto): HighscoreEntity {
        val newHighscore = HighscoreEntity()
        newHighscore.username = highscore.username
        newHighscore.points = highscore.points

        return highscoreRepository.save(newHighscore)
    }
}