package com.bignerdranch.androin.firstappcompose

import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity

@Composable
fun CreateHeaderButtonProfile(header: String){
    Row(
        modifier = Modifier
            .fillMaxHeight(0.1f) //0.070
            .fillMaxWidth(0.95f),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(header, fontWeight = FontWeight.Bold, fontSize = 25.sp, color = Color.White)
        Image(painterResource(R.drawable.avatar), contentDescription = "", Modifier.size(55.dp))
    }
}

@Composable
fun CreateHeaderButtonBack(header: String) {
    Row(
        modifier = Modifier
            .fillMaxHeight(0.1f) //0.070
            .fillMaxWidth(0.95f),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(header, fontWeight = FontWeight.Bold, fontSize = 25.sp, color = Color.White)
        Image(painterResource(R.drawable.backbutton), contentDescription = "", Modifier.size(55.dp))
    }
}
@Composable
fun CreateNavigation(value: Int){
    val context = LocalContext.current
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
                if (value == 1){
                    Column(
                        Modifier
                            .width(38.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.list), contentDescription = "", Modifier.size(32.dp).clickable (
                            onClick = {
                                val ints = Intent(context, MainActivity::class.java)
                                startActivity(context, ints, null)
                            }
                        ))
                        Text(text = "List", fontSize = 11.sp, color = Color(96, 211, 148))
                    }
                }
                else {
                    Column(
                        Modifier
                            .width(42.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.listred), contentDescription = "", Modifier.size(32.dp).clickable (
                            onClick = {
                                val ints = Intent(context, MainActivity::class.java)
                                startActivity(context, ints, null)
                            }
                        ))
                        Text(text = "List", fontSize = 11.sp, color = Color(238, 96, 85))
                    }
                }
                //Alarm
                if(value == 2){
                    Column(
                        Modifier
                            .width(42.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.alarmgreen), contentDescription = "", Modifier.size(32.dp).clickable (
                            onClick = {
                                val ints = Intent(context, AlarmActivity::class.java)
                                startActivity(context, ints, null)
                            }
                        ))
                        Text(text = "Alarm", fontSize = 11.sp, color = Color(96, 211, 148))
                    }
                }
                else {
                    Column(
                        Modifier
                            .width(42.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.alarm), contentDescription = "", Modifier.size(32.dp).clickable (
                            onClick = {
                                val ints = Intent(context, AlarmActivity::class.java)
                                startActivity(context, ints, null)
                            }
                        ))
                        Text(text = "Alarm", fontSize = 11.sp, color = Color(238, 96, 85))
                    }
                }
                //Calendar
                if(value == 3){
                    Column(
                        Modifier
                            .width(42.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.calendargreen), contentDescription = "", Modifier.size(32.dp).clickable (
                            onClick = {
                                val ints = Intent(context, CalendarActivity::class.java)
                                startActivity(context, ints, null)
                            }
                        ))
                        Text(text = "Calendar", fontSize = 11.sp, color = Color(96, 211, 148))
                    }
                }
                else {
                    Column(
                        Modifier
                            .width(38.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.calendar), contentDescription = "", Modifier.size(32.dp).clickable (
                            onClick = {
                                val ints = Intent(context, CalendarActivity::class.java)
                                startActivity(context, ints, null)
                            }
                        ))
                        Text(text = "List", fontSize = 11.sp, color = Color(238, 96, 85))
                    }
                }
                //Settings
                if (value == 4){
                    Column(
                        Modifier
                            .width(42.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.settingsgreen), contentDescription = "", Modifier.size(32.dp).clickable (
                            onClick = {
                                val ints = Intent(context, settingsActivity::class.java)
                                startActivity(context, ints, null)
                            }
                        ))
                        Text(text = "Settings", fontSize = 11.sp, color = Color(96, 211, 148))
                    }
                }
                else {
                    Column(
                        Modifier
                            .width(38.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.settings), contentDescription = "", Modifier.size(32.dp).clickable (
                            onClick = {
                                val ints = Intent(context, settingsActivity::class.java)
                                startActivity(context, ints, null)
                            }
                        ))
                        Text(text = "List", fontSize = 11.sp, color = Color(238, 96, 85))
                    }
                }
            }
        }
    }
}