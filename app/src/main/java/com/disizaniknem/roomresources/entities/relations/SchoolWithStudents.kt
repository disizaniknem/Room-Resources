package com.disizaniknem.roomresources.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.disizaniknem.roomresources.entities.School
import com.disizaniknem.roomresources.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)