package com.example.androidcourse_7_artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcourse_7_artspaceapp.ui.theme.AndroidCourse_7_ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}

@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(Color.Red)
            .fillMaxSize()) {
        Artwork(modifier.padding(top = 40.dp))
        Spacer(modifier.size(40.dp))
        TitleCard(modifier)
        Spacer(modifier.size(40.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = modifier
                .fillMaxWidth()
                .padding(40.dp)
        ) {
            ActionButton("Previous")
            ActionButton("Next")
        }
    }
}

@Composable
fun Artwork(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth(0.8F)
            .fillMaxHeight(0.6F)
            .background(Color.Yellow)
    ) {}
}

@Composable
fun TitleCard(modifier: Modifier = Modifier) {
    Box(
        modifier
            .background(Color.Yellow)
            .fillMaxWidth(0.8F)
            .fillMaxWidth(0.4F)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Artwork Title",
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
        )
        Text(
            text = "Artist's Name (Year)"
        )
        }
    }
}

@Composable
fun ActionButton(name: String, modifier: Modifier = Modifier) {
    Button(
        onClick = {},
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        modifier = modifier
            .background(Color.Yellow)
            .fillMaxWidth(0.5F)
    ) {
        Text(
            text = name,
            color = Color.Black,
            modifier = modifier.background(Color.Transparent)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidCourse_7_ArtSpaceAppTheme {
        ArtSpaceApp()
    }
}