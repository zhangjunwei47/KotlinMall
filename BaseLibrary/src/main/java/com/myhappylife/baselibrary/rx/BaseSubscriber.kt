package com.myhappylife.baselibrary.rx

import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * @author zhangchao on 2018/7/25.
 */

open class BaseSubscriber<T> : Observer<T> {
    override fun onComplete() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSubscribe(d: Disposable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onNext(t: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(e: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}