package ted.gun0912.manual.di.remote.di

import org.koin.dsl.module
import ted.gun0912.manual.di.data.MovieRemoteDataSource
import ted.gun0912.manual.di.remote.MovieRemoteDataSourceImpl

val RemoteModule = module {
    single<MovieRemoteDataSource> { MovieRemoteDataSourceImpl(get()) }
}
