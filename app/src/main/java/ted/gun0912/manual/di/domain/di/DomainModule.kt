package ted.gun0912.manual.di.domain.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ted.gun0912.manual.di.domain.GetMovieListUseCase
import ted.gun0912.manual.di.domain.GetMovieListUseCaseImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DomainModule {

    @Binds
    @Singleton
    abstract fun bindGetMovieListUseCase(useCase: GetMovieListUseCaseImpl): GetMovieListUseCase

}
