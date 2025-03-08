package portfolio.raju.shingadiya.data

import androidx.compose.runtime.Composable
import portfolio.raju.shingadiya.screens.experience.ExperienceTimeline
import portfolio.raju.shingadiya.screens.home.HomePage

enum class MainMenuType{
    HOME,
    EXPERIENCE
}
data class MainMenu(
    val title:String,
    val mainMenuType: MainMenuType
)
val listMainMenu = listOf(MainMenu(
    "Home",
    MainMenuType.HOME
),MainMenu(
    "Experience",
    MainMenuType.EXPERIENCE
))