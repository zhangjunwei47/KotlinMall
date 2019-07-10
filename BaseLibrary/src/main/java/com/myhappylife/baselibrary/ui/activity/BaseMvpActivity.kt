package com.myhappylife.baselibrary.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import com.myhappylife.baselibrary.presenter.view.BaseView
import com.myhappylife.baselibrary.widget.ProgressLoading
import com.myhappylife.provider.view.BasePresenter
import javax.inject.Inject

/**
 * @author zhangchao on 2018/7/23.
 */

open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

    lateinit var mLoadingDialog: ProgressLoading

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mLoadingDialog = ProgressLoading.create(this)
    }

    override fun hideLoading() {
        mLoadingDialog.hideLoading()
    }

    override fun onError() {
    }

    override fun showLoading() {
        mLoadingDialog.showLoading()
    }

    @Inject
    lateinit var mPresenter: T
}