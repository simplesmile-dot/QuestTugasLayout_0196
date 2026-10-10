package com.example.myapp4

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
            Spacer(Modifier.weight(1f))
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