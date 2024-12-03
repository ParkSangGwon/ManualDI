package ted.gun0912.manual.di

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import ted.gun0912.manual.di.remote.di.NetworkModule

@Module(includes = [NetworkModule::class])
@ComponentScan
class AppModule
