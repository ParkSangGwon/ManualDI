package ted.gun0912.manual.di.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import ted.gun0912.manual.di.domain.DataResource
import ted.gun0912.manual.di.domain.GetMovieListUseCase
import ted.gun0912.manual.di.ui.model.toPresentation
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val getMovieListUseCase: GetMovieListUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(MovieUiState.DEFAULT)
    val uiState = _uiState.asStateFlow()

    init {
        fetchMovies()
    }
    
    private fun fetchMovies() {
        viewModelScope.launch {
            getMovieListUseCase()
                .onCompletion {
                    _uiState.update { it.copy(isLoading = false) }
                }
                .collect({ dataResource ->
                    when (dataResource) {
                        is DataResource.Success ->
                            _uiState.update { uiState ->
                                uiState.copy(movies = dataResource.data.map { it.toPresentation() })
                            }

                        is DataResource.Error -> _uiState.update { it.copy(error = dataResource.throwable) }
                        is DataResource.Loading -> _uiState.update { it.copy(isLoading = true) }
                    }
                })
        }
    }

}
