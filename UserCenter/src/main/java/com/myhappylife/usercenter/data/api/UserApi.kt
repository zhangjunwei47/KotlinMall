package com.myhappylife.usercenter.data.api

import com.myhappylife.baselibrary.data.protocol.BaseResp
import com.myhappylife.usercenter.data.protocol.RegisterReq
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * @author zhangchao on 2018/8/11.
 */

interface UserApi {

    @POST("userCenter/register")
    fun register(@Body req:RegisterReq):Observable<BaseResp<String>>
}