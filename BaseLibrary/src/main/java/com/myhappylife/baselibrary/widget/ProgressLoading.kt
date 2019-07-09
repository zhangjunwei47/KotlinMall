package com.myhappylife.baselibrary.widget

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.view.Gravity
import android.widget.ImageView
import com.myhappylife.baselibrary.R
import org.jetbrains.anko.find

/**
 * @author zhangchao on 2019-07-09.
 */

class ProgressLoading(context: Context, theme: Int) : Dialog(context, theme) {
    companion object {
        private lateinit var mDialog: ProgressLoading
        private var animDrawable: AnimationDrawable? = null

        fun create(context: Context) {
            mDialog = ProgressLoading(context, R.style.LightProgressDialog)
            mDialog.setContentView(R.layout.progress_dialog)
            mDialog.setCancelable(true)
            mDialog.setCanceledOnTouchOutside(false)
            mDialog.window.attributes.gravity = Gravity.CENTER

            var lp = mDialog.window.attributes
            lp.dimAmount = 0.2f
            mDialog.window.attributes = lp

            var anim = mDialog.find<ImageView>(R.id.iv_loading)
            animDrawable = anim.background as AnimationDrawable

        }
    }

    fun showLoading() {
        super.show()
        animDrawable?.start()
    }

    fun hideLoading() {
        super.hide()
        animDrawable?.stop()
    }
}