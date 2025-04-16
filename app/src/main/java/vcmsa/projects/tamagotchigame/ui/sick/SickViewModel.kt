package vcmsa.projects.tamagotchigame.ui.sick

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SickViewModel : ViewModel() {

        private val _text = MutableLiveData<String>().apply {
            value = "This is Angry Fragment"
        }
        val text: LiveData<String> = _text
    }