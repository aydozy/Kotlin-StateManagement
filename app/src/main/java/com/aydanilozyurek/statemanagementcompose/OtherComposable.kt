package com.aydanilozyurek.statemanagementcompose

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtherScreen() {
    Surface(color = Color.Gray) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            var myString = remember { mutableStateOf("Android Compose") }

            TextField(value = myString.value, onValueChange = {
                myString.value = it
                println(myString.value)
            })

            Spacer(modifier = Modifier.padding(7.dp))

            var testString = remember {
                mutableStateOf("hola")
            }

            Text(text = testString.value,
                fontSize = 26.sp
            )

            Spacer(modifier = Modifier.padding(7.dp))

            Button(onClick = {
                testString.value = "Android"

            }) {
                Text(text = "Button")
                Text(text = "Test")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.ppg), contentDescription = null)


            Spacer(modifier = Modifier.padding(7.dp))

            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)

            Spacer(modifier = Modifier.padding(7.dp))

            // Image(painter = ColorPainter(Color.Black), contentDescription = null)
        }
    }


}