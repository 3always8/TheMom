package com.ssong.themom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Toy::class], version = 2)
@TypeConverters(Converters::class)
abstract class ToyDB: RoomDatabase() {
    abstract fun toyDao(): ToyDao

    companion object {
        private var INSTANCE: ToyDB? = null

        fun getInstance(context : Context): ToyDB? {
            if (INSTANCE == null) {
                synchronized(ToyDB::class) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    ToyDB::class.java, "toy.db"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance(){
            INSTANCE = null
        }
    }
}
