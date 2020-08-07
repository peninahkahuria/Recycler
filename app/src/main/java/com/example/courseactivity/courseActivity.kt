package com.example.courseactivity

import CoursesRecyclerViewAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
data class Names(val Courses: String, val code: Int,val id:Int, val instructor:String,val description:String)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvCourses.layoutManager = LinearLayoutManager(baseContext)
        val CoursesAdapter = CoursesRecyclerViewAdapter(coursesList = listOf(
            Courses

        )
    }
}





