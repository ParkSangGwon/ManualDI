package ted.gun0912.manual.di.remote

import ted.gun0912.manual.di.data.MovieEntity
import ted.gun0912.manual.di.data.MovieRemoteDataSource

class MovieRemoteDataSourceImpl(
    private val apiService: ApiService
) : MovieRemoteDataSource {

    override suspend fun getMovies(): List<MovieEntity> {
        return apiService.getMovies().summaryMovies.map { it.toData() }
    }
}
