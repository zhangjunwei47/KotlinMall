package com.myhappylife.usercenter.data.repository

import com.myhappylife.baselibrary.data.net.RetrofitFactory
import com.myhappylife.baselibrary.data.protocol.BaseResp
import com.myhappylife.usercenter.data.api.UserApi
import com.myhappylife.usercenter.data.protocol.RegisterReq
import io.reactivex.Observable

/**
 * @author zhangchao on 2018/8/11.
 */

class UserRepository {
    fun register(mobile: String, pwd: String, verifyCode: String): Observable<BaseResp<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java)
                .register(RegisterReq(mobile, pwd, verifyCode))
    }
}