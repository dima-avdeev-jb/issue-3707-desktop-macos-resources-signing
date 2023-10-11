import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import java.io.File

val resourcesDir = File(System.getProperty("compose.application.resources.dir"))

@Composable
@Preview
fun App() {
    Text(resourcesDir.resolve("platform_specific_resource.txt").readText())
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
