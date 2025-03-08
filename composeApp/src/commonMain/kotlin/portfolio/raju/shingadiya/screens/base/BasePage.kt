package portfolio.raju.shingadiya.screens.base

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import portfolio.raju.shingadiya.data.MainMenu
import portfolio.raju.shingadiya.data.MainMenuType
import portfolio.raju.shingadiya.data.listMainMenu
import portfolio.raju.shingadiya.screens.experience.ExperienceTimeline
import portfolio.raju.shingadiya.screens.home.HomePage
import portfolio.raju.shingadiya.theme.ColorsConst.color_black_42
import portfolio.raju.shingadiya.theme.ColorsConst.color_main_body
import portfolio.raju.shingadiya.theme.jetbrainFonts

@Composable
fun BasePage() {
    var selectedTabIndex by remember { mutableStateOf(0) }
    Column(Modifier.fillMaxSize().background(color=color_main_body)) {
        ScrollableTabRow(selectedTabIndex = selectedTabIndex, contentColor = color_black_42, backgroundColor = color_main_body) {
            listMainMenu.forEachIndexed { index, menuModel ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    text = { Text(menuModel.title, fontFamily = jetbrainFonts()) }
                )
            }
        }
        Column (Modifier.fillMaxWidth().weight(1f)){
           when(listMainMenu[selectedTabIndex].mainMenuType){
               MainMenuType.HOME -> HomePage()
               MainMenuType.EXPERIENCE -> ExperienceTimeline()
               else -> {

               }
           }
        }
    }
}