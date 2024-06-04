package com.example.importactivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.importactivity.databinding.ActivityMainBinding
import com.example.importactivity.ui.theme.ImportActivityTheme

class MainActivity : AppCompatActivity(){
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnImport.setOnClickListener{
            val intent: Intent = Intent().apply {
                action = Intent.ACTION_EDIT
                `package` = "com.example.exportactivity"
            }
            val chooseIntent = Intent.createChooser(intent, null)
            startActivity(chooseIntent)
        }
    }
}