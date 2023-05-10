package utils.globalFunctions

// This function attempts to convert a character at a specific index in the String to an Int.
fun String.getInt(index : Int): Int {
	return try {
		// Try to get the character at the specified index and convert it to a digit.
		this[index].digitToInt()
	} catch (ex: Exception) {
		// If any error occurs (like if the index is out of bounds, or the character is not a digit), print an error message.
		println("""Your entry does not appear to be in the desired format.
			|Please enter your date of birth again.""".trimMargin())
		// Return 0 as a default value.
		return 0
	}
}
