package com.bignerdranch.androin.firstappcompose

import android.graphics.fonts.FontStyle
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.androin.firstappcompose.ui.theme.FirstAppComposeTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(96, 211, 148)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                //Header
                Row(
                    modifier = Modifier
                        .fillMaxHeight(0.1f) //0.070
                        .fillMaxWidth(0.95f),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Список дел", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White)
                    Image(painterResource(R.drawable.avatar), contentDescription = "", Modifier.size(55.dp))
                }
                //Main
                Column(
                    modifier = Modifier
                        //.fillMaxHeight(0.7f)
                        .height(300.dp)
                        .fillMaxWidth(0.95f)
                        .offset(0.dp, -70.dp),
                        verticalArrangement = Arrangement.SpaceBetween

                ){
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .height(90.dp),

                    ) {
                        Card(
                            shape = RoundedCornerShape(30.dp,0.dp,30.dp,0.dp),
                            elevation = 4.dp

                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color(255, 217, 125)),
                                    verticalArrangement = Arrangement.SpaceAround,
                                    horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(0.9f)
                                        .fillMaxHeight(0.7f),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth(0.7f),
                                            verticalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(text = "Вечерний поход в кино", fontSize = 18.sp, color = Color.White)
                                        Text(text = "Идем в кино с коллегами!", fontSize = 12.sp, color = Color(235, 235, 235))
                                    }
                                    Column() {
                                        Text(text = "10.02.2021", fontSize = 12.sp, color = Color(235, 235, 235))
                                        Text(text = "19:40", fontSize = 12.sp, color = Color(235, 235, 235))
                                    }
                                }
                            }
                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .height(90.dp)

                    ) {
                        Card(
                            shape = RoundedCornerShape(30.dp,0.dp,30.dp,0.dp),
                            elevation = 4.dp

                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color(255, 217, 125)),
                                verticalArrangement = Arrangement.SpaceAround,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(0.9f)
                                        .fillMaxHeight(0.7f),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth(0.7f),
                                        verticalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(text = "Забрать заказ Ozon", fontSize = 18.sp, color = Color.White)
                                        Text(text = "Пункт выдачи на ул. Ленина, 103", fontSize = 12.sp, color = Color(235, 235, 235))
                                    }
                                    Column() {
                                        Text(text = "10.02.2021", fontSize = 12.sp, color = Color(235, 235, 235))
                                        Text(text = "19:40", fontSize = 12.sp, color = Color(235, 235, 235))
                                    }
                                }
                            }
                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .height(90.dp)
                    ) {
                        Card(
                            shape = RoundedCornerShape(30.dp,0.dp,30.dp,0.dp),
                            elevation = 4.dp

                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color(255, 217, 125)),
                                verticalArrangement = Arrangement.SpaceAround,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(0.9f)
                                        .fillMaxHeight(0.7f),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth(0.7f),
                                        verticalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(text = "Запись в автосервис", fontSize = 18.sp, color = Color.White)
                                        Text(text = "Сдать автомобиль в автосервис на ул. Бисертская, д. 14. Замена масла", fontSize = 12.sp, color = Color(235, 235, 235))
                                    }
                                    Column() {
                                        Text(text = "10.02.2021", fontSize = 12.sp, color = Color(235, 235, 235))
                                        Text(text = "19:40", fontSize = 12.sp, color = Color(235, 235, 235))
                                    }
                                }
                            }
                        }
                    }
                }
                //Bottom

                Column(
                    modifier = Modifier
                        .height(150.dp)
                        .fillMaxWidth(0.95f),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        modifier = Modifier
                            .width(312.dp)
                            .height(48.dp),
                            shape = RoundedCornerShape(13.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(	170, 246, 131)) ,
                        onClick = { }) {
                        Text(text = "Добавить задачу", color = Color.White, fontSize = 17.sp)
                    }
                    Row(
                        modifier = Modifier
                            .width(288.dp)
                            .height(72.dp)
                    ){
                        Card(
                            shape = RoundedCornerShape(30.dp,30.dp,0.dp,0.dp),
                            elevation = 4.dp
                        ) {
                            Row(
                                Modifier
                                    .background(Color(170, 246, 131))
                                    .fillMaxWidth(1f)
                                    .height(72.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceAround
                            ) {
                                //List
                                Column(
                                    Modifier
                                        .width(38.dp),
                                    verticalArrangement = Arrangement.SpaceBetween,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(painterResource(R.drawable.list), contentDescription = "", Modifier.size(32.dp))
                                    Text(text = "List", fontSize = 11.sp, color = Color(96, 211, 148))
                                }
                                //Alarm
                                Column(
                                    Modifier
                                        .width(38.dp),
                                    verticalArrangement = Arrangement.SpaceBetween,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(painterResource(R.drawable.alarm), contentDescription = "", Modifier.size(32.dp))
                                    Text(text = "List", fontSize = 11.sp, color = Color(238, 96, 85))
                                }
                                //Calendar
                                Column(
                                    Modifier
                                        .width(38.dp),
                                    verticalArrangement = Arrangement.SpaceBetween,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(painterResource(R.drawable.calendar), contentDescription = "", Modifier.size(32.dp))
                                    Text(text = "List", fontSize = 11.sp, color = Color(238, 96, 85))
                                }
                                //Settings
                                Column(
                                    Modifier
                                        .width(38.dp),
                                    verticalArrangement = Arrangement.SpaceBetween,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(painterResource(R.drawable.settings), contentDescription = "", Modifier.size(32.dp))
                                    Text(text = "List", fontSize = 11.sp, color = Color(238, 96, 85))
                                }
                            }
                        }
                    }
                }





            }

        }
    }
}





@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstAppComposeTheme {

    }
}
@Composable
fun MultiGreating(name: String){
    Column {
        repeat(10){
            Greeting(name)
        }
    }
}