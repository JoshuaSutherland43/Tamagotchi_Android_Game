package vcmsa.projects.tamagotchigame.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

// (Android Developers, 2025)
import androidx.lifecycle.ViewModelProvider

import vcmsa.projects.tamagotchigame.MainActivity
import vcmsa.projects.tamagotchigame.databinding.FragmentHomeBinding
import vcmsa.projects.tamagotchigame.ui.DuckDataViewModel
import vcmsa.projects.tamagotchigame.R

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var duckViewModel: DuckDataViewModel

    // (Android Developers, 2025)
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        duckViewModel = ViewModelProvider(requireActivity())[DuckDataViewModel::class.java]


        // (Android Developers, 2025)
        duckViewModel.depression.observe(viewLifecycleOwner) { depression ->
            when {
                depression >= 100 -> binding.imgDuck.setImageResource(R.drawable.grave)
                depression >= 70 -> binding.imgDuck.setImageResource(R.drawable.duck_sick)
                depression > 40 -> binding.imgDuck.setImageResource(R.drawable.duck_happy)
                else -> binding.imgDuck.setImageResource(R.drawable.kuchipatchi)
            }
        }

        // (Android Developers, 2025)
        duckViewModel.gameOver.observe(viewLifecycleOwner) { isGameOver ->
            if (isGameOver) {
                binding.messageOutput.text = "Game Over"
                binding.imgDuck.setImageResource(R.drawable.grave)
                (activity as? MainActivity)?.lockToHome()
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}



// Android Developers (2025)
// Lifecycle: jetpack: Android developers, Android Developers.
// Available at: https://developer.android.com/jetpack/androidx/releases/lifecycle#kts
// (Accessed: 14 April 2025).

// (Android Developers, 2025)