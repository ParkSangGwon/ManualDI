package ted.gun0912.manual.di

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ted.gun0912.manual.di.presentation.MovieViewModel
import ted.gun0912.manual.di.ui.MovieScreen
import ted.gun0912.manual.di.ui.theme.ManualDITheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ManualDITheme {
                MovieScreen(viewModel = viewModel)
            }
        }
    }
}
