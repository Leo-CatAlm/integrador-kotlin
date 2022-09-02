package com.example.integradorkotlin

import java.util.*
import kotlin.math.ceil
import kotlin.math.floor

const val MINUTES_IN_MILLISECONDS = 60_000
const val HOUR_IN_MINUTES = 60

data class ParkingSpace(var vehicle : Vehicle, val parking: Parking) {
    
    val parkingTime: Long
        get() = (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis)/MINUTES_IN_MILLISECONDS

    //CHECKIN-CHECKOUT
    //PAYMENT
    fun checkOutVehicle(vehicle: Vehicle, onSuccess: (payment: Int) -> Unit, onError: () -> Unit) {

        //See if the vehicle exist in the parking set
        if (parking.vehicles.any { vehicle -> vehicle.plate == vehicle.plate }) {
            //find the first vehicle that match
            val vehicle = parking.vehicles.first { vehicle -> vehicle.plate == vehicle.plate }
            //Get the total fee
            val totalFee = calculateFee(
                vehicle.type, parkingTime.toInt(),
                vehicle.discountCard.isNotNullOrBlank())
                //if ok, removes the vehicle
            parking.vehicles.remove(vehicle)
            onSuccess(totalFee)
        } else {
            onError()
        }

    }

    fun calculateFee(vehicleaType: VehicleType, parkedTime: Int, hasDiscountCard: Boolean) : Int {
        //duda tipos de datos
        val totalFee = if (parkedTime <= (HOUR_IN_MINUTES * 2)) {
            vehicleaType.rate
        } else {
            //vehicleType.rate + (((parkedTime.toInt - 120)/15)*5)
            //20 + (((193 - 120)/15)*5)
            //20 + ((73/15)*5)
            //20 + (5*5)
            //20 + 25
            //45
          /*  var tf = vehicleaType.rate + (((parkedTime.toInt() - 120)/15)*5)
            tf.toInt()*/

            //Get the overtime
            val overTime = (parkedTime - HOUR_IN_MINUTES * 2)
            //Separate the overtime in blocks
            val blocks = ceil((overTime / 15).toDouble()).toInt()
            //multiply the blocks by the cost of itself
            vehicleaType.rate + blocks  * 5
        }
        //check if the vehicle have a discount card, if so, apply a 15% discount
        return if (hasDiscountCard) floor(totalFee * 0.85).toInt() else totalFee

    }


}