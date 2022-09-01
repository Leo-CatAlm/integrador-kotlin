package com.example.integradorkotlin

//Se definen valores de inicio para poder hacer más
data class Parking(val vehicles: MutableSet<Vehicle> = mutableSetOf(), val maxCapacity: Int = 20) {

    //Comprueba que quede espacio en el parking
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

    //Genera el ciclo, previa comprobación con addVehicle
    fun checkIn(vehiclesCheckIn: List<Vehicle>) {
        for (i in vehiclesCheckIn){
            addVehicle(i)
        }
    }

}