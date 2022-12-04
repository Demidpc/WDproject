package com.example.wdproject

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.volley.Request
import com.android.volley.toolbox.HttpResponse
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.wdproject.data.CoverData
import com.example.wdproject.screens.LoadCard
import com.example.wdproject.screens.Register
import com.example.wdproject.screens.SignIn
import com.example.wdproject.ui.theme.WDprojectTheme
import org.json.JSONObject

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WDprojectTheme {
                GetData(this, "cover")
                LoadCard()
            }
        }
    }
    override fun onStart() {
        super.onStart()
        setContent {
            WDprojectTheme {
                GetData(this, "trend")

//                Register()
                SignIn() //хз блин(
            }
        }
    }
}

fun GetData(context: Context, detail: String){
    val url = "https://6376c41981a568fc2505bab4.mockapi.io/" +
            "$detail"
    val queue = Volley.newRequestQueue(context)

    val sRequest = StringRequest(
        Request.Method.GET,
        url,
        { response ->
            Log.d("TestLog", response)
        },
        {   error ->
            Log.d("TestLog", error.toString())
        }
    )
    queue.add(sRequest)
}

