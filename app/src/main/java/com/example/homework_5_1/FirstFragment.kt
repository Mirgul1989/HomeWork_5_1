package com.example.homework_5_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction
import com.example.homework_5_1.databinding.ActivityMainBinding
import com.example.homework_5_1.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private var count = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnZero.setOnClickListener {
            count++
            binding.tvO.text = count.toString()
            if (count >= 10)
                binding.btnZero.setOnClickListener {
                    binding.btnZero.text="-1"
                    count--
                    binding.tvO.text = count.toString()
                    if (count <= 0) {
                        requireActivity().supportFragmentManager.beginTransaction()
                            .replace(R.id.container, SecondFragment()).addToBackStack(null).commit()
                    }
                }

        }
    }
}
