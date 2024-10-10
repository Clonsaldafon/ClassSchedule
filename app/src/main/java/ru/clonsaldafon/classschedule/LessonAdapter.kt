package ru.clonsaldafon.classschedule

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.clonsaldafon.classschedule.databinding.LessonListItemBinding
import java.time.format.DateTimeFormatter

class LessonAdapter : RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    private var data = mutableListOf<Lesson>()

    class LessonViewHolder(
        private val binding: LessonListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(lesson: Lesson) {
            val dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
            val timeFormatter = DateTimeFormatter.ofPattern("HH:mm")

            with(binding) {
                title.text = lesson.title
                date.text = lesson.date.format(dateFormatter)
                startTime.text = lesson.startTime.format(timeFormatter)
                endTime.text = lesson.endTime.format(timeFormatter)
                classroom.text = lesson.classroom
                teacher.text = lesson.teacher
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val binding = LessonListItemBinding.inflate(inflater, parent, false)

        return LessonViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        val value = data[position]
        holder.bind(value)
    }

    fun submitList(list: List<Lesson>) {
        data = list.toMutableList()
    }

}