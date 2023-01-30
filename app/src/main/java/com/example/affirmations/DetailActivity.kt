package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val textContent:String = intent.getStringExtra("exampleContent").toString()
        
        Log.i("exampleContent", textContent.toString())
        super.onCreate(savedInstanceState)
        setContent {
            TextMessage(resourceId = textContent)
        }
    }


}
@Composable
fun TextMessage(resourceId: String) {
    Text(text = resourceId)
    //Text(text = stringResource(id = resourceId))
}