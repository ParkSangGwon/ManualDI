package ted.gun0912.manual.di.remote.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ted.gun0912.manual.di.remote.ApiService
import ted.gun0912.manual.di.remote.createApiService
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {

    @Provides
    @Singleton
    fun provideApiService(): ApiService = createApiService()

    /*
    @Provides
    @Singleton
    fun provideApiService(
        @ApplicationContext context: Context
    ): ApiService = FakeApiService(context)
    */
}
