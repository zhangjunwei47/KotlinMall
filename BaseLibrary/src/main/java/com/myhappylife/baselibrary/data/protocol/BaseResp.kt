package com.myhappylife.baselibrary.data.protocol

/**
 * @author zhangchao on 2018/8/11.
 */

class BaseResp<out T>(var status:Int, val message:String, val data:T){
}