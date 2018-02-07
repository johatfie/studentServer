package studentserver

class BootStrap {

    def init = { servletContext ->

        new Student(
            studentId: 4312,
            firstName: 'Waylon',
            lastName: 'Dalton',
            address: '123 Main Street',
            city: 'Springfield',
            state: 'NT',
            zipCode: 55555,
            email: 'wdalton@gmail.com',
            dateOfBirth: new Date().parse("MM.dd.yyy", '05.06.1997'),
            gpa: 4.0F
        ).save()

        new Student(
            studentId: 6852,
            firstName: 'Justine',
            lastName: 'Henderson',
            address: '456 Lakeview Drive',
            city: 'Louisville',
            state: 'KY',
            zipCode: 65423,
            email: 'jhenderson@gmail.com',
            dateOfBirth: new Date().parse("MM.dd.yyy", '09.08.2000'),
            gpa: 3.2F
        ).save()

        new Student(
            studentId: 72598,
            firstName: 'Abdullah',
            lastName: 'Lang',
            address: '1313 Mockingbird Lane',
            city: 'Cincinnati',
            state: 'OH',
            zipCode: 87654,
            email: 'alang@aol.com',
            dateOfBirth: new Date().parse("MM.dd.yyy", '12.11.2001'),
            gpa: 3.8F
        ).save()

        new Student(
            studentId: 25634,
            firstName: 'Marcus',
            lastName: 'Cruz',
            address: '357 Magnum Street',
            city: 'Bloomington',
            state: 'IL',
            zipCode: 75321,
            email: 'mcruz@yahoo.com',
            dateOfBirth: new Date().parse("MM.dd.yyy", '07.07.1999'),
            gpa: 2.9F
        ).save()

        new Student(
            studentId: 45214,
            firstName: 'Thalia',
            lastName: 'Cobb',
            address: '159 Corn Row',
            city: 'Atlanta',
            state: 'GA',
            zipCode: 85234,
            email: 'tcobb@yahoo.com',
            dateOfBirth: new Date().parse("MM.dd.yyy", '06.24.2002'),
            gpa: 2.5F
        ).save()

    }

    def destroy = {
    }
}
