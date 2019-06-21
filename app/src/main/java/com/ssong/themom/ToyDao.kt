package com.ssong.themom

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query

@Dao
interface ToyDao {
    @Query("SELECT * FROM toy")
    fun getAll(): MutableList<Toy>

    @Insert(onConflict = REPLACE)
    fun insert(toy: Toy)

    @Query("DELETE from toy")
    fun deleteAll()

}