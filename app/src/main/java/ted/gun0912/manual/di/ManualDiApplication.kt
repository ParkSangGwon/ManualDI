package ted.gun0912.manual.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ted.gun0912.manual.di.data.di.DataModule
import ted.gun0912.manual.di.domain.di.DomainModule
import ted.gun0912.manual.di.presentation.di.PresentationModule
import ted.gun0912.manual.di.remote.di.NetworkModule
import ted.gun0912.manual.di.remote.di.RemoteModule

class ManualDiApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ManualDiApplication)
            modules(
                RemoteModule,
                NetworkModule,
                DataModule,
                DomainModule,
                PresentationModule,
            )
        }

    }


}
