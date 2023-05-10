import numbers.DestinyNumber

fun main() {
	// Create a new DestinyNumber object.
	val dn = DestinyNumber()
	
	// Call the calculateDestinyNumber method and print the result.
	val destinyNumber = dn.calculateDestinyNumber()
	println("The destiny number is: $destinyNumber")
	println("The meaning of the destiny number is: ${dn.meaning}")
}
