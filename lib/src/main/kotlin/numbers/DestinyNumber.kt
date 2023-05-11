package numbers

import utils.globalFunctions.getBirthDate
import utils.globalFunctions.getCrossSum
import utils.globalFunctions.getInt
import utils.texts.destinyNumberTexts

// Define a class for DestinyNumber.
class DestinyNumber() {
	
	// Define properties for number and its meaning.
	private var number : Int = 0
	var meaning : String = ""
	
	// Method to calculate the destiny number.
	fun calculateDestinyNumber(): Int {
		// Get the birthdate.
		val birthDate : String = getBirthDate()
		
		// Extract each digit from the birthdate.
		val number1 : Int = birthDate.getInt(0)
		val number2 : Int = birthDate.getInt(1)
		val number3 : Int = birthDate.getInt(2)
		val number4 : Int = birthDate.getInt(3)
		val number5 : Int = birthDate.getInt(4)
		val number6 : Int = birthDate.getInt(5)
		val number7 : Int = birthDate.getInt(6)
		val number8 : Int = birthDate.getInt(7)
		
		// Calculate the cross sum of the birthdate.
		var crossSum : Int = getCrossSum(number1, number2, number3, number4, number5, number6, number7, number8)
		
		// Check if the cross sum is 11, 22, 33 (master numbers) or less than 10.
		// If not, reduce the sum to a single digit.
		if (crossSum == 11 || crossSum == 22 || crossSum == 33 || crossSum < 10) {
			number = crossSum
		} else {
			while (crossSum > 9) {
				crossSum = crossSum.toString().map { it.toString().toInt() }.sum()
			}
			number = crossSum
		}
		
		Thread.sleep(400)
		
		// Set the meaning of the number from the destinyNumberTexts.
		meaning = destinyNumberTexts[number].toString()
		
		// Print the destiny number and its meaning.
		println("Your destiny number is $number and it means ${meaning.lowercase()}.")
		return number
	}
}
