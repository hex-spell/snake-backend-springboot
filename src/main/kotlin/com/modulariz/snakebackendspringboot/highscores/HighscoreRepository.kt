package com.modulariz.snakebackendspringboot.highscores;

import org.springframework.data.jpa.repository.JpaRepository


interface HighscoreRepository : JpaRepository<HighscoreEntity, Int> {

}