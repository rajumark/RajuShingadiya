package portfolio.raju.shingadiya.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import portfolio.raju.shingadiya.theme.ColorsConst
import portfolio.raju.shingadiya.theme.jetbrainFonts
import rajushingadiya.composeapp.generated.resources.Res
import rajushingadiya.composeapp.generated.resources.main_page_image_art

@Composable
fun HomePage() {
    Row (
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(Modifier.fillMaxHeight().weight(0.6f), contentAlignment = Alignment.Center) {
            Column {
                Text("RAJU", style = TextStyle(fontSize = 90.sp, fontWeight = FontWeight.Medium, fontFamily = jetbrainFonts()))
                Text("SHINGADIYA", style = TextStyle(fontSize = 90.sp, fontWeight = FontWeight.Medium, fontFamily = jetbrainFonts()))
                Spacer(Modifier.height(16.dp))
                MainTagLine("Android Developer","7.0 Years")
                Spacer(Modifier.height(8.dp))
                MainTagLine("Kotlin Multiplatform Developer","1.2 Years")
            }
        }
        Box(Modifier.fillMaxHeight().weight(0.4f), contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(Res.drawable.main_page_image_art),
                contentDescription = "Main image",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(50.dp)

            )
        }

    }
}
@Composable
fun MainTagLine(text:String,tagText:String){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(text, style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Normal, color = ColorsConst.color_black_42.copy(alpha = 0.8f), fontFamily = jetbrainFonts()))
        Spacer(Modifier.width(8.dp))
        Box(Modifier.border(width = 1.dp, color = ColorsConst.color_black_42, shape = RoundedCornerShape(50.dp)).background(color=ColorsConst.color_white_pure,
            RoundedCornerShape(50.dp)
        ) ){
            Text(modifier = Modifier.padding(vertical = 6.dp, horizontal = 8.dp),text=tagText, style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Medium, color = ColorsConst.color_black_42, fontFamily = jetbrainFonts()))
        }
    }
}