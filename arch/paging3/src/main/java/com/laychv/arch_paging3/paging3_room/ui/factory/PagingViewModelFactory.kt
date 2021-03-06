package com.laychv.arch_paging3.paging3_room.ui.factory

import com.laychv.arch_paging3.paging3_room.base.BaseViewModel
import com.laychv.arch_paging3.paging3_room.base.BaseViewModelFactory
import com.laychv.arch_paging3.paging3_room.data.repository.ArticleRepository
import com.laychv.arch_paging3.paging3_room.ui.viewmodel.PagingViewModel

class PagingViewModelFactory(private val repository: ArticleRepository) :
    BaseViewModelFactory(repository) {

    override fun onCreate(): BaseViewModel {
        return PagingViewModel(repository)
    }

}