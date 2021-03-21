package com.example.lifecycle

import android.content.Context
import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.lifecycle.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
  private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        Timber.i("onCreate is called")
    }
    private fun shareText(countText:String?){
        val sendIntent:Intent= Intent().apply{
            action=Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,countText.toString())
            type="text/plain"
        }
        startActivity(Intent.createChooser(sendIntent,"Share Count"))
    }

    override fun onStart() {
        super.onStart()
        binding.incrementButton.setOnClickListener {
            binding.countText.text= (binding.countText.text.toString().toInt() + 1).toString()
        }
        binding.shareButton.setOnClickListener {
            shareText(binding.countText.text.toString())
        }
        Timber.i("onStart is called")
    }
    override fun onResume() {
        super.onResume()
        Timber.i("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart Called")
    }
}