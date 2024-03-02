package com.example.sanittas_mobile.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sanittas_mobile.R
import com.example.sanittas_mobile.navigation.AppNavigation

@Composable
fun ServicesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
            horizontalArrangement = Arrangement.Absolute.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_sanittas),
                contentDescription = null,
                modifier = Modifier
                    .height(60.dp)
                    .aspectRatio(2f)
                    .padding(top = 15.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.nome_sanittas),
                contentDescription = null,
                modifier = Modifier
                    .height(60.dp)
                    .aspectRatio(2f)
                    .padding(top = 15.dp)
            )
        }
        Divider(
            color = Color.LightGray
        )
        Text(
            text = stringResource(id = R.string.home_top),
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            color = Color.Black,
            style = MaterialTheme.typography.titleMedium
        )
        var cidade by remember {
            mutableStateOf("")
        }
        OutlinedTextField(modifier = Modifier
            .width(390.dp)
            .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(50),
            value = cidade,
            onValueChange = {
                cidade = it
            },
            label = {
                Text(stringResource(id = R.string.home_label))
            },
            placeholder = {
                Text(stringResource(id = R.string.home_placeholder))
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.LocationOn,
                    contentDescription = null,
                    tint = colorResource(id = R.color.sanittas),
                    modifier = Modifier.size(24.dp))
            }
            )
        Spacer(modifier = Modifier.height(20.dp))
        CardList()
        AppNavigation()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewServicesScreen() {
    ServicesScreen()
}

@Composable
fun CardList() {
    data class icon(
        val id: Int,
        val text: String,
        val imagem: Int = R.drawable.medico
    )

    val listOfIcons = listOf(
        icon(
            id = 1,
            imagem = R.drawable.medico,
            text = stringResource(id = R.string.icon_id1)
        ),
        icon(
            id = 2,
            imagem = R.drawable.dentista,
            text = stringResource(id = R.string.icon_id2)
        ),
        icon(
            id = 3,
            imagem = R.drawable.enfermeiro,
            text = stringResource(id = R.string.icon_id3)
        ),
        icon(
            id = 4,
            imagem = R.drawable.psicologo,
            text = stringResource(id = R.string.icon_id4)
        ),
        icon(
            id = 5,
            imagem = R.drawable.fisioterapeuta,
            text = stringResource(id = R.string.icon_id5)
        ),
        icon(
            id = 6,
            imagem = R.drawable.geriatra,
            text = stringResource(id = R.string.icon_id6)
        ),
        icon(
            id = 7,
            imagem = R.drawable.pediatra,
            text = stringResource(id = R.string.icon_id7)
        ),
        icon(
            id = 8,
            imagem = R.drawable.nutricionista,
            text = stringResource(id = R.string.icon_id8)
        ),
        icon(
            id = 9,
            imagem = R.drawable.obstetra,
            text = stringResource(id = R.string.icon_id9)
        )
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(3)
    ) {
        items(listOfIcons) { icon ->
            CardItem(
                imagem = icon.imagem,
                text = icon.text
            )
        }
    }
}

@Preview
@Composable
fun CardListPreview() {
    CardList()
}

@Composable
fun CardItem(
    @DrawableRes imagem: Int,
    text: String
) {
    Card(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 25.dp)
            .width(150.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = imagem),
                contentDescription = "Médico",
                modifier = Modifier.padding((4.dp))
            )
            Text(
                modifier = Modifier.padding(top = 3.dp),
                text = text,
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}
