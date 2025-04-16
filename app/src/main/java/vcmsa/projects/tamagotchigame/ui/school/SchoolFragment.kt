package vcmsa.projects.tamagotchigame.ui.school

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import vcmsa.projects.tamagotchigame.databinding.FragmentSchoolBinding
import vcmsa.projects.tamagotchigame.ui.school.SchoolViewModel

class SchoolFragment : Fragment()
{
    private var _binding: FragmentSchoolBinding? = null
    private val binding get() = _binding!!
    private lateinit var schoolViewModel: SchoolViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSchoolBinding.inflate(inflater, container, false)

       schoolViewModel = ViewModelProvider(this)[SchoolViewModel::class.java]

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}