package com.myhappylife.baselibrary.ui.activity

import com.myhappylife.baselibrary.presenter.view.BaseView
import com.myhappylife.provider.view.BasePresenter
import javax.inject.Inject

/**
 * @author zhangchao on 2018/7/23.
 */

open class BaseMvpActivity<T:BasePresenter<*>>:BaseActivity(), BaseView{
    override fun hideLoading() {
    }

    override fun onError() {
    }

    override fun showLoading() {
    }

    @Inject
    lateinit var mPresenter:T
}