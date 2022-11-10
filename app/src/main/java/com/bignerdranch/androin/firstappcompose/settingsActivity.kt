package com.bignerdranch.androin.firstappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.androin.firstappcompose.ui.theme.FirstAppComposeTheme

class settingsActivity : ComponentActivity() {
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
                
                CreateHeaderButtonProfile(header = "Настройки")
                
                //Main

                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.95f)
                        .height(400.dp)
                ) {
                    Row(Modifier.fillMaxWidth(0.95f),horizontalArrangement = Arrangement.SpaceBetween,verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Профиль пользователя", color = Color.White, fontSize = 22.sp)
                        Image(painterResource(R.drawable.vector), contentDescription = "", Modifier.size(17.dp))
                    }
                    Row(Modifier.fillMaxWidth(0.95f),horizontalArrangement = Arrangement.SpaceBetween,verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Дата и время", color = Color.White, fontSize = 22.sp)
                        Image(painterResource(R.drawable.vector), contentDescription = "", Modifier.size(17.dp))
                    }
                    Row(Modifier.fillMaxWidth(0.95f),horizontalArrangement = Arrangement.SpaceBetween,verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Настройки звука", color = Color.White, fontSize = 22.sp)
                        Image(painterResource(R.drawable.vector), contentDescription = "", Modifier.size(17.dp))
                    }
                    Row(Modifier.fillMaxWidth(0.95f),horizontalArrangement = Arrangement.SpaceBetween,verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Проверить обновления", color = Color.White, fontSize = 22.sp)
                        Image(painterResource(R.drawable.vector), contentDescription = "", Modifier.size(17.dp))
                    }
                }



                //Bottom

                CreateNavigation(value = 4)

                
                /*
                Column(
                    modifier = Modifier
                        .height(150.dp)
                        .fillMaxWidth(0.95f),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
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
                                        .width(42.dp),
                                    verticalArrangement = Arrangement.SpaceBetween,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(painterResource(R.drawable.listred), contentDescription = "", Modifier.size(32.dp))
                                    Text(text = "List", fontSize = 11.sp, color = Color(238, 96, 85))
                                }
                                //Alarm
                                Column(
                                    Modifier
                                        .width(42.dp),
                                    verticalArrangement = Arrangement.SpaceBetween,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(painterResource(R.drawable.alarm), contentDescription = "", Modifier.size(32.dp))
                                    Text(text = "Alarm", fontSize = 11.sp, color = Color(238, 96, 85))
                                }
                                //Calendar
                                Column(
                                    Modifier
                                        .width(42.dp),
                                    verticalArrangement = Arrangement.SpaceBetween,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(painterResource(R.drawable.calendar), contentDescription = "", Modifier.size(32.dp))
                                    Text(text = "Calendar", fontSize = 11.sp, color = Color(238, 96, 85))
                                }
                                //Settings
                                Column(
                                    Modifier
                                        .width(42.dp),
                                    verticalArrangement = Arrangement.SpaceBetween,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(painterResource(R.drawable.settingsgreen), contentDescription = "", Modifier.size(32.dp))
                                    Text(text = "Settings", fontSize = 11.sp, color = Color(96, 211, 148))
                                }
                            }
                        }
                    }
                }
                
                 */
            }
        }
    }
}
