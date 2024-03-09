package com.example.sanittas_mobile.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sanittas_mobile.R
import com.example.sanittas_mobile.navigation.AppNavigation

@Composable
fun SupportScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow_back),
                contentDescription = null,
                modifier = Modifier
                    .aspectRatio(1f)
                    .padding(start = 10.dp)
            )
            Text(
                text = stringResource(id = R.string.support_top_bar),
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 110.dp),
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.SemiBold),
                color = colorResource(id = R.color.sanittas)
            )
        }
        Divider(
            color = Color.LightGray
        )
        Text(
            text = stringResource(id = R.string.support_top),
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp, start = 15.dp),
            color = Color.Black,
            style = MaterialTheme.typography.titleMedium.copy(fontSize = 20.sp)
        )
        CardListSupport()
        AppNavigation()
    }
}

@Preview(showBackground = true)
@Composable
fun SupportPreview() {
    SupportScreen()
}

@Composable
fun CardListSupport() {
    data class Icon(
        val id: Int,
        val text: String,
        val imagem: Int = R.drawable.medico
    )

    val listOfIcons = listOf(
        Icon(
            id = 1,
            imagem = R.drawable.conta,
            text = stringResource(id = R.string.support_icon_id1)
        ),
        Icon(
            id = 2,
            imagem = R.drawable.login_senha,
            text = stringResource(id = R.string.support_icon_id2)
        ),
        Icon(
            id = 3,
            imagem = R.drawable.pagamento,
            text = stringResource(id = R.string.support_icon_id3)
        ),
        Icon(
            id = 4,
            imagem = R.drawable.preferencias,
            text = stringResource(id = R.string.support_icon_id4)
        ),
        Icon(
            id = 5,
            imagem = R.drawable.fale_conosco,
            text = stringResource(id = R.string.support_icon_id5)
        ),
        Icon(
            id = 6,
            imagem = R.drawable.politica_termos_uso,
            text = stringResource(id = R.string.support_icon_id6)
        )
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(top = 20.dp)
    ) {
        items(listOfIcons) { icon ->
            CardItemSupport(
                imagem = icon.imagem,
                text = icon.text,
            )
        }
    }
}

@Preview
@Composable
fun CardListSupportPreview() {
    CardListSupport()
}


@Composable
fun CardItemSupport(
    @DrawableRes imagem: Int,
    text: String
) {
    Card(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 25.dp)
            .width(120.dp)
            .height(150.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = imagem),
                contentDescription = "Médico",
                modifier = Modifier
                    .size(90.dp)
                    .padding(4.dp)
            )
            Text(
                modifier = Modifier.padding(top = 3.dp),
                text = text,
                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.SemiBold)
            )
        }
    }
}

