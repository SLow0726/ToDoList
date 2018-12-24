package com.example.godsl.todolist

import android.content.Context
import android.content.SharedPreferences

class ToDoSomething {

    var context: Context
    var input = ""
    var times2 = 0
    var B = 500
    var sharedPreferences: SharedPreferences
    var editor: SharedPreferences.Editor

    constructor(context: Context) {
        this.context = context
        sharedPreferences = context.getSharedPreferences("name", Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()
       // B = sharedPreferences.getInt("output", 500)
        input = sharedPreferences.getString("input", "")
        //times2 = sharedPreferences.getInt("playtime2", 0)
    }
    fun record(){
        //editor.putInt("output",B)
        editor.putString("input",input)
       // editor.putInt("playtime2",times2)
        editor.commit()
    }
    fun output(){
        //val output = sharedPreferences.getInt("output",500)
        val input = sharedPreferences.getString("input","")
       // val playtime2 = sharedPreferences.getInt("playtime2",0)
        //Log.i("******get test", "$output")
    }
}