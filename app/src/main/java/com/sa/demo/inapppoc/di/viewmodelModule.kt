package com.sa.demo.inapppoc.di

import com.sa.demo.inapppoc.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Purpose -
 *
 * @author Alpesh Rathod
 *
 * Created on 11/2/21
 */

val viewmodelModule = module {
    viewModel {
        MainViewModel()
    }
}