package vcmsa.projects.tamagotchigame.ui.death

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import vcmsa.projects.tamagotchigame.databinding.FragmentDeathBinding

class DeathFragment : Fragment()
{
    private var _binding: FragmentDeathBinding? = null
    private val binding get() = _binding!!
    private lateinit var deathViewModel: DeathViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDeathBinding.inflate(inflater, container, false)

        deathViewModel = ViewModelProvider(this)[DeathViewModel::class.java]

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}