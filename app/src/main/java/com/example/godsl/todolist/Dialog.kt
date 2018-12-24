package com.example.godsl.todolist

val msg = "你好世界"
AlertDialog.Builder(holder.itemView.context)
.setMessage(msg)
.setTitle(item.name)
.setPositiveButton("复制", DialogInterface.OnClickListener { dialogInterface, i ->
    copyText(holder.itemView.context, item.value)
    Toast.makeText(holder.itemView.context, "复制成功", Toast.LENGTH_SHORT).show()
})
.setNeutralButton("取消", null)
.create()
.show()
