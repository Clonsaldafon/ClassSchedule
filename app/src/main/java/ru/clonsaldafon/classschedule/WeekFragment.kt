package ru.clonsaldafon.classschedule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import ru.clonsaldafon.classschedule.databinding.FragmentTodayBinding
import ru.clonsaldafon.classschedule.databinding.FragmentWeekBinding

class WeekFragment : Fragment(R.layout.fragment_week) {

    private val binding: FragmentWeekBinding by lazy {
        FragmentWeekBinding.inflate(layoutInflater)
    }

    private lateinit var recycler: RecyclerView
    private lateinit var adapter: LessonAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}