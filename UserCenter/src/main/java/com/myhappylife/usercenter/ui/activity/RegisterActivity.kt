package com.myhappylife.usercenter.ui.activity

import android.os.Bundle
import android.widget.Toast
import com.myhappylife.baselibrary.ui.activity.BaseMvpActivity
import com.myhappylife.usercenter.R
import com.myhappylife.usercenter.ui.activity.presenter.view.RegisterPresenter
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseMvpActivity<RegisterPresenter>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mText.setOnClickListener{
            Toast.makeText(this, "hahahaha", Toast.LENGTH_LONG).show()
        }
    }
}
