package ted.gun0912.manual.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ManualDiApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}
