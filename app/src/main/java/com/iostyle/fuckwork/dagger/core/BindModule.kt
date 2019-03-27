package com.iostyle.fuckwork.dagger.core

import com.iostyle.fuckwork.dagger.ext.SampleModule
import com.iostyle.fuckwork.ui.activity.SampleActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BindModule {
    @ContributesAndroidInjector(modules = [SampleModule::class])
    abstract fun SampleActivity(): SampleActivity

}