package com.example.viewpager.pagers

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager.databinding.FragmentViewPagerBinding
import com.example.viewpager.pagers.adpters.AdapterPagerFrags
import com.example.viewpager.pagers.fragspagers.PrimaSchermataFrag
import com.example.viewpager.pagers.fragspagers.SecondaSchermataFrag


class ViewPagerFrag : Fragment() {
    lateinit var binding: FragmentViewPagerBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = FragmentViewPagerBinding.inflate(layoutInflater)

        val fragmentsList = arrayListOf(

            PrimaSchermataFrag(), SecondaSchermataFrag()
        )

        val adapterPagerFrags =
            AdapterPagerFrags(fragmentsList, requireActivity().supportFragmentManager, lifecycle)

        binding.viewPager.adapter = adapterPagerFrags



        return binding.root
    }




    override fun onDestroy() {
        super.onDestroy()

    }

}
