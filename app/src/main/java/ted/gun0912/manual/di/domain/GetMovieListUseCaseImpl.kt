package ted.gun0912.manual.di.domain

import kotlinx.coroutines.flow.Flow
import org.koin.core.annotation.Single

@Single
class GetMovieListUseCaseImpl(
    private val movieRepository: MovieRepository
) : GetMovieListUseCase {
    override operator fun invoke(): Flow<DataResource<List<Movie>>> =
        movieRepository.getMovies()
}
