package com.myhappylife.usercenter.data.protocol

/**
 * @author zhangchao on 2018/8/11.
 */

data class RegisterReq(val mobile: String, val pwd: String, val verifyCode: String) {
}