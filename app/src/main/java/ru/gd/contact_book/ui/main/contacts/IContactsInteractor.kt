package ru.gd.contact_book.ui.main.contacts

import io.reactivex.Maybe
import io.reactivex.Observable
import ru.gd.contact_book.data.db.model.Contact

interface IContactsInteractor {

    fun getPhoneContacts(): Maybe<List<String>>

    fun observeDbContacts():Observable<List<Contact>>


}