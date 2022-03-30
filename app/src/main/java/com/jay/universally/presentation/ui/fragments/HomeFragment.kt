package com.jay.universally.presentation.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.jay.universally.R
import com.jay.universally.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home){
    private lateinit var binding:FragmentHomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

//        var selected: TextView

        binding.apply {

            a.setOnClickListener {
                reset(a,aa)
            }
            aa.setOnClickListener {
                reset(aa,a)
            }
            b.setOnClickListener {
                reset(b,bb)
            }
            bb.setOnClickListener {
                reset(bb,b)
            }

            c.setOnClickListener {
                reset(c,cc)
            }
            cc.setOnClickListener {
                reset(cc,c)
            }

            d.setOnClickListener {
                reset(d,dd)
            }
            dd.setOnClickListener {
                reset(dd,d)
            }

            e.setOnClickListener {
                reset(e,ee)
            }
            ee.setOnClickListener {
                reset(ee,e)
            }

            f.setOnClickListener {
                reset(f,ff)
            }
            ff.setOnClickListener {
                reset(ff,f)
            }
        }

    }

    private fun reset(first:TextView,second:TextView){

        binding.apply {
            a.visibility = View.VISIBLE
            aa.visibility = View.GONE
            b.visibility = View.VISIBLE
            bb.visibility = View.GONE
            c.visibility = View.VISIBLE
            cc.visibility = View.GONE
            d.visibility = View.VISIBLE
            dd.visibility = View.GONE
            e.visibility = View.VISIBLE
            ee.visibility = View.GONE
            f.visibility = View.VISIBLE
            ff.visibility = View.GONE
        }
        first.visibility = View.GONE
        second.visibility = View.VISIBLE
    }
}