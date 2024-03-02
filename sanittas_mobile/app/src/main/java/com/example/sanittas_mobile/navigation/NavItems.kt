package com.example.sanittas_mobile.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val listOfNavItems = listOf(
    NavItem(
        label = "Home",
        icon = Icons.Default.Home,
        route = Screens.HomeScreen.name
    ),
    NavItem(
        label = "Pesquisar",
        icon = Icons.Default.Search,
        route = Screens.SearchScreen.name
    ),
    NavItem(
        label = "Agenda",
        icon = Icons.Default.DateRange,
        route = Screens.SchedulingScreen.name
    ),
    NavItem(
        label = "Perfil",
        icon = Icons.Default.Person,
        route = Screens.ProfileScreen.name
    ),

    )