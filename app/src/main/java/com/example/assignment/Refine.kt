package com.example.assignment

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.assignment.databinding.ActivityRefineBinding

class Refine : AppCompatActivity() {
    lateinit var binding:ActivityRefineBinding
    private var button1 = true
    private var button9 = true
    private var button7 = true
    private var button8 = false
    private var button6 = false
    private var button5 = false
    private var button3 = false
    private var button4 = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRefineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val spinner: Spinner = findViewById(R.id.spinner)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.spinner_items,
            R.layout.spinner_item_layout,

        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = adapter

        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                // Handle the selected item
                val selectedItem = parentView.getItemAtPosition(position).toString()

                // Do something with the selected item
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // Do nothing here
            }
        }


        binding.toolbar2.setNavigationOnClickListener {
            var intent  = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }



        binding.button1.setOnClickListener {
            if (button1 == true){
                binding.button1.setTextColor(getColor(R.color.blue))
                binding.button1.setBackgroundColor(getColor(R.color.white))
                button1 = false
            }else{
                binding.button1.setTextColor(getColor(R.color.white))
                binding.button1.setBackgroundColor(getColor(R.color.blue))
                button1 = true
            }
        }

        binding.button9.setOnClickListener {
            if (button9 == true){
                binding.button9.setTextColor(getColor(R.color.blue))
                binding.button9.setBackgroundColor(getColor(R.color.white))
                button9 = false
            }else{
                binding.button9.setTextColor(getColor(R.color.white))
                binding.button9.setBackgroundColor(getColor(R.color.blue))
                button9 = true
            }
        }


        binding.button7.setOnClickListener {
            if (button7 == true){
                binding.button7.setTextColor(getColor(R.color.blue))
                binding.button7.setBackgroundColor(getColor(R.color.white))
                button7 = false
            }else{
                binding.button7.setTextColor(getColor(R.color.white))
                binding.button7.setBackgroundColor(getColor(R.color.blue))
                button7 = true
            }
        }

        binding.button8.setOnClickListener {
            if (button8 == true){
                binding.button8.setTextColor(getColor(R.color.blue))
                binding.button8.setBackgroundColor(getColor(R.color.white))
                button8 = false
            }else{
                binding.button8.setTextColor(getColor(R.color.white))
                binding.button8.setBackgroundColor(getColor(R.color.blue))
                button8 = true
            }
        }

        binding.button6.setOnClickListener {
            if (button6 == true){
                binding.button6.setTextColor(getColor(R.color.blue))
                binding.button6.setBackgroundColor(getColor(R.color.white))
                button6 = false
            }else{
                binding.button6.setTextColor(getColor(R.color.white))
                binding.button6.setBackgroundColor(getColor(R.color.blue))
                button6 = true
            }
        }

        binding.button5.setOnClickListener {
            if (button5 == true){
                binding.button5.setTextColor(getColor(R.color.blue))
                binding.button5.setBackgroundColor(getColor(R.color.white))
                button5 = false
            }else{
                binding.button5.setTextColor(getColor(R.color.white))
                binding.button5.setBackgroundColor(getColor(R.color.blue))
                button5 = true
            }
        }



        binding.button3.setOnClickListener {
            if (button3 == true){
                binding.button3.setTextColor(getColor(R.color.blue))
                binding.button3.setBackgroundColor(getColor(R.color.white))
                button3 = false
            }else{
                binding.button3.setTextColor(getColor(R.color.white))
                binding.button3.setBackgroundColor(getColor(R.color.blue))
                button3 = true
            }
        }


        binding.button4.setOnClickListener {
            if (button4 == true){
                binding.button4.setTextColor(getColor(R.color.blue))
                binding.button4.setBackgroundColor(getColor(R.color.white))
                button4 = false
            }else{
                binding.button4.setTextColor(getColor(R.color.white))
                binding.button4.setBackgroundColor(getColor(R.color.blue))
                button4 = true
            }
        }

        binding.button2.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()

        }

    }
    }
