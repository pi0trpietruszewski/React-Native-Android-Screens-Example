package com.reactnativeawesomemodulern

import android.content.Intent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class AwesomeModuleRnModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "AwesomeModuleRn"
    }

  @ReactMethod
  fun showView(promise: Promise) {
    val intent = Intent(reactApplicationContext, ModuleNameActivity::class.java)
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    reactApplicationContext.startActivity(intent)
    promise.resolve(true)
  }

  @ReactMethod
  fun showViewNavigateTo(text: String? = "", promise: Promise) {
    val intent = Intent(reactApplicationContext, ModuleNameActivity::class.java)
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    intent.putExtra("screenId", text)
    reactApplicationContext.startActivity(intent)
    promise.resolve(true)
  }



}
