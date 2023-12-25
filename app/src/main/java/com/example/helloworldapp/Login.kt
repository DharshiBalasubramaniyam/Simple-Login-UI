package com.example.helloworldapp

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.White)
    ) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Image(
            painter = painterResource(id = R.drawable.login_main),
            contentDescription = "Login image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )
        Text(
            text = "Welcome Back!",
            fontSize = 25.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight(700),
            modifier = Modifier
                .padding(top = 15.dp, start = 0.dp, end = 0.dp, bottom = 5.dp)
                .fillMaxWidth()

        )
        Text(
            text = "Login to continue",
            fontSize = 14.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight(700),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 0.dp, start = 0.dp, end = 0.dp, bottom = 10.dp)
        )
        OutlinedTextField(
            value = username,
            onValueChange = { newUsername -> username = newUsername},
            placeholder = {
                Text(
                    text = "Username",
                    fontFamily = FontFamily.Monospace,
                    fontSize = 15.sp
                )
            },
            modifier = Modifier
                .padding(10.dp)
                .width(320.dp)
                .border(width = 2.dp, color = Color.Gray, shape = RoundedCornerShape(7.dp)),
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "username icon"
                    )
                }
            },
            shape = RoundedCornerShape(7.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Blue,
                unfocusedIndicatorColor = Color.Gray,
                focusedLeadingIconColor = Color.Blue,
                unfocusedLeadingIconColor = Color.Gray,
                containerColor = Color.White,
                cursorColor = Color.Blue
            ),
            textStyle = TextStyle(
                fontFamily = FontFamily.Monospace,
                fontSize = 15.sp,

            ),
//            maxLines = 2
//            readOnly = true
//            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
//                onNext =
            )
        )
        OutlinedTextField(
            value = password,
            onValueChange = { newPassword -> password = newPassword},
            placeholder = {
                Text(
                    text = "Password",
                    fontFamily = FontFamily.Monospace,
                    fontSize = 15.sp
                )
            },
            textStyle = TextStyle(
                fontFamily = FontFamily.Monospace,
                fontSize = 15.sp,
            ),
            shape = RoundedCornerShape(7.dp),
            modifier = Modifier
                .padding(10.dp)
                .width(320.dp)
                .border(width = 2.dp, color = Color.Gray, shape = RoundedCornerShape(7.dp)),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Blue,
                focusedLeadingIconColor = Color.Blue,
                unfocusedLeadingIconColor = Color.Gray,
                containerColor = Color.White,
                cursorColor = Color.Blue
            ),
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "password icon"
                    )
                }
            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
//                onDone =
            )
        )
        Text(
            text = "Forgot Password?",
            fontSize = 13.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.Blue,
            textAlign = TextAlign.Right,
            modifier = Modifier
                .width(320.dp)
        )
        Button(
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.Blue),
            modifier = Modifier
                .padding(top = 30.dp, start = 0.dp, end = 0.dp, bottom = 20.dp),
            onClick = {
            }
        ) {
            Text(
                text = "Login now",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Monospace,
                color = Color.White,
                modifier = Modifier
                    .width(280.dp)
                    .padding(5.dp)
            )
        }
        Text(
            text = "Or Login With",
            fontSize = 15.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(13.dp)
        )
        Row(
        ) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Google icon",
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(10.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "Google icon",
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(10.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.instagram),
                contentDescription = "Google icon",
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(10.dp)
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {
            Text(
                text = "New member?",
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                color = Color.Black,
                modifier = Modifier
                    .padding(top = 0.dp, start = 10.dp, end = 10.dp, bottom = 0.dp)
            )
            Text(
                text = "Register",
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                color = Color.Blue,
                modifier = Modifier
                    .padding(top = 0.dp, start = 10.dp, end = 10.dp, bottom = 0.dp)
            )
        }

    }
}