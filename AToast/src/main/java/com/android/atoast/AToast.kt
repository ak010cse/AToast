package com.android.atoast

import android.content.Context
import android.widget.Toast

class AToast {
    companion object {
        fun showToast(context: Context, message: String){
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
        }
    }
}