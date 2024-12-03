package ted.gun0912.manual.di.remote.di

import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import ted.gun0912.manual.di.remote.ApiService
import ted.gun0912.manual.di.remote.createApiService

@Module
class NetworkModule {
    @Single
    fun provideApiService(): ApiService = createApiService()
}
