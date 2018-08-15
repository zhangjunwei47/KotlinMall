package com.myhappylife.usercenter.service.impl

import com.myhappylife.baselibrary.data.protocol.BaseResp
import com.myhappylife.baselibrary.rx.BaseException
import com.myhappylife.usercenter.data.repository.UserRepository
import com.myhappylife.usercenter.service.UserService
import io.reactivex.Observable
import io.reactivex.functions.Function
import javax.inject.Inject

/**
 * @author zhangchao on 2018/7/25.
 */

class UserServiceImpl @Inject constructor(): UserService {

    @Inject
    lateinit var repository:UserRepository

    override fun login(moblie: String, password: String): Observable<Boolean> {
        return Observable.just(true)
    }

    override fun regiser(moblie: String, verifycode: String, pwd: String): Observable<Boolean> {

        return repository.register(moblie, verifycode, pwd).flatMap(object : Function<BaseResp<String>, Observable<Boolean>> {
            override fun apply(t: BaseResp<String>): Observable<Boolean> {
                if (t.status != 0) {
                    return Observable.error(BaseException(t.status, t.message))
                }
                return Observable.just(true)
            }
        }
        )
    }

}