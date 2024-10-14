package ru.clonsaldafon.classschedule.utils

import ru.clonsaldafon.classschedule.models.DayOfWeek
import ru.clonsaldafon.classschedule.models.Schedule
import ru.clonsaldafon.classschedule.models.ScheduleDay
import ru.clonsaldafon.classschedule.models.ScheduleItem
import java.time.LocalDate
import java.util.Calendar

object ScheduleDataUtils {

    private val firstWeek = listOf(
        ScheduleDay(
            DayOfWeek.MONDAY,
            listOf(
                ScheduleItem(
                    "Базы и хранилища данных (лек.)",
                    "18:20",
                    "19:50",
                    "A-17",
                    "Барабанщиков И.В."
                ),
                ScheduleItem(
                    "Базы и хранилища данных (пр.)",
                    "19:55",
                    "21:25",
                    "132",
                    "Барабанщиков И.В."
                )
            )
        ),
        ScheduleDay(
            DayOfWeek.TUESDAY,
            listOf(
                ScheduleItem(
                    "Управление ИТ-проектами и жизненным циклом ПО (лек.)",
                    "18:20",
                    "19:50",
                    "A-21",
                    "Воробьев В.И.,\nПущев А.А."
                ),
                ScheduleItem(
                    "Управление ИТ-проектами и жизненным циклом ПО (пр.)",
                    "19:55",
                    "21:25",
                    "A-21",
                    "Воробьев В.И.,\nПущев А.А."
                )
            )
        ),
        ScheduleDay(
            DayOfWeek.WEDNESDAY,
            listOf(
                ScheduleItem("", "", "", "", "")
            )
        ),
        ScheduleDay(
            DayOfWeek.THURSDAY,
            listOf(
                ScheduleItem(
                    "Разработка интернет-приложений (лек.)",
                    "19:30",
                    "21:25",
                    "дистант",
                    "Павличенков Е.А."
                ),
                ScheduleItem(
                    "Разработка интернет-приложений (пр.)",
                    "19:30",
                    "21:25",
                    "дистант",
                    "Павличенков Е.А."
                )
            )
        ),
        ScheduleDay(
            DayOfWeek.FRIDAY,
            listOf(
                ScheduleItem(
                    "Экономика программной инженерии (пр.)",
                    "13:15",
                    "14:45",
                    "215 (2 корпус)",
                    "Ткач Е.С."
                ),
                ScheduleItem(
                    "Экономика программной инженерии (лек.)",
                    "15:00",
                    "16:30",
                    "120 (2 корпус)",
                    "Ткач Е.С."
                ),
                ScheduleItem(
                    "Экономика программной инженерии (лек.)",
                    "16:40",
                    "18:10",
                    "120 (2 корпус)",
                    "Ткач Е.С."
                ),
                ScheduleItem(
                    "Тестирование ПО (лек.)",
                    "19:30",
                    "21:00",
                    "дистант",
                    "Булавин Р.С."
                )
            )
        ),
        ScheduleDay(
            DayOfWeek.SATURDAY,
            listOf(
                ScheduleItem(
                    "Тестирование ПО (пр.)",
                    "11:20",
                    "12:50",
                    "132",
                    "Булавин Р.С."
                ),
                ScheduleItem(
                    "Тестирование ПО (пр.)",
                    "13:15",
                    "14:45",
                    "132",
                    "Булавин Р.С."
                ),
                ScheduleItem(
                    "Технологии прикладного программирования (лек.)",
                    "15:00",
                    "16:30",
                    "326",
                    "Веригин Н.В."
                ),
                ScheduleItem(
                    "Технологии прикладного программирования (пр.)",
                    "16:40",
                    "18:10",
                    "326",
                    "Веригин Н.В."
                )
            )
        ),
        ScheduleDay(
            DayOfWeek.SUNDAY,
            listOf(
                ScheduleItem("", "", "", "", "")
            )
        )
    )

