package com.iostyle.fuckwork.dagger.core

import com.iostyle.fuckwork.application.App

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [BindModule::class, AndroidSupportInjectionModule::class, AndroidInjectionModule::class])
interface AppComponent : AndroidInjector<App>
