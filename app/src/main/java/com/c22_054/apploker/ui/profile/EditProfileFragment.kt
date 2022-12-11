package com.c22_054.apploker.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.c22_054.apploker.R
import com.c22_054.apploker.databinding.FragmentEditProfileBinding

class EditProfileFragment : Fragment() {

    private lateinit var binding: FragmentEditProfileBinding

    // This property is only valid between onCreateView and
    // onDestroyView.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEditProfileBinding.inflate(inflater, container, false)
        val spinner = binding.spinner
        val adapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(requireContext(), R.array.jenis_kelamin, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        binding.button.setOnClickListener {
            val mProfileFragment = ProfileFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.nav_host_fragment_activity_main, mProfileFragment, ProfileFragment::class.java.simpleName)
                addToBackStack(null)
                setReorderingAllowed(true)
                commit()
            }
        }
        return binding.root
    }
}