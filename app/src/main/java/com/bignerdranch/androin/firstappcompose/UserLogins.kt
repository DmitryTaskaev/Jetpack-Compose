package com.bignerdranch.androin.firstappcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.androin.firstappcompose.ui.theme.FirstAppComposeTheme

class UserLogins : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(96, 211, 148)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                CreateHeaderButtonBack(header = "Войти")
                Column(
                    Modifier
                        .fillMaxWidth(0.95f)
                        .height(220.dp)
                        .offset(0.dp,150.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    TextField(value = "Имя пользователя", onValueChange = {}, Modifier.clip(
                        RoundedCornerShape(15))
                        .background(Color.White).fillMaxWidth(0.95f).height(54.dp)
                    )
                    TextField(value = "Пароль", onValueChange = {}, Modifier.clip(
                        RoundedCornerShape(15))
                        .background(Color.White).fillMaxWidth(0.95f).height(54.dp)
                    )
                    Button(
                        modifier = Modifier.fillMaxWidth(0.95f).height(48.dp),
                        shape = RoundedCornerShape(13.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(	170, 246, 131)) ,
                        onClick = {
                            val int = Intent(this@UserLogins, MainActivity::class.java)
                            startActivity(int)
                        }) {
                        Text(text = "Войти", color = Color.White, fontSize = 17.sp)
                    }

                }

            }
        }
    }
}

@Composable
fun Greeting8(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview8() {
    FirstAppComposeTheme {
        Greeting8("Android")
    }
}