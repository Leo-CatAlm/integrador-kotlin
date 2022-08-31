package com.example.integradorkotlin

import java.util.*

const val MINUTES_IN_MILLISECONDS = 60000

data class ParkingSpace(var vehicle : Vehicle) {

    val parkingTime: Long
        get() = (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis)/MINUTES_IN_MILLISECONDS

    //BORRADOR
    //CHECKIN-CHECKOUT
    //PAYMENT

}