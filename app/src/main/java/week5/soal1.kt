package week5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text2.input.TextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.TextField
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import com.example.week5.R

class Main : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            soal1()
        }
    }
}

@Preview
@Composable
fun soal1() {
    var kata by remember { mutableStateOf("") }
    var guess by remember { mutableStateOf("") }
    Column {
        Spacer(modifier = Modifier.weight(1f))
        Text(
            "whats the word",
            fontSize = 17.sp,
            fontFamily = FontFamily(Font(R.font.adlam_display))
        )
        Box(Modifier.background(color = Color.Cyan)) {
            Box(Modifier.background(color = Color.Blue)) {
                Text(
                    "number of guesses: ${guess}",
                    fontSize = 13.sp,
                    color = Color.White,
                    fontFamily = FontFamily(Font(R.font.adlam_display))
                )
            }
            Text(
                "",
                fontSize = 19.sp,
                fontFamily = FontFamily(Font(R.font.adlam_display))
            )
            Text(
                "from a to z create the word",
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.adlam_display))
            )
            Text(
                "score: ",
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.adlam_display))
            )
            OutlinedTextField(
                value = kata,
                onValueChange = { if (it.all { char -> char.isDigit() }) kata = it },
                label = {
                    Text(
                        "enter text",
                        fontSize = 11.sp,
                        fontFamily = FontFamily(Font(R.font.adlam_display))
                    )
                }
            )
        }
        Box(Modifier.background(color = Color.Blue)) {
            Text(
                "submit",
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.adlam_display))
            )
        }
    }
}