package com.kirani.submee.fragments.shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.kirani.submee.R
import com.kirani.submee.adapters.HomeViewpagerAdapter
import com.kirani.submee.databinding.FragmentHomeBinding
import com.kirani.submee.fragments.categories.BrandFragment
import com.kirani.submee.fragments.categories.EditingFragment
import com.kirani.submee.fragments.categories.EntertainmentFragment
import com.kirani.submee.fragments.categories.MainCategoryFragment
import com.kirani.submee.fragments.categories.ProductiveFragment
import com.kirani.submee.fragments.categories.TicketFragment

class HomeFragment: Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoriesFragments = arrayListOf<Fragment>(
            MainCategoryFragment(),
            ProductiveFragment(),
            EditingFragment(),
            EntertainmentFragment(),
            BrandFragment(),
            TicketFragment()
        )

        binding.viewpagerHome.isUserInputEnabled = false

        val viewPager2Adapter = HomeViewpagerAdapter(categoriesFragments,childFragmentManager,lifecycle)
        binding.viewpagerHome.adapter = viewPager2Adapter
        TabLayoutMediator(binding.tabLayout,binding.viewpagerHome){ tab, position ->
            when(position) {
                0 -> tab.text = "Main"
                1 -> tab.text = "Productive"
                2 -> tab.text = "Editing"
                3 -> tab.text = "Entertainment"
                4 -> tab.text = "Brand"
                5 -> tab.text = "Ticket"
            }
        }.attach()

    }
}