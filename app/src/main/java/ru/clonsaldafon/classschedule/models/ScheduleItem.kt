package ru.clonsaldafon.classschedule.models

data class ScheduleItem(
    val title: String,
    val startTime: String,
    val endTime: String,
    val classroom: String,
    val teacher: String
) : Schedule