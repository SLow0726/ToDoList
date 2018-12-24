package com.example.godsl.todolist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val todo = ToDoSomething(this)
        btn_1.setOnClickListener(){
            todo.input= et_input.text.toString()
            todo.record()
            Toast.makeText(this,"新增成功",Toast.LENGTH_SHORT).show()
            }
        btn_2.setOnClickListener(){
            Toast.makeText(this,"${todo.input}", Toast.LENGTH_SHORT).show()
        }


    }

}
