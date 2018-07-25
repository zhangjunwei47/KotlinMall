package com.myhappylife.baselibrary.ui.activity

import com.myhappylife.baselibrary.presenter.view.BaseView
import com.myhappylife.provider.view.BasePresenter

/**
 * @author zhangchao on 2018/7/23.
 */

open class BaseMvpActivity<T:BasePresenter<*>>:BaseActivity(), BaseView{
    override fun hideLoading() {
        TODO("not implemented")
    }

    override fun onError() {
        TODO("not implemented")
    }

    override fun showLoading() {
        TODO("not implemented")
    }

    lateinit var mPresenter:T
}