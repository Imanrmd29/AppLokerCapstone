package com.c22_054.apploker.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.c22_054.apploker.R
import com.c22_054.apploker.databinding.FragmentUxBinding
import com.c22_054.apploker.ui.category.CategoryFragment

class UXFragment : Fragment() {
    private lateinit var binding: FragmentUxBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUxBinding.inflate(layoutInflater)
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