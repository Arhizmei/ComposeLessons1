package com.zmei.composelessons1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import com.zmei.composelessons1.ui.theme.ComposeLessons1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Row(modifier = Modifier
                .background(Color.Gray).fillMaxWidth().fillMaxHeight(0.5f),
            horizontalArrangement = Arrangement.SpaceEvenly) {

            Column(
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.End){
                Text(text = "Hello world!")
                Text(text = "Second line")
                Text(text = "Third line") }
        Column(modifier = Modifier.background(Color.Green).fillMaxHeight(0.5f),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.End){
            Text(text = "Hello world!")
            Text(text = "Second line")
            Text(text = "Third line") }
        }}}


}
