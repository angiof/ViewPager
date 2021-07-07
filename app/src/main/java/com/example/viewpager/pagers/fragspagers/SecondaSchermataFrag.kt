package com.example.viewpager.pagers.fragspagers

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager.activities.HomeActivity
import com.example.viewpager.databinding.FragmentSecondaSchermataBinding

class SecondaSchermataFrag : Fragment() {

    lateinit var bin: FragmentSecondaSchermataBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        bin = FragmentSecondaSchermataBinding.inflate(layoutInflater)



        bin.btnEnd.setOnClickListener {
            finireLanavigazioenViewPage()
            startActivity(Intent(requireContext(),HomeActivity::class.java))
        }

        return bin.root
    }

    private fun finireLanavigazioenViewPage() {

        val sharedPreferences =
            requireActivity().getSharedPreferences("", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean("finito", true)
        editor.apply()
    }


}
