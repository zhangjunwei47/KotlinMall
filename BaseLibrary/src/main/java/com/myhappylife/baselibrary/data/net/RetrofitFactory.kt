package com.myhappylife.baselibrary.data.net

/**
 * @author zhangchao on 2018/8/8.
 */

class RetrofitFactory private constructor(){
    companion object {
        val instance:RetrofitFactory by lazy { RetrofitFactory() }
    }


}