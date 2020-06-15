package com.jui.ideaslibrary.model;


import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface IdeaDAO {

    @Query("SELECT * FROM ideaentry")
    List<IdeaEntry> getAllIdeas();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long insertIdea(IdeaEntry m);

    @Update
    void updateIdea(IdeaEntry m);

    @Delete
    void deleteIdea (IdeaEntry m);




}
