package globalFunctions

fun String.getInt(index : Int): Int {
	return try {
		this[index].digitToInt()
	} catch (ex: Exception) {
		println("""Your entry does not appear to be in the desired format.
			|Please enter your date of birth again.""".trimMargin())
		return 0
	}
}
