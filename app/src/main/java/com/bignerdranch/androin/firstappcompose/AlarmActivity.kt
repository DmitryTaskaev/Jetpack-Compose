package com.bignerdranch.androin.firstappcompose

import android.content.Intent
import android.os.Bundle
import android.widget.Switch
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.androin.firstappcompose.ui.theme.FirstAppComposeTheme

class AlarmActivity : ComponentActivity() {
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
                CreateHeaderButtonProfile(header = "Будильник")
                //Main
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.95f)
                        .height(400.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(0.95f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .clickable(
                                    onClick = {
                                        val int = Intent(this@AlarmActivity, EditAlarm::class.java)
                                        startActivity(int)
                                    }
                                ),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "07:30", fontSize = 48.sp, color = Color.White)
                            val checkedState = remember { mutableStateOf(true) }
                            Switch(
                                checked = checkedState.value,
                                modifier = Modifier,
                                onCheckedChange = { checkedState.value = it }
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .clickable(
                                    onClick = {
                                        val int = Intent(this@AlarmActivity, EditAlarm::class.java)
                                        startActivity(int)
                                    }
                                ),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "08:00", fontSize = 48.sp, color = Color.White)
                            val checkedState = remember { mutableStateOf(true) }
                            Switch(
                                checked = checkedState.value,
                                onCheckedChange = { checkedState.value = it },
                                colors = SwitchDefaults.colors(
                                    checkedThumbColor = Color.White,
                                    checkedTrackColor = Color(),
                                    uncheckedThumbColor = Color(),
                                    uncheckedTrackColor = Color()
                                )
                            )
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
                        onClick = {
                            val int = Intent(this@AlarmActivity, AddAlarmActivity::class.java)
                            startActivity(int)

                        }) {
                        Text(text = "Добавить будильник", color = Color.White, fontSize = 17.sp)
                    }
                    CreateNavigation(value = 2)
                }

            }
        }
    }
}

@Composable
fun Greeting2(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    FirstAppComposeTheme {
        Greeting2("Android")
    }
}