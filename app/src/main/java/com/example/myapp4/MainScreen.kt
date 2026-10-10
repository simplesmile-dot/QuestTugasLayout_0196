package com.example.myapp4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

private val students = listOf(
    Student(
        name = R.string.name_bambang,
        phone = null,
        address = R.string.address_bambang,
        cardColor = R.color.card_gray,
        addressColor = R.color.text_yellow,
        nameFont = FontFamily.Cursive
    ),
    Student(
        name = R.string.name_gibran,
        phone = R.string.phone_gibran,
        address = R.string.address_gibran,
        cardColor = R.color.card_purple,
        addressColor = R.color.text_yellow
    ),
    Student(
        name = R.string.name_zhilal,
        phone = R.string.phone_zhilal,
        address = R.string.address_zhilal,
        cardColor = R.color.card_blue,
        addressColor = R.color.text_white
    ),
    Student(
        name = R.string.name_alfian,
        phone = R.string.phone_alfian,
        address = R.string.address_alfian,
        cardColor = R.color.card_green,
        addressColor = R.color.text_white
    )
)

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.screen_background))
            .padding(horizontal = dimensionResource(R.dimen.screen_padding)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(dimensionResource(R.dimen.header_top_padding)))

        Text(
            text = stringResource(R.string.title),
            color = colorResource(R.color.text_title),
            fontSize = spResource(R.dimen.text_size_title),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.subtitle),
            color = colorResource(R.color.text_title),
            fontSize = spResource(R.dimen.text_size_subtitle),
            fontWeight = FontWeight.SemiBold
        )

        Spacer(Modifier.height(dimensionResource(R.dimen.header_bottom_padding)))

        Column(
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_spacing))
        ) {
            students.forEach { StudentCard(student = it) }
        }

        Spacer(Modifier.weight(1f))

        Text(
            text = stringResource(R.string.copyright),
            color = colorResource(R.color.text_title),
            fontSize = spResource(R.dimen.text_size_footer),
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.footer_padding))
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_spacing))
        ) {
            students.forEach { StudentCard(student = it) }
        }
    }
}