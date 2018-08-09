package com.myhappylife.baselibrary.ext

import com.myhappylife.baselibrary.rx.BaseSubscriber
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

/**
 * @author zhangchao on 2018/8/8.
 */

fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>) {
    this.observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)
}