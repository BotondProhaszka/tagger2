package hu.proha.tagger2.model

class TagHolder {
    var tags: MutableList<Tag> = mutableListOf()
    var selectedTag: Tag? = null

    fun removeTag(tag: Tag) {
        tags.remove(tag)
    }

    fun addTag(tag: Tag) {
        tags.add(tag)
    }

    fun changeSelected(newSelected: Tag) {
        selectedTag?.lostFocus()
        newSelected.getFocus()
        selectedTag = newSelected
    }

    fun deselectSelected() {
        selectedTag?.lostFocus()
        selectedTag = null
    }
}
