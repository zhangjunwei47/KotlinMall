package com.myhappylife.usercenter.injection.component

import com.myhappylife.usercenter.injection.module.UserModule
import com.myhappylife.usercenter.ui.activity.RegisterActivity
import dagger.Component

/**
 * @author zhangchao on 2018/8/14.
 */

@Component(modules = arrayOf(UserModule::class))
interface UserComponent {
    fun inject(activity:RegisterActivity)
}