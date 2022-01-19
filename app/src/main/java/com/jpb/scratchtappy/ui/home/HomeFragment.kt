package com.jpb.scratchtappy.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.jpb.scratchtappy.R

class HomeFragment : Fragment() {

  private lateinit var homeViewModel: HomeViewModel
  var tap = 0
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
    val root = inflater.inflate(R.layout.fragment_home, container, false)
    homeViewModel.text.observe(viewLifecycleOwner, Observer {
    })
    val but = root.findViewById<View>(R.id.button) as Button
    val text = root.findViewById<View>(R.id.text3) as TextView
    but.setOnClickListener {
      tap++
      text.setText(tap.toString())
    }
    return root
  }
  }