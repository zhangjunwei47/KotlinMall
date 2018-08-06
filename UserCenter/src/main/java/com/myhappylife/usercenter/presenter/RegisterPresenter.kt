package com.myhappylife.usercenter.ui.activity.presenter.view

import android.util.Log
import com.myhappylife.baselibrary.rx.BaseSubscriber
import com.myhappylife.provider.view.BasePresenter
import com.myhappylife.usercenter.service.impl.UserServiceImpl
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author zhangchao on 2018/7/23.
 */

 class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifycode: String, pwd: String) {
        var userService = UserServiceImpl()
        userService.regiser(mobile, verifycode, pwd).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : BaseSubscriber<Boolean>() {
                    override fun onNext(t: Boolean) {
                        super.onNext(t)
                        mView.onRegisterResult(true)
                    }
                })
    }
}
