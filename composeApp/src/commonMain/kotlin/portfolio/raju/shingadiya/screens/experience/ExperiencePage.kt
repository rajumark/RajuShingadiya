package portfolio.raju.shingadiya.screens.experience

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import portfolio.raju.shingadiya.data.DataExperience
import rajushingadiya.composeapp.generated.resources.*

@Composable
fun ExperienceTimeline() {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(DataExperience.experiences.size) { index ->
            ExperienceItem(DataExperience.experiences[index])
        }
    }
}

@Composable
fun ExperienceItem(experience: Experience) {
        Row(modifier = Modifier.padding(vertical = 8.dp)) {
            Image(
                painter = painterResource(experience.logoUrl),
                contentDescription = "${experience.companyName} Logo",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = experience.role, style = MaterialTheme.typography.h6)
                Text(text = experience.companyName, style = MaterialTheme.typography.body1)
                Text(text = experience.duration, style = MaterialTheme.typography.body2)
                Text(text = experience.location, style = MaterialTheme.typography.caption)
            }
        }

}


