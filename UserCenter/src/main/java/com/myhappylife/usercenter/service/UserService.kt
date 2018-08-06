package com.myhappylife.usercenter.service

import io.reactivex.Observable


/**
 * @author zhangchao on 2018/7/25.
 */

interface UserService {
    fun regiser(moblie:String, verifycode:String, pwd:String):Observable<Boolean>
    fun login(moblie: String, password:String):Observable<Boolean>
}