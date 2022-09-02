package com.example.integradorkotlin

import java.util.*

//late = plate
//vehicle type = VehicleType
//check in = checkInTime
//discount card = discountCard
data class Vehicle(val plate : String, val type: VehicleType, val checkInTime: Calendar, val discountCard: String? = null) {

        override fun equals(other : Any?) : Boolean {
            if (other is Vehicle) {
                return this.plate == other.plate
            }
            return super.equals(other)
        }

        override fun hashCode() : Int = this.plate.hashCode()

}