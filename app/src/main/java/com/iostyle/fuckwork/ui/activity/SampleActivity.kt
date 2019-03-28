package com.iostyle.fuckwork.ui.activity

import com.iostyle.fuckwork.R
import com.iostyle.fuckwork.base.BaseActivity
import com.iostyle.fuckwork.ui.presenter.SamplePresenter
import com.iostyle.fuckwork.ui.view.ViewSample
import com.orhanobut.logger.Logger
import javax.inject.Inject

class SampleActivity : BaseActivity(), ViewSample {

    @Inject
    @JvmField
    var mPresenter: SamplePresenter? = null

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun init() {
        mPresenter?.test()
    }

    override fun test() {
        Logger.e("presenter is injected")
    }
}