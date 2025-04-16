package vcmsa.projects.tamagotchigame.ui.sick

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import vcmsa.projects.tamagotchigame.databinding.FragmentSickBinding
import vcmsa.projects.tamagotchigame.ui.sick.SickViewModel

class SickFragment : Fragment()
{
    private var _binding: FragmentSickBinding? = null
    private val binding get() = _binding!!
    private lateinit var sickViewModel: SickViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSickBinding.inflate(inflater, container, false)

        sickViewModel = ViewModelProvider(this)[SickViewModel::class.java]

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}