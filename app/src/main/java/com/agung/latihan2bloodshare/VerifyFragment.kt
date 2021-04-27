package com.agung.latihan2bloodshare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.agung.latihan2bloodshare.databinding.FragmentVerifyBinding

/**
 * A simple [Fragment] subclass.
 * Use the [VerifyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VerifyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentVerifyBinding>(
            inflater, R.layout.fragment_verify, container, false
        )

        return binding.root
    }
}