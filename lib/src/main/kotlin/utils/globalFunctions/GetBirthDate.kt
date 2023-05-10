package utils.globalFunctions

// This function collects the birthdate from the user to calculate their fortune.
fun getBirthDate() : String {
	// Declare variables for the regex pattern and the different parts of the birthdate.
	var regex : Regex
	var birthDate : String
	var birthDay : String
	var birthMonth : String
	var birthYear : String
	
	do {
		// Ask the user for their day of birth.
		println("Now, I need to know your day of birth to calculate your fortune.")
		Thread.sleep(400)
		println("""What day were you born?
		|Give it in numbers from 01 to 31.""".trimMargin())
		
		// Define a regex pattern to validate the user's input.
		regex = "^(0?[1-9]|[12][0-9]|3[01])$".toRegex()
		birthDay = readln()
		birthDate = birthDay
		
		// If the input matches the pattern, break the loop.
		if (birthDay.matches(regex)) break
	} while (!birthDay.matches(regex))
	
	Thread.sleep(400)
	
	do {
		// Ask the user for their month of birth.
		println("Now, I need to know your month of birth to calculate your fortune.")
		Thread.sleep(400)
		println("""What month were you born?
		|Give it in numbers from 01 to 12.""".trimMargin())
		
		// Define a regex pattern to validate the user's input.
		regex = "^(0?[1-9]|1[0-2])\$".toRegex()
		birthMonth = readln()
		
		// Add the month to the birthdate.
		birthDate += birthMonth
		
		// If the input matches the pattern, break the loop.
		if (birthMonth.matches(regex)) break
	} while (!birthMonth.matches(regex))
	
	Thread.sleep(400)
	
	do {
		// Ask the user for their year of birth.
		println("Now, I need to know your birthday to calculate your fortune.")
		Thread.sleep(400)
		println("""What year were you born?
		|Give it in all 4 numbers like 1989.""".trimMargin())
		
		// Define a regex pattern to validate the user's input.
		regex = "^[0-9]{4}\$".toRegex()
		
		birthYear = readln()
		
		// Add the year to the birthdate.
		birthDate += birthYear
		
		// If the input matches the pattern, break the loop.
		if (birthYear.matches(regex)) break
	} while (!birthYear.matches(regex))
	
	Thread.sleep(400)
	
	// Return the complete birthdate.
	return birthDate
}
