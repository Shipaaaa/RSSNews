package ru.shipa.rssnews.ui.activity.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import ru.shipa.rssnews.R
import ru.shipa.rssnews.presentation.presenter.main.MainPresenter
import ru.shipa.rssnews.presentation.view.main.MainView
import ru.shipa.rssnews.ui.activity.BaseActivity

class MainActivity : BaseActivity(), MainView {
    companion object {
        const val TAG = "MainActivity"
        fun getIntent(context: Context): Intent = Intent(context, MainActivity::class.java)
    }

    @InjectPresenter
    lateinit var mMainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
