package hu.proha.tagger2.model

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class DBService {
    private val databaseReference: DatabaseReference = FirebaseDatabase.getInstance().reference

    fun updateTagList(tags: List<Tag>, imageId: String) {
        databaseReference.child("pictures").child(imageId).setValue(tags.toString())
    }
}
