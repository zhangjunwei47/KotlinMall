package com.myhappylife.usercenter.ui.activity.presenter.view

import com.myhappylife.baselibrary.ext.execute
import com.myhappylife.baselibrary.rx.BaseSubscriber
import com.myhappylife.provider.view.BasePresenter
import com.myhappylife.usercenter.service.impl.UserServiceImpl
import javax.inject.Inject

/**
 * @author zhangchao on 2018/7/23.
 */

class RegisterPresenter @Inject constructor() : BasePresenter<RegisterView>() {
    @Inject
    lateinit var userService: UserServiceImpl

    fun register(mobile: String, verifycode: String, pwd: String) {
        mView.showLoading()
        userService.regiser(mobile, verifycode, pwd)
                .execute(object : BaseSubscriber<Boolean>(mView) {
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })
    }
}
