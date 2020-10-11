package com.example.android_study_google.a_viewbinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_study_google.databinding.ResultProfileBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ResultProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ResultProfileBinding.inflate(layoutInflater);
        setContentView(binding.root)
        binding.name.text="tmd我靠"
        binding.button.setOnClickListener {
            binding.name.text="修改了名称"
        }
        initView()
    }
    private var mViewAdpater: ViewBindingAdapter? = null

    private fun initView() {
        mViewAdpater =
            ViewBindingAdapter()
        binding.mainRv.adapter=mViewAdpater
        var linearLayout=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.mainRv.layoutManager=linearLayout
    }
}























