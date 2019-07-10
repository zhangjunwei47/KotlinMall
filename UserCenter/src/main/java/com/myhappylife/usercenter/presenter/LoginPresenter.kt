package com.myhappylife.usercenter.presenter

import com.myhappylife.baselibrary.rx.BaseSubscriber
import com.myhappylife.provider.view.BasePresenter
import com.myhappylife.usercenter.presenter.view.LoginView
import com.myhappylife.usercenter.service.impl.UserServiceImpl
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author zhangchao on 2018/8/6.
 */

class LoginPresenter : BasePresenter<LoginView>() {
    fun login(moblie: String, password: String) {
        var loginService = UserServiceImpl()
        loginService.login(moblie, password).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())
                .subscribe(object : BaseSubscriber<Boolean>(mView) {
                    override fun onNext(t: Boolean) {
                        super.onNext(t)
                        mView.loginResult(t)
                    }
                })

    }
}