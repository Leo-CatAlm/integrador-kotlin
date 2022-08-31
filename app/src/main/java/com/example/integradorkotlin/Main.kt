package com.example.integradorkotlin

import java.util.*

fun main() {
    enterParking().vehicles.forEach(System.out::println) //DONE
    duplicateCar() //DONE

}

fun enterParking(): Parking {

    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val motorCycle = Vehicle("B222BBB", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val miniBus = Vehicle("CC333CCC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")

    val parking = Parking(mutableSetOf(car, motorCycle, miniBus, bus))
    println(parking.vehicles.contains(car))
    println(parking.vehicles.contains(motorCycle))
    println(parking.vehicles.contains(miniBus))
    println(parking.vehicles.contains(bus))

    return parking


}

fun duplicateCar() {
    val parking = enterParking()
    val car2 = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val isCar2Inserted = parking.vehicles.add(car2)
    println(isCar2Inserted)
}