##Meetings (while pair coding)

30/08 -> roles, way of working, and schedules are defined
      -> the 3 first ex got done

31/08 -> all done to ex 7
      -> Full check comparisson with requirements and our code

01/09 -> Create new functions according to the requirements
      -> ADD checkIn fun for array of vehicles entering the parking
      -> ADD comments on previous funs, REPLACE manual checking with checkIn fun
          
02/09 -> Try to finish the checkOut fun


##Code

VehicleType -> Enum class to define what vehicles are accepted in the parking and the fee rate for each one

Vehicles.kt -> Data class that define a vehicle
            -> a vehicle will have a plate, vehicleTye, checkInTime, discountCard(nulleable)
	          -> It has the equals method that assure that there will be no duplicates

Parking.kt    -> Data class that has the setOf vehicles
              -> It has a fixed size of 20
              -> Has a fun ‘addVehicle’ which verify that the limits is accomplished
	            -> Has a fun ‘checkInTime’ Make a loop to add tons of vehicles to the set by checking with addVehicle fun

ParkingSpace.kt -> Data class wich have the difference between checkin and checkout
