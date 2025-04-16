package vcmsa.projects.tamagotchigame

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

// (Android Developers, 2025)
import androidx.lifecycle.ViewModelProvider

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import vcmsa.projects.tamagotchigame.databinding.ActivityMainBinding
import vcmsa.projects.tamagotchigame.ui.DuckDataViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var duckStatsViewModel: DuckDataViewModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // (Android Developers, 2025)
        duckStatsViewModel = ViewModelProvider(this)[DuckDataViewModel::class.java]

        duckStatsViewModel.sleep.observe(this) {
            binding.sleepStatus.text = "Sleep: ${it}%"
        }
        duckStatsViewModel.hunger.observe(this) {
            binding.hungerStatus.text = "Hunger: ${it}%"
        }
        duckStatsViewModel.boredom.observe(this) {
            binding.boredomStatus.text = "Sanity: ${it}%"
        }
        duckStatsViewModel.cleanliness.observe(this) {
            binding.cleanlinessStatus.text = "Cleanliness: ${it}%"
        }
        duckStatsViewModel.depression.observe(this) {
            binding.depressionProgress.progress = it
        }

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
        val navController = navHostFragment.navController
        binding.navView.setupWithNavController(navController)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_read, R.id.navigation_bath, R.id.navigation_eat, R.id.navigation_sleep
            )
        )

        setupActionBarWithNavController(navController, appBarConfiguration)


    }

    fun lockToHome() {
        val navController = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
        navController.navController.navigate(R.id.navigation_home)

        binding.navView.visibility = View.GONE
    }
}

// Android Developers (2025)
// Lifecycle: jetpack: Android developers, Android Developers.
// Available at: https://developer.android.com/jetpack/androidx/releases/lifecycle#kts
// (Accessed: 14 April 2025).

// (Android Developers, 2025)