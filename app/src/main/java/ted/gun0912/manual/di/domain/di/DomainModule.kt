package ted.gun0912.manual.di.domain.di

import org.koin.dsl.module
import ted.gun0912.manual.di.domain.GetMovieListUseCase
import ted.gun0912.manual.di.domain.GetMovieListUseCaseImpl

val DomainModule = module {
    single<GetMovieListUseCase> { GetMovieListUseCaseImpl(get()) }
}
