package com.agung.latihan2bloodshare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.agung.latihan2bloodshare.databinding.FragmentSubmitBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SubmitFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SubmitFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()

        val binding = DataBindingUtil.inflate<FragmentSubmitBinding>(
            inflater, R.layout.fragment_submit, container, false
        )

        return binding.root
    }
}