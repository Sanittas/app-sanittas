package com.example.sanittasapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sanittasapp.ui.theme.SanittasAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SanittasAppTheme {
                App()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
                horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_sanittas),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(20.dp))
            Image(
                painter = painterResource(id = R.drawable.nome_sanittas),
                contentDescription = null,
                modifier = Modifier.padding(top = 15.dp)
            )
        }
        val resources = LocalContext.current.resources

        Text(
            text = "Login",
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            color = Color(resources.getColor(R.color.sea_serpent)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp)
        )

        var email by remember {
            mutableStateOf("")
        }

        var senha by remember {
            mutableStateOf("")
        }

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = email,
            onValueChange = { it ->
                email = it
            },
            label = {
                Text(text = "E-mail")
            },
            placeholder = {
                Text(text = "Digite o seu e-mail completo")
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF1F5F4)
            )
        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = senha,
            onValueChange = { it ->
                senha = it
            },
            label = {
                Text(text = "Senha")
            },
            placeholder = {
                Text(text = "Digite a sua senha")
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF1F5F4)
            )
        )
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(resources.getColor(R.color.sea_serpent)) // Definir a cor de fundo aqui
            ),
            onClick = { /*TODO*/ }) {
            Text(text = "Acessar")
        }
    }
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(bottom = 30.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Divider(
            color = Color.LightGray
        )

        Text(
            text = "Não tenho uma conta. Toque para criar uma agora.",
            modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 13.sp,
            color = Color.Gray,
            )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Register() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_sanittas),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(20.dp))
            Image(
                painter = painterResource(id = R.drawable.nome_sanittas),
                contentDescription = null,
                modifier = Modifier.padding(top = 15.dp)
            )
        }
        val resources = LocalContext.current.resources

        Text(
            text = "Cadastro",
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            color = Color(resources.getColor(R.color.sea_serpent)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp)
        )
        var nome by remember {
            mutableStateOf("")
        }

        var telefone by remember {
            mutableStateOf("")
        }

        var email by remember {
            mutableStateOf("")
        }

        var senha by remember {
            mutableStateOf("")
        }

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = nome,
            onValueChange = { it ->
                nome = it
            },
            label = {
                Text(text = "Nome")
            },
            placeholder = {
                Text(text = "Digite o seu nome completo")
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF1F5F4)
            )
        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = telefone,
            onValueChange = { it ->
                telefone = it
            },
            label = {
                Text(text = "Telefone")
            },
            placeholder = {
                Text(text = "Digite o seu telefone")
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF1F5F4)
            )
        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = email,
            onValueChange = { it ->
                email = it
            },
            label = {
                Text(text = "E-mail")
            },
            placeholder = {
                Text(text = "Digite o seu e-mail completo")
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF1F5F4)
            )
        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = senha,
            onValueChange = { it ->
                senha = it
            },
            label = {
                Text(text = "Senha")
            },
            placeholder = {
                Text(text = "Digite a sua senha")
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF1F5F4)
            )
        )
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(resources.getColor(R.color.sea_serpent)) // Definir a cor de fundo aqui
            ),
            onClick = { /*TODO*/ }) {
            Text(text = "Acessar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    SanittasAppTheme {
        App()
    }
}