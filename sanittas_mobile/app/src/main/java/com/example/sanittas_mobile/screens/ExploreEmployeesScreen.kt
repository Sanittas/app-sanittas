package com.example.sanittas_mobile.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sanittas_mobile.R
import com.example.sanittas_mobile.navigation.AppNavigation


data class Funcionario(
    val nome: String,
    val empresa: String,
    val especializacao: String,
    val avaliacao: Float
)

val funcionarios = listOf(
    Funcionario(
        nome = "Ana Oliveira",
        empresa = "Clínica São Gabriel",
        especializacao = "Cardiologista",
        avaliacao = 4.8f
    ),
    Funcionario(
        nome = "João Silva",
        empresa = "Clínica São Judas",
        especializacao = "Oftalmologista",
        avaliacao = 4.5f
    ),
    Funcionario(
        nome = "Maria Souza",
        empresa = "Albert Einstein",
        especializacao = "Pediatra",
        avaliacao = 4.9f
    ),
    Funcionario(
        nome = "Pedro Santos",
        empresa = "Romeu Lindenberg",
        especializacao = "Dentista",
        avaliacao = 4.3f
    ),
    Funcionario(
        nome = "Camila Fernandes",
        empresa = "Clínica Alma Brasil",
        especializacao = "Fisioterapeuta",
        avaliacao = 4.7f
    ),
    Funcionario(
        nome = "Bruno Costa",
        empresa = "Antoine Larouix",
        especializacao = "Nutricionista",
        avaliacao = 4.6f
    ),
    Funcionario(
        nome = "Rafael Pereira",
        empresa = "Clínica São Judas",
        especializacao = "Dermatologista",
        avaliacao = 4.4f
    ),
    Funcionario(
        nome = "Luisa Martins",
        empresa = "Clínica São Gabriel",
        especializacao = "Ginecologista",
        avaliacao = 4.8f
    ),
    Funcionario(
        nome = "Daniel Barbosa",
        empresa = "Romeu Lindenberg",
        especializacao = "Psicólogo",
        avaliacao = 4.2f
    ),
)

@Composable
fun EmployeesScreen() {
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
                    .clickable { }
            )
            Text(
                text = stringResource(id = R.string.explore_top_bar),
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = R.string.employees_top),
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .clickable { },
                style = MaterialTheme.typography.titleMedium,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = null,
                tint = Color.Gray,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
        var pesquisa by remember {
            mutableStateOf("")
        }
        OutlinedTextField(modifier = Modifier
            .width(320.dp)
            .align(Alignment.CenterHorizontally)
            .padding(top = 10.dp),
            shape = RoundedCornerShape(50),
            value = pesquisa,
            onValueChange = {
                pesquisa = it
            },
            label = {
                Text(stringResource(id = R.string.explore_label))
            },
            placeholder = {
                Text(stringResource(id = R.string.employees_placeholder))
            }
        )
        Divider(
            modifier = Modifier.padding(top = 30.dp),
            color = Color.LightGray
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp)
        ) {
            items(funcionarios) { funcionario ->
                Text(
                    text = funcionario.nome,
                    maxLines = 1,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 10.dp, top = 5.dp),
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.SemiBold),
                    color = Color.Black,
                )
                Text(
                    text = "${funcionario.especializacao} \n${funcionario.empresa} \nAvaliação: ${funcionario.avaliacao}",
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 10.dp, top = 5.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray,
                )
                Divider(
                    modifier = Modifier.padding(top = 5.dp),
                    color = Color.LightGray
                )
            }
        }
        AppNavigation()
    }
}


@Preview
@Composable
fun EmployeesPreview() {
    EmployeesScreen()
}