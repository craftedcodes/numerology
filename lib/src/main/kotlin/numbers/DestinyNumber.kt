package numbers

import globalFunctions.getBirthDate
import globalFunctions.getCrossSum
import globalFunctions.getInt
import texts.destinyNumberTexts

class DestinyNumber() {
	
	private var number : Int = 0
	var meaning : String = ""
	
	// Method to calculate the destiny number
	fun calculateDestinyNumber(): Int {
		
		val birthDate : String = getBirthDate()
		val number1 : Int = birthDate.getInt(0)
		val number2 : Int = birthDate.getInt(1)
		val number3 : Int = birthDate.getInt(2)
		val number4 : Int = birthDate.getInt(3)
		val number5 : Int = birthDate.getInt(4)
		val number6 : Int = birthDate.getInt(5)
		val number7 : Int = birthDate.getInt(6)
		val number8 : Int = birthDate.getInt(7)
		
		// Add up the day, month, and year
		var crossSum : Int = getCrossSum(number1, number2, number3, number4, number5, number6, number7, number8)
		
		// Check if the sum is 11, 22, or 33 or if smaller than 10
		if (crossSum == 11 || crossSum == 22 || crossSum == 33 || crossSum < 10) {
			number = crossSum
		} else {
			// Reduce the sum to a single digit
			while (crossSum > 9) {
				crossSum = crossSum.toString().map { it.toString().toInt() }.sum()
			}
			number = crossSum
		}
		
		Thread.sleep(400)
		
		// Set the meaning based on the number
		meaning = destinyNumberTexts[number].toString()
		
		println("Your destiny number is $number and it means $meaning.")
		return number
	}
}
