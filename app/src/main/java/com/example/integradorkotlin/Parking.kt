package com.example.integradorkotlin

//initial values for easy instance
data class Parking(val vehicles: MutableSet<Vehicle> = mutableSetOf(), val maxCapacity: Int = 20) {

    //check if there's room in the parking, if so, add the vehicle
    //else, says sorry
    fun addVehicle(vehicle: Vehicle): Boolean {

        return if (vehicles.size < maxCapacity) {
            vehicles.add(vehicle)
            println("Welcome to AlkeParking!")
            true
        } else {
            println("Sorry, the check-in failed")
            false
        }
    }

    //Make a loop to add tons of vehicles to the set by checking with addVehicle fun
    fun checkIn(vehiclesCheckIn: List<Vehicle>) {
        for (i in vehiclesCheckIn) {
            addVehicle(i)
        }
    }

    //ParkingSpace.checkOutVehicle(v, os, oe)
    //parking.checkOut(vehiculo, parking.onSucces(), parking.onError())
    /*fun checkOut(vehicle1: Vehicle, onSuccess: (payment: Int) -> Unit, onError: () -> Unit) {
        val parkingSpace = ParkingSpace(vehicle1)
        //ve si existe el vehiculo que le estoy pasando
        if (vehicles.any { vehicle -> vehicle.plate == vehicle1.plate }) {
            //encuentra el vehiculo que cumpla la condición
            val vehicle2 = vehicles.first { vehicle -> vehicle.plate == vehicle1.plate }
            //obtiene la tarifa total de un vehiculo de acuerdo al tiempo que estuvo en el estacionamiento y checa si trae tarjeta
            val totalFee = parkingSpace.calculateFee(
                vehicle1.type, parkingSpace.parkingTime.toInt(),
                vehicle1.discountCard.isNotNullOrBlank()
            )
            onSuccess(totalFee, vehicle2)
        } else {
            this.onError()
        }

    }*/

    fun onSuccess(totalFee: Int, vehicle: Vehicle) {
        println("Your fee is $$totalFee Come back soon.")
        vehicles.remove(vehicle)
    }

    fun onError() {
        println("Sorry, the check-out failed")
    }


}