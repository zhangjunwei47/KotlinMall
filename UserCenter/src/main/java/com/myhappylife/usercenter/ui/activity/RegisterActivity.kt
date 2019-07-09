package com.myhappylife.usercenter.ui.activity

import android.os.Bundle
import android.widget.Toast
import com.myhappylife.baselibrary.ui.activity.BaseMvpActivity
import com.myhappylife.usercenter.R
import com.myhappylife.usercenter.injection.component.DaggerUserComponent
import com.myhappylife.usercenter.ui.activity.presenter.view.RegisterPresenter
import com.myhappylife.usercenter.ui.activity.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initInject()
        mRegisterBtn.setOnClickListener {
            mPresenter.register(mPhoneNumberEdit.text.toString(), mVerifyCodeEdit.text.toString(), mPassCodeEdit.text.toString())
        }
    }

    private fun initInject() {
        DaggerUserComponent.create().inject(this)
        mPresenter.mView = this
    }

    override fun onRegisterResult(isOK: Boolean) {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()
    }

}
