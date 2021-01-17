package com.example.madlevel5task1.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.madlevel5task1.model.Note

@Dao
interface NoteDao {

    @Insert
    fun insertNote(reminder: Note)

    @Query("SELECT * FROM NoteTable LIMIT 1")
    fun getNotepad(): LiveData<Note>

    @Update
    suspend fun updateNote(reminder: Note)

}
