package hu.proha.tagger2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import hu.proha.tagger2.databinding.ActivityMainBinding
import hu.proha.tagger2.fragments.TaggerFragment


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var taggerFragment = TaggerFragment()

        supportFragmentManager.beginTransaction()
            .add(binding.frameLayout.id, taggerFragment)
            .commit()

    }
}
