package com.example.composeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeexample.ui.theme.ComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExampleTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    val focusManager = LocalFocusManager.current
    var textValue: String by remember { mutableStateOf("") }
    BasicTextField(
        value = textValue,
        onValueChange = { textValue = it },
        modifier = Modifier
            .clip(RoundedCornerShape(6.dp))
            .background(Color(0Xff2c2531))
            .fillMaxWidth()
            .padding(16.dp, 12.dp)
            .height(IntrinsicSize.Min),
        textStyle = TextStyle(
            color = Color.White,
            fontSize = 12.sp,
            lineHeight = 18.sp,
        ),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions(onDone = {
            focusManager.clearFocus()
        }),
        cursorBrush = SolidColor(Color.White),
        decorationBox = { innerTextField ->
            {

            }
        }
    )
}

@Preview
@Composable
fun PreviewFun() {
    Greeting()
}