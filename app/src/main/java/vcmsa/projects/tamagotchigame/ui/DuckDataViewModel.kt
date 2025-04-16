package vcmsa.projects.tamagotchigame.ui

// (Android Developers, 2025)
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

// (JetBrains, 2022)
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


// (Android Developers, 2025)
class DuckDataViewModel : ViewModel() {
    var hunger = MutableLiveData(60)
    var sleep = MutableLiveData(60)
    var boredom = MutableLiveData(60)
    var cleanliness = MutableLiveData(60)
    var depression = MutableLiveData(50)

    val gameOver = MutableLiveData(false)

    init {
        startDecayLoop()
    }


    // (Android Developers, 2025)
    private fun startDecayLoop() {

        // (JetBrains, 2022)
        viewModelScope.launch {
            while (gameOver.value != true) {
                delay(5000)
                decreaseStat(hunger)
                decreaseStat(sleep)
                decreaseStat(boredom)
                decreaseStat(cleanliness)
                updateDepression()
                checkGameOver()
            }
        }
    }

    // (Android Developers, 2025)
    private fun decreaseStat(stat: MutableLiveData<Int>) {
        val current = stat.value ?: 0
        stat.value = (current - 10).coerceAtLeast(0)
    }

    // (Android Developers, 2025)
    fun adjustStats(stat: MutableLiveData<Int>) {
        if (gameOver.value == true) return
        stat.value = (stat.value ?: 0).coerceAtMost(100) + 15
        updateDepression()
        checkGameOver()
    }

    private fun updateDepression() {
        val avg = listOf(
            hunger.value ?: 0,
            sleep.value ?: 0,
            boredom.value ?: 0,
            cleanliness.value ?: 0
        ).average()
        depression.value = (100 - avg).toInt().coerceIn(0, 100)
    }

    private fun checkGameOver() {
        if ((depression.value ?: 0) >= 100 ||
            (hunger.value ?: 0) <= 0 ||
            (sleep.value ?: 0) <= 0 ||
            (boredom.value ?: 0) <= 0 ||
            (cleanliness.value ?: 0) <= 0
        ) {
            gameOver.value = true
        }
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