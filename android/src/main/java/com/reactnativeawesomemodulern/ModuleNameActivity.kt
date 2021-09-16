package com.reactnativeawesomemodulern //<--Change to your package name

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupActionBarWithNavController


class ModuleNameActivity : AppCompatActivity() { // If you are using custom name change it here

  lateinit var nav: NavController

  override fun onSupportNavigateUp(): Boolean = nav.navigateUp()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.view_layout)
    setSupportActionBar(findViewById(R.id.toolbar))

    nav = Navigation.findNavController(this, R.id.fragment_nav)

    setupActionBarWithNavController(nav)

    val screenId = intent.getStringExtra("screenId")

    when (screenId) {
      "first" -> nav.navigate(R.id.firstFragment)
      "second" -> nav.navigate(R.id.secondFragment)
    }
  }

}
