package ru.clonsaldafon.classschedule

import java.time.LocalDate
import java.time.LocalTime

class Lesson(
    val title: String,
    val date: LocalDate,
    val startTime: LocalTime,
    val endTime: LocalTime,
    val classroom: String,
    val teacher: String
) {
}