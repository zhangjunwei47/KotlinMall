package com.myhappylife.provider.view

import com.myhappylife.baselibrary.presenter.view.BaseView

/**
 * @author zhangchao on 2018/7/23.
 */

open class BasePresenter<T:BaseView>{
    lateinit var mView:T
}