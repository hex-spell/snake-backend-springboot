package com.modulariz.snakebackendspringboot.highscores

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/highscores")
class HighscoreController {
    @Autowired
    lateinit var highscoreRepository: HighscoreRepository
    @GetMapping
    fun getHighscores(): MutableList<HighscoreEntity> {
        val highscores = highscoreRepository.findAll()

        return highscores
    }
    @PostMapping
    fun postHighscore(@RequestBody highscore: HighscoreEntityDto): String {
        val newHighscore = HighscoreEntity()
        newHighscore.username = highscore.username
        newHighscore.points = highscore.points
        highscoreRepository.save(newHighscore)
        return "true";
    }
}