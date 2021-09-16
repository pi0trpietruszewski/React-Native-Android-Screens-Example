package com.reactnativeawesomemodulern

import android.os.Bundle
import android.view.View


import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MainAppFragment : Fragment(R.layout.fragment_main_app) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val firstButton: Button = view.findViewById<Button>(R.id.next_screen_button)

    val secondButton: Button = view.findViewById<Button>(R.id.another_screen_button)

    firstButton.setOnClickListener {
      this.onButtonPress()
    }
    secondButton.setOnClickListener {
      this.onSecondButtonPress()
    }
  }

  private fun onButtonPress() {
    findNavController().navigate(R.id.firstFragment)
  }

  private fun onSecondButtonPress() {
    findNavController().navigate(R.id.secondFragment)
  }

}
