package com.ssong.themom
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey

/*
class Toy (val name: String, val brand: String, val cost: Int, val image: Int,
           val themomPoint: Double, val userPoint: Double)
           */
@Entity
data class Toy @Ignore constructor(
//    @PrimaryKey(autoGenerate = true) var id: Int? = null,
    @PrimaryKey var id: Int,
    var name: String,
    var brand: String,
    var cost: Int,
    var imageSource: Int,
    var themomPoints: List<Double>,
    var userPoints: List<Double>){

    constructor(): this(0, "", "",  0, 0,listOf(0.0,0.0,0.0,0.0,0.0),listOf(0.0,0.0,0.0,0.0,0.0))
}