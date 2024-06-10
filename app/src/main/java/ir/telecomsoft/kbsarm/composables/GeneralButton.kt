package ir.telecomsoft.kbsarm.composables

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GeneralButton(text: String) {
    ElevatedButton(
        onClick = {},
        Modifier
            .width(100.dp)
            .height(25.dp)
    ) {
        Text(text)
    }
}