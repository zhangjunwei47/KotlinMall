package com.myhappylife.usercenter.ui.activity

import android.os.Bundle
import android.widget.Toast
import com.myhappylife.baselibrary.ui.activity.BaseMvpActivity
import com.myhappylife.usercenter.R
import com.myhappylife.usercenter.presenter.LoginPresenter
import com.myhappylife.usercenter.presenter.view.LoginView
import com.myhappylife.usercenter.ui.activity.presenter.view.RegisterPresenter
import com.myhappylife.usercenter.ui.activity.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*

class LoginActivity : BaseMvpActivity<LoginPresenter>(), LoginView {
    override fun loginResult(t: Boolean) {

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mPresenter = LoginPresenter()
        mPresenter.mView = this
        mRegisterBtn.setOnClickListener {  mPresenter.login(mPhoneNumberEdit.text.toString(), mPassCodeEdit.text.toString()) }
    }


}
