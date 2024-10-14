package ru.clonsaldafon.classschedule.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.clonsaldafon.classschedule.R
import ru.clonsaldafon.classschedule.databinding.DayOfWeekTitleBinding
import ru.clonsaldafon.classschedule.databinding.ScheduleItemBinding
import ru.clonsaldafon.classschedule.models.Schedule
import ru.clonsaldafon.classschedule.models.ScheduleDay
import ru.clonsaldafon.classschedule.models.ScheduleItem

class ScheduleAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var schedule: List<Schedule> = listOf()

    class ScheduleViewHolder(
        private val binding: DayOfWeekTitleBinding,
        private val context: Context
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(scheduleDay: ScheduleDay) {
            binding.dayOfWeek.text = context.getText(scheduleDay.dayOfWeek.resourceId)
        }
    }

    class ScheduleItemViewHolder(
        private val binding: ScheduleItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(scheduleItem: ScheduleItem) {
            if (scheduleItem.title == "") {
                bind()
            }
            else {
                binding.chillImage.visibility = View.GONE
                binding.chillText.visibility = View.GONE

                binding.title.text = scheduleItem.title
                binding.startTime.text = scheduleItem.startTime
                binding.endTime.text = scheduleItem.endTime
                binding.classroom.text = scheduleItem.classroom
                binding.teacher.text = scheduleItem.teacher
            }
        }

        fun bind() {
            binding.chillImage.visibility = View.VISIBLE
            binding.chillText.visibility = View.VISIBLE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val context = parent.context
        val layoutInflater = LayoutInflater.from(context)

        return when(viewType) {
            R.layout.day_of_week_title -> {
                val binding = DayOfWeekTitleBinding.inflate(layoutInflater, parent, false)
                ScheduleViewHolder(binding, context)
            }
            R.layout.schedule_item -> {
                val binding = ScheduleItemBinding.inflate(layoutInflater, parent, false)
                ScheduleItemViewHolder(binding)
            }
            else -> throw IllegalArgumentException("Unsupported type.")
        }
    }

    override fun getItemCount(): Int = schedule.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = schedule[position]
        when(holder) {
            is ScheduleViewHolder -> holder.bind(item as ScheduleDay)
            is ScheduleItemViewHolder -> holder.bind(item as ScheduleItem)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(schedule[position]) {
            is ScheduleDay -> R.layout.day_of_week_title
            is ScheduleItem -> R.layout.schedule_item
            else -> throw IllegalArgumentException("Unsupported type.")
        }
    }

    fun submitSchedule(schedule: List<Schedule>) {
        this.schedule = schedule
        notifyDataSetChanged()
    }
}