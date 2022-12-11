package com.c22_054.apploker.ui.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import com.c22_054.apploker.R
import com.c22_054.apploker.databinding.FragmentCategoryBinding
import com.c22_054.apploker.ui.list.MobileFragment
import com.c22_054.apploker.ui.list.UXFragment
import com.c22_054.apploker.ui.list.WebDevFragment

class CategoryFragment : Fragment() {

    private lateinit var binding: FragmentCategoryBinding
    private lateinit var mFragmentManager: FragmentManager

    // This property is only valid between onCreateView and
    // onDestroyView.

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val categoryViewModel =
            ViewModelProvider(this)[CategoryViewModel::class.java]
        mFragmentManager = parentFragmentManager
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.imageButtonMobile.setOnClickListener {
            mFragmentManager.beginTransaction().apply {
                replace(R.id.nav_host_fragment_activity_main, MobileFragment(), MobileFragment::class.java.simpleName)
                addToBackStack(null)
                setReorderingAllowed(true)
                commit()
            }
        }
        binding.imageButtonUx.setOnClickListener {
            mFragmentManager.beginTransaction().apply {
                replace(R.id.nav_host_fragment_activity_main, UXFragment(), UXFragment::class.java.simpleName)
                addToBackStack(null)
                setReorderingAllowed(true)
                commit()
            }
        }
        binding.imageButtonWebDev.setOnClickListener {
            mFragmentManager.beginTransaction().apply {
                replace(R.id.nav_host_fragment_activity_main, WebDevFragment(), WebDevFragment::class.java.simpleName)
                addToBackStack(null)
                setReorderingAllowed(true)
                commit()
            }
        }
        super.onViewCreated(view, savedInstanceState)
    }
}