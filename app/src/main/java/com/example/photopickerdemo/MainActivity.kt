package com.example.photopickerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import com.example.photopickerdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListener()
    }

    private val pickImage = registerForActivityResult(ActivityResultContracts.PickVisualMedia()){
        if(it!=null)
        {
            binding.img.setImageURI(it)
        }
        else
        {
            Toast.makeText(baseContext,"Unable to select Image",Toast.LENGTH_SHORT).show()
        }
    }
    private fun setListener() {
        binding.btnPick.setOnClickListener {
            pickImage.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
        }
    }
}