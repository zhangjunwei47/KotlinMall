package com.myhappylife.baselibrary.rx

import com.myhappylife.baselibrary.presenter.view.BaseView
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * @author zhangchao on 2018/7/25.
 */

open class BaseSubscriber<T>(val baseView:BaseView) : Observer<T> {
    override fun onComplete() {
        baseView.hideLoading()
    }

    override fun onSubscribe(d: Disposable) {
    }

    override fun onNext(t: T) {
    }

    override fun onError(e: Throwable) {
        baseView.hideLoading()
    }
}