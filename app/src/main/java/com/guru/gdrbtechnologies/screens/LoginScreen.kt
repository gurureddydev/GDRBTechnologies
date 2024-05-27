package com.guru.gdrbtechnologies.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.guru.gdrbtechnologies.viewmodel.LoginViewModel
import com.guru.gdrbtechnologies.R
import com.guru.gdrbtechnologies.data.LoginResponse
import com.guru.gdrbtechnologies.navigation.MainDestinations
import com.guru.gdrbtechnologies.navigation.Nav

@Composable
fun LoginScreen(viewModel: LoginViewModel, navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val logoPainter = painterResource(id = R.drawable.gdrb_logo) // Your logo resource
    val loginState: LoginResponse? by viewModel.loginState.collectAsState<LoginResponse?>()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = logoPainter,
            contentDescription = "Logo",
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 16.dp)
        )

        Text(text = "Log In", style = TextStyle(fontSize = 24.sp), color = Color.Black)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("User name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Check if loginState is not null
        val response = loginState
        if (response != null) {
            if (response.message == "Login success") {
                // Navigate to responsive screen if login is successful
                navController.navigate(MainDestinations.RESPONSIVE_ROUTE)
            } else {
                // Display error message for invalid credentials
                Text(
                    text = "Invalid credentials", color = Color.Red
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }


        TextButton(onClick = { /* Handle forgot password */ }) {
            Text(text = "Forgot Password?", color = Color.Gray)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                viewModel.login(email, password, "exzcde")
            }, modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(text = "Login", color = Color.White)
        }

        Spacer(modifier = Modifier.height(8.dp))

        ClickableText(
            text = androidx.compose.ui.text.AnnotatedString("New Visit? Sign up"),
            onClick = { /* Handle sign up */ },
            style = TextStyle(color = Color.Blue)
        )
    }
}

@Composable
fun MyApp(modifier: Modifier) {
    val navController = rememberNavController()
    Nav(navController = navController)
}