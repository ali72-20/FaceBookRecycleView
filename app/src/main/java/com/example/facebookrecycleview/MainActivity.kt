package com.example.facebookrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.facebookrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycleView()
    }
    lateinit var adapter: PostRecycleAdapter
    lateinit var posts : ArrayList<Posts>
    private fun initRecycleView(){
        createList()
        adapter = PostRecycleAdapter(posts)
        binding.rePost.adapter = adapter
    }
    private fun createList(){
        posts = ArrayList()
        for(i in 0..100 step 1){
            posts.add(Posts())
        }
    }
}