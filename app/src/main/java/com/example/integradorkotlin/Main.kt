package com.example.integradorkotlin

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    enterParking()

    val parking = Parking()
    for (i in fullArrayVehicles()){
        parking.addVehicle(i)
    }
    val bus6 = Vehicle("DD444DD1AAAAH1", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    parking.addVehicle(bus6)
}

//Creamos una f(x) para poder llenar una lista que luego al iterar para usar el addVehicle
fun fullArrayVehicles(): List<Vehicle>{
    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val motorCycle = Vehicle("B222BBB", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val miniBus = Vehicle("CC333CCC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val car2 = Vehicle("AA111AAC", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val motorCycle2 = Vehicle("B222BBBA", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val miniBus2 = Vehicle("CC333CCCE", VehicleType.MINIBUS, Calendar.getInstance())
    val bus2 = Vehicle("DD444DDR", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val car3 = Vehicle("AA111AAL", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val motorCycle3 = Vehicle("B222BBBV", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val miniBus3 = Vehicle("CC333CCC1", VehicleType.MINIBUS, Calendar.getInstance())
    val bus3 = Vehicle("DD444DD2", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val car4 = Vehicle("AA111AA23", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val motorCycle4 = Vehicle("B222BBB12", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val miniBus4 = Vehicle("CC333CCCREQ", VehicleType.MINIBUS, Calendar.getInstance())
    val bus4 = Vehicle("DD444DDLFKD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val car5 = Vehicle("AA111AAASDQWE", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val motorCycle5 = Vehicle("B222BBBASD12", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val miniBus5 = Vehicle("CC333CCCKSD422", VehicleType.MINIBUS, Calendar.getInstance())
    val bus5 = Vehicle("DD444DDAAAAH1", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")

    return listOf(car, car2, car3, car4, car5, motorCycle, motorCycle2,
        motorCycle3, motorCycle4, motorCycle5,miniBus, miniBus2, miniBus3, miniBus4, miniBus5, bus,
        bus2, bus3, bus4, bus5)
}

fun enterParking(){

    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val motorCycle = Vehicle("B222BBB", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val miniBus = Vehicle("CC333CCC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")

    val parking = Parking(mutableSetOf(car, motorCycle, miniBus, bus))
    println(parking.vehicles.contains(car))
    println(parking.vehicles.contains(motorCycle))
    println(parking.vehicles.contains(miniBus))
    println(parking.vehicles.contains(bus))

    val car2 = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val isCar2Inserted = parking.vehicles.add(car2)
    println(isCar2Inserted)

    parking.vehicles.remove(motorCycle)

}
