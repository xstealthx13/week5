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

class Main4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            soal2()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun soal2(){
    Column (){
        var nama by remember { mutableStateOf("") }
        var expense by remember { mutableStateOf("") }
        Text("expenses",
            fontSize = 14.sp,
            fontFamily = FontFamily(Font(R.font.adlam_display))
        )
        Text("total expense: Rp ",
            fontSize = 11.sp,
            fontFamily = FontFamily(Font(R.font.adlam_display))
        )
        OutlinedTextField(
            value = nama,
            onValueChange = { if (it.all { char -> char.isDigit() }) nama = it },
            label = {
                Text(
                    "expense name",
                    fontSize = 11.sp,
                    fontFamily = FontFamily(Font(R.font.adlam_display))
                )
            }
        )
        Row {
        OutlinedTextField(
            value = expense,
            onValueChange = { if (it.all { char -> char.isDigit() }) expense = it },
            label = {
                Text(
                    "amount",
                    fontSize = 11.sp,
                    fontFamily = FontFamily(Font(R.font.adlam_display))
                )
            }
        )
            @Composable
            fun FilledButtonExample(onClick: () -> Unit) {
                Button(onClick = { onClick() },
                    enabled = false) {
                    Text("+",
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.adlam_display))
                    )
                }
            }
        }
        Box(Modifier.background(color = Color.Magenta)){
            Text("name: ${nama}",
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.adlam_display))
            )
            Row {
                Text("Rp ${expense}",
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.adlam_display))
                )
                @Composable
                fun FilledButtonExample(onClick: () -> Unit) {
                    Button(onClick = { onClick() },
                        enabled = true) {
                        Image(painter = painterResource(id = R.drawable.baseline_delete_24),
                            contentDescription = "")
                    }
                }
            }
        }
    }
}
