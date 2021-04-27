package com.agung.latihan2bloodshare

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.SpinnerAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.agung.latihan2bloodshare.databinding.FragmentRegisterBinding

/**
 * A simple [Fragment] subclass.
 * Use the [RegisterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()

        val binding = DataBindingUtil.inflate<FragmentRegisterBinding>(
            inflater, R.layout.fragment_register, container, false
        )

        binding.bloodType.adapter = buildAdapter(R.array.blood_type)
        binding.unknown.adapter = buildAdapter(R.array.unknown)
        binding.job.adapter = buildAdapter(R.array.job)

        binding.registerBtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_registerFragment_to_submitFragment)
        )

        return binding.root
    }

    private fun buildAdapter(resourceId: Int) : SpinnerAdapter {
        ArrayAdapter
            .createFromResource(requireContext(), resourceId, android.R.layout.simple_spinner_item)
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                return adapter
            }
    }
}