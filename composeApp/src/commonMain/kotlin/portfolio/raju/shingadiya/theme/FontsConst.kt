package portfolio.raju.shingadiya.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import rajushingadiya.composeapp.generated.resources.JetBrainsMono_Regular
import rajushingadiya.composeapp.generated.resources.Res

//object FontsConst {
//    val jetbrainFonts = FontFamily(
//        org.jetbrains.compose.resources.Font(resource = Res.font.JetBrainsMono_Regular, weight = FontWeight.Normal, style = FontStyle.Normal)
//
//    )
//}
@Composable
fun jetbrainFonts(): FontFamily {
    return FontFamily(
        org.jetbrains.compose.resources.Font(resource = Res.font.JetBrainsMono_Regular, weight = FontWeight.Normal, style = FontStyle.Normal),
    )
}