package ru.gd.contact_book.ui

import android.app.Application
import ru.gd.contact_book.di.DI
import ru.gd.contact_book.di.modules.AppModule
import ru.gd.contact_book.di.modules.ContentProviderModule
import ru.gd.contact_book.di.modules.DatabaseModule
import ru.gd.contact_book.di.modules.NavigationModule
import toothpick.Toothpick

class ContactsApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initDi()
    }

    private fun initDi() {
        val scope = Toothpick.openScope(DI.APP)
        scope.installModules(
            AppModule(this),
            DatabaseModule(),
            NavigationModule(),
            ContentProviderModule()
        )
        Toothpick.inject(this, scope)
    }
}