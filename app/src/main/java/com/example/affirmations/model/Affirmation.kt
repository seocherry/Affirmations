package com.example.affirmations.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)