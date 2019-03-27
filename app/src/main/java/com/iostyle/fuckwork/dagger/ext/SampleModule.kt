package com.iostyle.fuckwork.dagger.ext

import com.iostyle.fuckwork.ui.activity.SampleActivity
import com.iostyle.fuckwork.ui.view.ViewSample
import dagger.Binds
import dagger.Module

@Module
abstract class SampleModule {
    @Binds
    abstract fun bind(act: SampleActivity): ViewSample
}