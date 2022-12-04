package com.example.wdproject.screens

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.wdproject.R
import com.example.wdproject.ui.theme.Black
import com.example.wdproject.ui.theme.Grey
import com.example.wdproject.ui.theme.Orange

@Composable
fun LoadCard() {
    Card(
        modifier = Modifier.fillMaxSize(),
        backgroundColor = Black,
        elevation = 0.dp,
        shape = RoundedCornerShape(0.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

            ) {
            Image(
                painter = painterResource(id = R.drawable.ic_logo),
                contentDescription = "icon logo",
                modifier = Modifier.width(213.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(id = R.drawable.worldcinema),
                contentDescription = "text",
                modifier = Modifier.width(249.dp)
            )
        }

    }

}

@Composable
fun Register() {
    val Email = remember {
        mutableStateOf("")
    }
    val Password = remember {
        mutableStateOf("")
    }
    Card(
        modifier = Modifier.fillMaxSize(),
        backgroundColor = Black,
        elevation = 0.dp,
        shape = RoundedCornerShape(0.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_logo),
                    contentDescription = "icon logo",
                    modifier = Modifier.width(213.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(id = R.drawable.worldcinema),
                    contentDescription = "text",
                    modifier = Modifier.width(249.dp)
                )
            }
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier.fillMaxHeight(0.65f)
                ) {
                    val modifier = Modifier
                        .border(1.dp, Grey, shape = RoundedCornerShape(4.dp))
                        .width(328.dp)
                        .height(44.dp)
                    LazyColumn() {
                        item {
                            TextField(
                                value = Email.value,
                                onValueChange = { value -> Email.value = value },
                                modifier = modifier,
                                placeholder = {
                                    Text(
                                        text = "Email",
                                        color = Grey
                                    )
                                },
                                textStyle = TextStyle(Grey)
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                        }
                        item {
                            TextField(
                                value = Password.value,
                                onValueChange = { value -> Password.value = value },
                                modifier = modifier,
                                placeholder = {
                                    Text(
                                        text = "Пароль",
                                        color = Grey
                                    )
                                },
                                textStyle = TextStyle(Grey)
                            )
                        }
                    }
                }
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    val modifier = Modifier
                        .width(328.dp)
                        .height(44.dp)
                    Button(
                        modifier = modifier,
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            Orange,
                            White,
                            Orange,
                            Black
                        )
                    ) {
                        Text(text = "Войти", fontWeight = FontWeight(700))
                    }
                    Button(
                        modifier = modifier
                            .border(1.dp, Grey, shape = RoundedCornerShape(4.dp)),
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            Black,
                            Orange,
                            Black,
                            Orange
                        )
                    ) {
                        Text(text = "Регистрация", fontWeight = FontWeight(700))
                    }
                }
            }
        }
    }
}

@Composable
fun SignIn() {
    val Email = remember {
        mutableStateOf("")
    }
    val Family = remember {
        mutableStateOf("")
    }
    val Name = remember {
        mutableStateOf("")
    }
    val Pass = remember {
        mutableStateOf("")
    }
    val PassProverka = remember {
        mutableStateOf("")
    }
    Card(
        modifier = Modifier.fillMaxSize(),
        backgroundColor = Black,
        elevation = 0.dp,
        shape = RoundedCornerShape(0.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.4f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_logo),
                    contentDescription = "icon logo",
                    modifier = Modifier.width(213.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(id = R.drawable.worldcinema),
                    contentDescription = "text",
                    modifier = Modifier.width(249.dp)
                )
            }
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier.fillMaxHeight(0.7f)
                ) {

                    val modifier = Modifier
                        .border(1.dp, Grey, shape = RoundedCornerShape(4.dp))
                        .width(328.dp)
                        .height(44.dp)

                    LazyColumn() {
                        item {
                            TextField(
                                value = Email.value,
                                onValueChange = { value -> Email.value = value },
                                modifier = modifier,
                                placeholder = {
                                    Text(
                                        text = "Email",
                                        color = Grey
                                    )
                                },
                                textStyle = TextStyle(Grey)
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                        }
                        item {
                            TextField(
                                value = Family.value,
                                onValueChange = { value -> Family.value = value },
                                modifier = modifier,
                                placeholder = {
                                    Text(
                                        text = "Фамилия",
                                        color = Grey
                                    )
                                },
                                textStyle = TextStyle(Grey)
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                        }
                        item {
                            TextField(
                                value = Name.value,
                                onValueChange = { value -> Name.value = value },
                                modifier = modifier,
                                placeholder = {
                                    Text(
                                        text = "Имя",
                                        color = Grey
                                    )
                                },
                                textStyle = TextStyle(Grey)
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                        }
                        item {
                            TextField(
                                value = Pass.value,
                                onValueChange = { value -> Pass.value = value },
                                modifier = modifier,
                                placeholder = {
                                    Text(
                                        text = "Пароль",
                                        color = Grey
                                    )
                                },
                                textStyle = TextStyle(Grey)
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                        }
                        item {
                            TextField(
                                value = PassProverka.value,
                                onValueChange = { value -> PassProverka.value = value },
                                modifier = modifier,
                                placeholder = {
                                    Text(
                                        text = "Подтвердите Пароль",
                                        color = Grey
                                    )
                                },
                                textStyle = TextStyle(Grey)
                            )
                        }
                    }
                }
                Column(
                    modifier = Modifier.fillMaxHeight()
                ) {
                    val modifier = Modifier
                        .width(328.dp)
                        .height(44.dp)
                    Button(
                        modifier = modifier,
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            Orange,
                            White,
                            Orange,
                            Black
                        )
                    ) {
                        Text(text = "Зарегистрироваться", fontWeight = FontWeight(700))
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        modifier = modifier
                            .border(1.dp, Grey, shape = RoundedCornerShape(4.dp)),
                        onClick = {

                        },
                        colors = ButtonDefaults.buttonColors(
                            Black,
                            Orange,
                            Black,
                            Orange
                        )
                    ) {
                        Text(text = "У меня уже есть аккаунт", fontWeight = FontWeight(700))
                    }
                }
            }
        }
    }
}

@Composable
fun trend() {

}
