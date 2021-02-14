package com.disizaniknem.roomresources.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.disizaniknem.roomresources.entities.Student
import com.disizaniknem.roomresources.entities.Subject

data class StudentWithSubjects (
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)