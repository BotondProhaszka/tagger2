package hu.proha.tagger2.services

//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
//import com.google.api.client.http.HttpRequestInitializer
//import com.google.api.client.http.HttpTransport
//import com.google.api.client.json.JsonFactory
//import com.google.api.client.json.jackson2.JacksonFactory
//import com.google.api.client.util.DateTime
//import com.google.api.services.drive.Drive
//import com.google.api.services.drive.DriveScopes
//import com.google.api.services.drive.model.File
//import com.google.api.services.drive.model.FileList
//import java.io.File
//import java.io.IOException
//import java.security.GeneralSecurityException
//
//class GoogleDriveService(private val folderId: String) {
//
//    private val APPLICATION_NAME = "Google Drive API Kotlin Quickstart"
//    private val JSON_FACTORY: JsonFactory = JacksonFactory.getDefaultInstance()
//    private val HTTP_TRANSPORT: HttpTransport = GoogleNetHttpTransport.newTrustedTransport()
//    private val drive: Drive
//
//    init {
//        drive = Drive.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials())
//                .setApplicationName(APPLICATION_NAME)
//                .build()
//    }
//
//    @Throws(IOException::class)
//    private fun getCredentials(): HttpRequestInitializer {
//        //TODO: implement credentials flow
//        return TODO()
//    }
//
//    fun getImages(): List<File> {
//        var result: MutableList<File> = mutableListOf()
//        var query = "mimeType='image/jpeg' and trashed = false and '$folderId' in parents"
//        var files: FileList? = null
//        do {
//            try {
//                files = drive.files().list().setQ(query).execute()
//                result.addAll(files.files)
//                query = files.nextPageToken
//            } catch (e: IOException) {
//                System.err.println("An error occurred while retrieving the files: $e")
//                query = null
//            }
//        } while (query != null)
//        return result
//    }
//}
