package com.example.lab7_ph39815

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.sp

class baitap : ComponentActivity() {
    //remember :: từ khóa giúp lưu trữ trạng thái và giá trị của 1 tuần - biến này dùng để gắn vào compose
    //remembervalidle
    //navigation trong compose
    //ViewModel - Jetpack
    //MVM
    //intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //lưu giá trị và cập nhật trạng thái thay đổi của biến và 2 đối tượng
            //composeble
            //remember giúp lưu giá trị trong vòng đời của Activity


//            var count by remember { mutableIntStateOf(0) }

            //lưu giá trị nhiều hơn
            //xoay màn hình haowcj đổi ngôn ngữ của ứng dụng
            var count by rememberSaveable { mutableIntStateOf(0) }
            Button(onClick = { count++ }) {
                Text(text = "count $count", fontSize = 44.sp)
            }
        }
    }
}

