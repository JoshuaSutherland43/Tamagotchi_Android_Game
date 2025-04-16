package vcmsa.projects.tamagotchigame.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

// (Android Developers, 2025)
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope

// (JetBrains, 2022)
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

import vcmsa.projects.tamagotchigame.databinding.FragmentReadBinding
import vcmsa.projects.tamagotchigame.ui.DuckDataViewModel

class DashboardFragment : Fragment() {
    private var _binding: FragmentReadBinding? = null
    private val binding get() = _binding!!
    private lateinit var readViewModel: DashboardViewModel
    private lateinit var duckDataViewModel: DuckDataViewModel

    // (JetBrains, 2022)
    private var job: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReadBinding.inflate(inflater, container, false)
        readViewModel = ViewModelProvider(this)[DashboardViewModel::class.java]
        duckDataViewModel = ViewModelProvider(requireActivity())[DuckDataViewModel::class.java]
        return binding.root
    }

    override fun onResume() {
        super.onResume()

        // (JetBrains, 2022)
        // (Android Developers, 2025)
        job = lifecycleScope.launch {
            while (isActive) {
                duckDataViewModel.adjustStats(duckDataViewModel.boredom)

                // (Android Developers, 2025)
                delay(2500L)
            }
        }
    }

    override fun onPause() {
        super.onPause()

        // (JetBrains, 2022)
        job?.cancel()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

// JetBrains (2022)
// Coroutines Basics: Kotlin, Kotlin Help.
// Available at: https://kotlinlang.org/docs/coroutines-basics.html#an-explicit-job
// (Accessed: 14 April 2025).


// Android Developers (2025)
// Lifecycle: jetpack: Android developers, Android Developers.
// Available at: https://developer.android.com/jetpack/androidx/releases/lifecycle#kts
// (Accessed: 14 April 2025).

// (JetBrains, 2022)
// (Android Developers, 2025)