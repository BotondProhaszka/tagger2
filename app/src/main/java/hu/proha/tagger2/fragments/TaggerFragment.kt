package hu.proha.tagger2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import hu.proha.tagger2.R
import hu.proha.tagger2.databinding.FragmentTaggerBinding


class TaggerFragment : Fragment() {

    private var _binding: FragmentTaggerBinding? = null
    private val binding get() = _binding!!

    private var isExpanded = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTaggerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        // Kattintási esemény a képre
        binding.img.setOnClickListener(View.OnClickListener {
            isExpanded = if (!isExpanded) {
                // Ha a kép nincs nagyítva, akkor nagyítsuk fel
                binding.img.scaleType = ImageView.ScaleType.CENTER_CROP
                binding.img.layoutParams = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.MATCH_PARENT,
                    ConstraintLayout.LayoutParams.MATCH_PARENT
                )
                true
            } else {
                // Ha a kép nagyítva van, akkor állítsuk vissza az eredeti méretére
                binding.img.scaleType = ImageView.ScaleType.CENTER_INSIDE
                binding.img.layoutParams = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                false
            }
        })

        // Kattintási esemény a prevButton gombra
        binding.btnPrev?.setOnClickListener(View.OnClickListener {
            // Itt lehetne megvalósítani a kép előzőre lapozását
        })

        // Kattintási esemény a nextButton gombra
        binding.btnNext?.setOnClickListener(View.OnClickListener {
            // Itt lehetne megvalósítani a kép következőre lapozását
        })

    }
}