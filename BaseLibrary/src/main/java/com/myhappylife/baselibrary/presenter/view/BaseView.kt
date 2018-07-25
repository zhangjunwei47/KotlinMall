package com.myhappylife.baselibrary.presenter.view

/**
 * @author zhangchao on 2018/7/23.
 */

open interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError()
}