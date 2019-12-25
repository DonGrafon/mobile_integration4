package ru.gd.contact_book.di.modules

import ru.gd.contact_book.data.content_provider.ContentProviderRepository
import ru.gd.contact_book.data.content_provider.IContentProviderRepository
import toothpick.config.Module
import toothpick.ktp.binding.bind
import toothpick.ktp.binding.toClass

class ContentProviderModule : Module() {

    init {
        bind<IContentProviderRepository>().toClass<ContentProviderRepository>().singleton()
    }

}