package ru.gd.contact_book.ui.main.detail

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import ru.gd.contact_book.data.db.model.Contact

interface ContactDetailView : MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun setContact(contact: Contact)

}