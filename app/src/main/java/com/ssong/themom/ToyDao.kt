package com.ssong.themom

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query


@Dao
interface ToyDao {
    @Query("SELECT * FROM toy")
    fun getAll(): MutableList<Toy>

    @Insert(onConflict = REPLACE)
    fun insert(toy: Toy)

    @Query("DELETE from toy")
    fun deleteAll()

}