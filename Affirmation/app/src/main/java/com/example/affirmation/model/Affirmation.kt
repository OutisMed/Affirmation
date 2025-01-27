package com.example.affirmation.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Affirmation {
    data class Affirmation(
        @StringRes val stringResourceId: Int,
        @DrawableRes val imageResourceId: Int
    )
}