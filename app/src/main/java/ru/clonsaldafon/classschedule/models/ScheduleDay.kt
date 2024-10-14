package ru.clonsaldafon.classschedule.models

data class ScheduleDay(
    val dayOfWeek: DayOfWeek,
    val scheduleItems: List<ScheduleItem>
) : Schedule
