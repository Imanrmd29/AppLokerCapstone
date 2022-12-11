package com.c22_054.apploker.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.c22_054.apploker.R
import com.c22_054.apploker.databinding.FragmentMobileBinding
import com.c22_054.apploker.ui.category.CategoryFragment

class MobileFragment : Fragment() {

    private lateinit var binding: FragmentMobileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMobileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button2.setOnClickListener {
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.nav_host_fragment_activity_main, CategoryFragment(), CategoryFragment::class.java.simpleName)
                addToBackStack(null)
                setReorderingAllowed(true)
                commit()
            }
        }
        super.onViewCreated(view, savedInstanceState)
    }
}