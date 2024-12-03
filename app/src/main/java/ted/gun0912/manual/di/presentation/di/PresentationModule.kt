package ted.gun0912.manual.di.presentation.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import ted.gun0912.manual.di.presentation.MovieViewModel

val PresentationModule = module {
    viewModelOf(::MovieViewModel)
}
