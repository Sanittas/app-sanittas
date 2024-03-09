package com.example.sanittas_mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.sanittas_mobile.screens.CompaniesScreen
import com.example.sanittas_mobile.screens.EmployeesScreen
import com.example.sanittas_mobile.screens.Empresa
import com.example.sanittas_mobile.screens.SupportScreen
import com.example.sanittas_mobile.ui.theme.Sanittas_mobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmployeesScreen()
        }
    }
}

