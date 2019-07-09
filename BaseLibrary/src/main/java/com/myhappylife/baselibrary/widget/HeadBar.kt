package com.myhappylife.baselibrary.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.myhappylife.baselibrary.R
import kotlinx.android.synthetic.main.layout_header_bar.view.*

/**
 * @author zhangchao on 2019-07-08.
 */

class HeadBar @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {
    private var isShow = false
    private var titleString: String? = null
    private var rightTile: String? = null

    init {
        var typeArray = context.obtainStyledAttributes(attrs, R.styleable.HeaderBar)

        isShow = typeArray.getBoolean(R.styleable.HeaderBar_isShowBack, true)
        titleString = typeArray.getString(R.styleable.HeaderBar_titleText)
        rightTile = typeArray.getString(R.styleable.HeaderBar_rightText)
        initView()
        typeArray.recycle()
    }

    fun initView() {
        View.inflate(context, R.layout.layout_header_bar, this)
        mLeftIv.visibility = if (isShow) View.VISIBLE else View.GONE
        titleString?.let {
            mTitleTv.text = it
        }

        rightTile?.let {
            mRightTv.text = it
            mRightTv.visibility = View.VISIBLE
        }
    }


}