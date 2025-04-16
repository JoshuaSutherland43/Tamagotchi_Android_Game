package vcmsa.projects.tamagotchigame.ui.happy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import vcmsa.projects.tamagotchigame.databinding.FragmentHappyBinding
import vcmsa.projects.tamagotchigame.ui.happy.HappyViewModel

class HappyFragment : Fragment()
{
    private var _binding: FragmentHappyBinding? = null
    private val binding get() = _binding!!
    private lateinit var happyViewModel: HappyViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHappyBinding.inflate(inflater, container, false)

        happyViewModel = ViewModelProvider(this)[HappyViewModel::class.java]

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}