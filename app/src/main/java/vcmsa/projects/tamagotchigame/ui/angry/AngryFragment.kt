package vcmsa.projects.tamagotchigame.ui.angry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import vcmsa.projects.tamagotchigame.databinding.FragmentAngryBinding

class AngryFragment : Fragment()
{
    private var _binding: FragmentAngryBinding? = null
    private val binding get() = _binding!!
    private lateinit var angryViewModel: AngryViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAngryBinding.inflate(inflater, container, false)

        angryViewModel = ViewModelProvider(this)[AngryViewModel::class.java]

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}