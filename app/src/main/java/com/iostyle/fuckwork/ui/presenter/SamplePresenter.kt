package com.iostyle.fuckwork.ui.presenter

import com.iostyle.fuckwork.base.BaseLifecyclePresenter
import com.iostyle.fuckwork.ui.view.ViewSample
import com.orhanobut.logger.Logger
import javax.inject.Inject

class SamplePresenter @Inject constructor(view: ViewSample) : BaseLifecyclePresenter<ViewSample>(view){
    fun test(){
        mView?.test()
    }
}