    private val secondWeek = listOf(
        ScheduleDay(
            DayOfWeek.MONDAY,
            listOf(
                ScheduleItem(
                    "Анализ данных (лек.)",
                    "16:40",
                    "18:10",
                    "A-17",
                    "Мирасов В.Ф."
                ),
                ScheduleItem(
                    "Базы и хранилища данных (лек.)",
                    "18:20",
                    "19:50",
                    "A-17",
                    "Барабанщиков И.В."
                )
            )
        ),
        ScheduleDay(
            DayOfWeek.TUESDAY,
            listOf(
                ScheduleItem(
                    "Управление ИТ-проектами и жизненным циклом ПО (лек.)",
                    "18:20",
                    "19:50",
                    "A-21",
                    "Воробьев В.И.,\nПущев А.А."
                ),
                ScheduleItem(
                    "Управление ИТ-проектами и жизненным циклом ПО (пр.)",
                    "19:55",
                    "21:25",
                    "A-21",
                    "Воробьев В.И.,\nПущев А.А."
                )
            )
        ),
        ScheduleDay(
            DayOfWeek.WEDNESDAY,
            listOf(
                ScheduleItem(
                    "Базы и хранилища данных (пр.)",
                    "18:20",
                    "19:50",
                    "132",
                    "Барабанщиков И.В."
                ),
                ScheduleItem(
                    "Базы и хранилища данных (пр.)",
                    "19:55",
                    "21:25",
                    "132",
                    "Барабанщиков И.В."
                )
            )
        ),
        ScheduleDay(
            DayOfWeek.THURSDAY,
            listOf(
                ScheduleItem(
                    "Разработка интернет-приложений (лек.)",
                    "19:30",
                    "21:25",
                    "дистант",
                    "Павличенков Е.А."
                ),
                ScheduleItem(
                    "Разработка интернет-приложений (пр.)",
                    "19:30",
                    "21:25",
                    "дистант",
                    "Павличенков Е.А."
                )
            )
        ),
        ScheduleDay(
            DayOfWeek.FRIDAY,
            listOf(
                ScheduleItem(
                    "Анализ данных (пр.)",
                    "15:00",
                    "16:30",
                    "132",
                    "Мирасов В.Ф."
                ),
                ScheduleItem(
                    "Анализ данных (пр.)",
                    "16:40",
                    "18:10",
                    "132",
                    "Мирасов В.Ф."
                ),
                ScheduleItem(
                    "Тестирование ПО (лек.)",
                    "19:30",
                    "21:00",
                    "дистант",
                    "Булавин Р.С."
                )
            )
        ),
        ScheduleDay(
            DayOfWeek.SATURDAY,
            listOf(
                ScheduleItem(
                    "Тестирование ПО (пр.)",
                    "11:20",
                    "12:50",
                    "132",
                    "Булавин Р.С."
                ),
                ScheduleItem(
                    "Тестирование ПО (пр.)",
                    "13:15",
                    "14:45",
                    "132",
                    "Булавин Р.С."
                ),
                ScheduleItem(
                    "Технологии прикладного программирования (лек.)",
                    "15:00",
                    "16:30",
                    "326",
                    "Веригин Н.В."
                ),
                ScheduleItem(
                    "Технологии прикладного программирования (пр.)",
                    "16:40",
                    "18:10",
                    "326",
                    "Веригин Н.В."
                )
            )
        ),
        ScheduleDay(
            DayOfWeek.SUNDAY,
            listOf(
                ScheduleItem("", "", "", "", "")
            )
        )
    )

    private fun getCurrentWeek(): List<Schedule> =
        if ((Calendar.getInstance().get(Calendar.WEEK_OF_YEAR) + 1) % 2 == 1)
            firstWeek
        else
            secondWeek

    fun getTodaySchedule(): List<Schedule> {
        val week = getCurrentWeek()
        val day = LocalDate.now().dayOfWeek

        val scheduleDay = (week.first { (it as ScheduleDay).dayOfWeek.ordinal == day.ordinal } as ScheduleDay)

        if (scheduleDay.scheduleItems.isEmpty())
            return listOf()

        return mutableListOf<Schedule>().apply {
            scheduleDay.scheduleItems.map {
                this.add(it)
            }
        }
    }

    fun getSchedule(): List<Schedule> {
        val week = getCurrentWeek()

        val schedule = mutableListOf<Schedule>()
        week.forEach {
            schedule.add(it)
            val scheduleDay = it as ScheduleDay
            scheduleDay.scheduleItems.map { item ->
                schedule.add(item as Schedule)
            }
        }

        return schedule
    }
}