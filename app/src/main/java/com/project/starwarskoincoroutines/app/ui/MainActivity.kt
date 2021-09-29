package com.project.starwarskoincoroutines.app.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.starwarskoincoroutines.app.MainViewModel
import com.project.starwarskoincoroutines.databinding.ActivityMainBinding
import com.project.starwarskoincoroutines.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startKoin {
            androidLogger()
            androidContext(this@MainActivity)
            modules(appModule)
        }
    }
}