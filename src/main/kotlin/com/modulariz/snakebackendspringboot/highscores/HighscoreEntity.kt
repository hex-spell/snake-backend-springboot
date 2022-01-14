package com.modulariz.snakebackendspringboot.highscores

import org.hibernate.annotations.Type
import javax.persistence.*

@Entity
@Table(name = "highscore")
open class HighscoreEntity {
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "username", nullable = false)
    open var username: String? = null

    @Column(name = "points", nullable = false)
    open var points: Int? = null

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
}