package com.myhappylife.baselibrary.data.net

import com.myhappylife.baselibrary.common.BaseConstant
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author zhangchao on 2018/8/8.
 */

class RetrofitFactory private constructor() {
    companion object {
        val instance: RetrofitFactory by lazy { RetrofitFactory() }
    }

    private val retrofit: Retrofit
    //拦截器
    private val interceptor:Interceptor


    init {
        //创建okhttp header 拦截器
        interceptor = Interceptor {
            chain ->

                var request =  chain.request()
                        .newBuilder()
                        .addHeader("Content-Type", "application/json")
                        .addHeader("charset", "utf-8")
                        .build()
                chain.proceed(request)


        }
        /**
         * 创建 retrofit 对象
         */
        retrofit = Retrofit.Builder()
                .baseUrl(BaseConstant.SERVICE_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(initClint())
                .build()
    }

    /**
     * 创建okhttpclient
     */
    private fun initClint(): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .addInterceptor(logInterceptor())
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build()
    }

    /**
     * 创建一个 log 拦截器
     */
    private fun logInterceptor(): Interceptor {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return loggingInterceptor

    }

    fun <T> create(service: Class<T>): T {
        return retrofit.create(service)
    }
}