package com.ssong.themom

import android.arch.persistence.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken as TypeToken1

class Converters {
    @TypeConverter
    fun ArrayToJson(value: List<Double>): String {
        return Gson().toJson(value)
    }

    @TypeConverter
    fun jsonToArray(value: String): List<Double> {
        val objects = Gson().fromJson(value, Array<Double>::class.java) as Array<Double>
        val mArray = objects.toList()
        return mArray
    }

}
