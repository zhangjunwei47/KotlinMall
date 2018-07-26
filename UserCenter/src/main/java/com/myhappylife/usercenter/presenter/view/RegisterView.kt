package com.myhappylife.usercenter.ui.activity.presenter.view

import com.myhappylife.baselibrary.presenter.view.BaseView

/**
 * @author zhangchao on 2018/7/23.
 */

interface RegisterView:BaseView{
    fun onRegisterResult(isOK:Boolean)
}