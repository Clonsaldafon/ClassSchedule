package ru.clonsaldafon.classschedule.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView
import ru.clonsaldafon.classschedule.R
import ru.clonsaldafon.classschedule.databinding.FragmentScheduleBinding
import ru.clonsaldafon.classschedule.presentation.adapters.ScheduleAdapter
import ru.clonsaldafon.classschedule.utils.ScheduleDataUtils

class ScheduleFragment : Fragment(), NavigationBarView.OnItemSelectedListener {

    private var _binding: FragmentScheduleBinding? = null
    private val binding: FragmentScheduleBinding
        get() = requireNotNull(_binding)

    private var scheduleAdapter = ScheduleAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentScheduleBinding.inflate(
            inflater,
            container,
            false
        )

        binding.bottomNav.setOnItemSelectedListener(this)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.title.setText(R.string.today)

        binding.scheduleRecyclerView.adapter = scheduleAdapter
        scheduleAdapter.submitSchedule(ScheduleDataUtils.getTodaySchedule())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean =
        when(item.itemId) {
            R.id.nav_today -> {
                scheduleAdapter.submitSchedule(ScheduleDataUtils.getTodaySchedule())
                binding.title.text = item.title
                true
            }
            R.id.nav_week -> {
                scheduleAdapter.submitSchedule(ScheduleDataUtils.getSchedule())
                binding.title.text = item.title
                true
            }
            else -> false
        }
}