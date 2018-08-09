package com.myhappylife.usercenter.ui.activity.presenter.view

import com.myhappylife.baselibrary.ext.execute
import com.myhappylife.baselibrary.rx.BaseSubscriber
import com.myhappylife.provider.view.BasePresenter
import com.myhappylife.usercenter.service.impl.UserServiceImpl

/**
 * @author zhangchao on 2018/7/23.
 */

 class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifycode: String, pwd: String) {
        var userService = UserServiceImpl()
        userService.regiser(mobile, verifycode, pwd)
                .execute(object :BaseSubscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })
    }
}
