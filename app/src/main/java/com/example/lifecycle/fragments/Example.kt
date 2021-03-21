package com.example.lifecycle.fragments

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import com.example.lifecycle.R
import com.example.lifecycle.databinding.ExampleFragmentBinding
import timber.log.Timber

class Example : Fragment() {
    private lateinit var  binding:ExampleFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.example_fragment,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.i("Fragment- onViewCreated called")
        binding.fragment.setOnClickListener {
            binding.fragment.setBackgroundColor(Color.YELLOW)
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Timber.i("Fragment- onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("Fragment- onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Timber.i("Fragment- onStart called")
    }
    override fun onResume() {
        super.onResume()
        Timber.i( "Fragment- onResume called")
    }
    override fun onPause() {
        super.onPause()
        Timber.i("Fragment- onPause called")
    }
    override fun onStop() {
        super.onStop()
        Timber.i("Fragment- onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Timber.i( "Fragment- onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Timber.i("Fragment- onDetach called")
    }

}