import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.jetbrains.kmpapp.App
import com.jetbrains.kmpapp.di.initKoin

fun main() {
    initKoin()
    application {
        Window(onCloseRequest = ::exitApplication) {
            App()
        }
    }
}