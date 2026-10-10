package com.example.myapp4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight

@Composable
fun StudentCard(student: Student, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_corner)),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(student.cardColor)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.card_padding)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CardLogo()

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = dimensionResource(R.dimen.card_padding)),
                verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.text_gap))
            ) {
                Text(
                    text = stringResource(student.name),
                    color = colorResource(R.color.text_white),
                    fontSize = spResource(R.dimen.text_size_name),
                    fontWeight = FontWeight.Bold,
                    fontFamily = student.nameFont
                )
                student.phone?.let { phone ->
                    Text(
                        text = stringResource(phone),
                        color = colorResource(R.color.text_cyan),
                        fontSize = spResource(R.dimen.text_size_detail)
                    )
                }
                Text(
                    text = stringResource(student.address),
                    color = colorResource(student.addressColor),
                    fontSize = spResource(R.dimen.text_size_detail)
                )
            }

            CardLogo()
        }
    }
}

@Composable
private fun CardLogo() {
    Image(
        painter = painterResource(R.drawable.logo_umy),
        contentDescription = stringResource(R.string.logo_description),
        modifier = Modifier.size(dimensionResource(R.dimen.logo_size))
    )
}