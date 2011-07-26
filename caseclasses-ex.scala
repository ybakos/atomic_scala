// create a case class that represents a Person in an Address Book, complete with name and contact information.

case class ContactInformation(email: String, phone: String)
case class Person(name: String, contactInfo: ContactInformation)

