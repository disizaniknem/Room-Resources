package com.disizaniknem.roomresources.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.disizaniknem.roomresources.entities.Director
import com.disizaniknem.roomresources.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)