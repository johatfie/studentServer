package studentserver

class Student {

    Integer studentId
    String firstName
    String lastName
    String address
    String city
    String state
    Integer zipCode
    String email
    Date dateOfBirth
    Float gpa


    static constraints = {
        studentId unique: true
        firstName maxSize: 255, blank: false
        lastName maxSize: 255, blank: false
        email email: true, blank: false
        dateOfBirth max: new Date()
        gpa max: 4.0F, min: 0.0F, scale: 2
    }

    //static hasMany = [classes: Class]
}
