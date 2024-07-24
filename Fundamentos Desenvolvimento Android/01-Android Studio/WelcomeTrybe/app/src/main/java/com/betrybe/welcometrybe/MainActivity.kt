package com.betrybe.welcometrybe

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private val nameInput: TextInputEditText by lazy { findViewById(R.id.name_field) }
    private val clickHereButton: Button by lazy { findViewById(R.id.click_button) }
    private val textView: TextView by lazy { findViewById(R.id.text_view) }
    private val activityImage: ImageView by lazy { findViewById(R.id.activity_image) }

    private var isVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleContentDisplay()

        clickHereButton.setOnClickListener {
            isVisible = !isVisible

            if (isVisible) {
                textView.text =  nameInput.text
                clickHereButton.text = "Limpar texto"
                nameInput.isEnabled = false
            } else {
                nameInput.text?.clear()
                clickHereButton.text = "Clique Aqui"
                nameInput.isEnabled = true
            }

            toggleContentDisplay()
        }
    }

    private fun toggleContentDisplay() {
        if (isVisible) {
            textView.visibility = View.VISIBLE
            activityImage.visibility = View.VISIBLE
        } else {
            textView.visibility = View.GONE
            activityImage.visibility = View.GONE
        }
    }
}