package com.modulariz.snakebackendspringboot.highscores

import org.hibernate.annotations.Type
import org.hibernate.validator.constraints.Length
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull

@Entity
@Table(name = "highscore")
open class HighscoreEntity {
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "username", nullable = false, unique = true)
    @NotBlank(message = "username must not be null")
    @Length(min=3, max=16, message = "username must be between 3 and 16 chars long")
    open var username: String? = null

    @Min(value = 0, message = "points can't be negative")
    @Column(name = "points", nullable = false)
    @NotNull(message = "points must not be null")
    open var points: Int? = null

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
}