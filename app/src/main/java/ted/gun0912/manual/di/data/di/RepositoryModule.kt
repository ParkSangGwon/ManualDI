package ted.gun0912.manual.di.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ted.gun0912.manual.di.data.MovieRepositoryImpl
import ted.gun0912.manual.di.domain.MovieRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMovieRepository(repo: MovieRepositoryImpl): MovieRepository

}
