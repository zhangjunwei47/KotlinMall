package com.myhappylife.usercenter.service.impl

import com.myhappylife.usercenter.service.UserService
import io.reactivex.Observable

/**
 * @author zhangchao on 2018/7/25.
 */

class UserServiceImpl:UserService {
    override fun regiser(moblie: String, verifycode: String, pwd: String): Observable<Boolean>{
        return Observable.just(true)
    }
}