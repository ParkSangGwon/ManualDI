package ted.gun0912.manual.di.domain

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMovieListUseCaseImpl @Inject constructor(
    private val movieRepository: MovieRepository
) : GetMovieListUseCase {
    override operator fun invoke(): Flow<DataResource<List<Movie>>> =
        movieRepository.getMovies()
}
