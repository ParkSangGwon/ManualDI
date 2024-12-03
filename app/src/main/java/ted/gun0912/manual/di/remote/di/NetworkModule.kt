package ted.gun0912.manual.di.remote.di

import org.koin.dsl.module
import ted.gun0912.manual.di.remote.ApiService
import ted.gun0912.manual.di.remote.createApiService

val NetworkModule = module {
    single<ApiService> { createApiService() }
}
