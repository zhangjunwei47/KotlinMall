package com.myhappylife.usercenter.injection.module

import com.myhappylife.usercenter.service.UserService
import com.myhappylife.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * @author zhangchao on 2018/8/14.
 */

@Module
class UserModule {

    @Provides
    fun providesUserService(service: UserServiceImpl): UserService {
        return service
    }
}