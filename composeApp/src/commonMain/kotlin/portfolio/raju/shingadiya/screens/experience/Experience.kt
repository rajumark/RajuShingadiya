package portfolio.raju.shingadiya.screens.experience

import org.jetbrains.compose.resources.DrawableResource
data class Experience(
    val companyName: String,
    val role: String,
    val duration: String,
    val location: String,
    val logoUrl: DrawableResource,
    val description: String,
    val workTags: List<String>
)