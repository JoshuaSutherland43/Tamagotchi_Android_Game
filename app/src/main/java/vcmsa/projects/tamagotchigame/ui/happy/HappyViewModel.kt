package vcmsa.projects.tamagotchigame.ui.happy
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HappyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Angry Fragment"
    }
    val text: LiveData<String> = _text
}