package com.reactnativeawesomemodulern

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(R.layout.fragment_second) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val closeButton: Button = view.findViewById<Button>(R.id.close_button)

    closeButton.setOnClickListener {
      this.onCloseButtonPress()
    }
  }

  private fun onCloseButtonPress() {
    activity?.finish();
  }

}
