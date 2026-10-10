package com.example.myapp4

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
    }
}