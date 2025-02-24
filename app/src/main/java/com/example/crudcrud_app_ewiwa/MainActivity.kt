package com.example.crudcrud_app_ewiwa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.crudcrud_app_ewiwa.ui.theme.CrudCrud_App_EwiwaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CrudCrud_App_EwiwaTheme {
                ColumnExample()
            }
        }
    }
}

@Composable
fun ColumnExample() {
    var input by remember { mutableStateOf("") }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Box(modifier = Modifier.padding(16.dp))
        {
            Button(onClick = { }, modifier = Modifier.size(200.dp, 60.dp))
            {
                Text("GET", style = TextStyle(fontSize = 20.sp))
            }
        }
        Box(modifier = Modifier.padding(16.dp))
        {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center)
            {
                TextField(
                    modifier = Modifier.padding(16.dp),
                    value = input,
                    label = {Text("Aggiungi")},
                    onValueChange = {input = it}
                )
                Button(onClick = { }, modifier = Modifier.size(200.dp, 60.dp))
                {
                    Text("POST", style = TextStyle(fontSize = 20.sp))
                }

            }
        }
        Box(modifier = Modifier.padding(16.dp))
        {
            Column {
                Button(onClick = { },
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                        .size(200.dp, 60.dp)
                    )
                {
                    Text("PUT", style = TextStyle(fontSize = 20.sp))
                }
                Button(onClick = { },
                    modifier = Modifier.size(200.dp, 60.dp))
                {
                    Text("DELETE", style = TextStyle(fontSize = 20.sp))
                }

            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CrudCrud_App_EwiwaTheme {
        ColumnExample()
    }
}