package hu.proha.tagger2.model

import android.graphics.Color


class Tag(val text: String) {
    var selected = false
    var backgroundColor: Color = kPrimaryColor
    var textColor: Color = kPrimaryTextColor

    fun getFocus() {
        selected = true
        backgroundColor = kSecondaryColor
        textColor = kSecondaryTextColor
    }

    fun lostFocus() {
        selected = false
        backgroundColor = kPrimaryColor
        textColor = kPrimaryTextColor
    }
}
