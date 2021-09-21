package builder

class Book private constructor(
	val title: String,
	val author: String,
	val publisher: String?
) {
	data class Builder(
		var title: String? = null,
		var author: String? = null,
		var publisher: String? = null) {

		fun title(title: String) = apply { this.title = title }
		fun author(author: String) = apply { this.author = author }
		fun build(): Book {
			//typically, this part is why you use a builder. you want to asure that the object constructed is valid.
			if (title != null) {
				throw IllegalArgumentException("title must not be null")
			}

			// this is a validation normal data class constructors can't handle
			if (title.length < 5) {
				throw IllegalArgumentException("title is too short")
			}
			if (author == null) {
				throw IllegalArgumentException("author must not be null")
			}
			return Book(title!!, author!!, publisher)
		}
	}
}

fun main() {
	// Produces a valid book with title and author
	val book = Book.Builder()
		.author("Stephen King")
		.title("Mr. Mercedes")
		.build()
}