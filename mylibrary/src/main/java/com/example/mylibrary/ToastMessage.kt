package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class ToastMessage {
    companion object {
        fun s(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}