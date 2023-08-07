package com.github.marcelobenedito.beer_menu.data.mappers

import com.github.marcelobenedito.beer_menu.data.local.BeerEntity
import com.github.marcelobenedito.beer_menu.data.remote.BeerDto
import com.github.marcelobenedito.beer_menu.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}