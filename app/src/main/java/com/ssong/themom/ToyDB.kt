package com.ssong.themom

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context

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
