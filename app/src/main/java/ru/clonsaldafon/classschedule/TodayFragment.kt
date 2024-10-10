package ru.clonsaldafon.classschedule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.clonsaldafon.classschedule.databinding.FragmentTodayBinding
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class TodayFragment : Fragment(R.layout.fragment_today) {

    private var _binding: FragmentTodayBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTodayBinding.inflate(layoutInflater, container, false)

        val adapter = LessonAdapter()
        adapter.submitList(getLessonsToday())
        binding.recyclerToday.adapter = adapter

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun getLessonsToday(): List<Lesson> {
        return listOf(
            Lesson(
                "Анализ данных (лек.)",
                LocalDate.parse("07.09.2024", DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                LocalTime.parse("16:40", DateTimeFormatter.ofPattern("HH:mm")),
                LocalTime.parse("18:10", DateTimeFormatter.ofPattern("HH:mm")),
                "A-17",
                "Мирасов В.Ф."
            ),
            Lesson(
                "Базы и хранилища данных (лек.)",
                LocalDate.parse("07.09.2024", DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                LocalTime.parse("18:20", DateTimeFormatter.ofPattern("HH:mm")),
                LocalTime.parse("19:50", DateTimeFormatter.ofPattern("HH:mm")),
                "A-17",
                "Барабанщиков И.В."
            )
        )
    }
}