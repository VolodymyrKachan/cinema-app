# :cinema: Cinema App :cinema:
___
*Application that simulates a cinema service with the shopping cart and orders. Supports authentication, registration and other CRUD operations.*
___
![Cinema](https://media3.giphy.com/media/2eKfq00HWfb91flICf/giphy.gif)

## :bulb: Functionality :bulb:
- :lock: User **registration**, set Admin roles for each user(by default User role)
- :key: Possibility to **login / logout**
- :technologist: **User can**:
    + *see all movies*
    + *see all cinema halls*
    + *see available movie sessions*
    + *add tickets to shopping cart*
    + *complete order*
- :man_technologist: **Admin can**:
    + *find user by email*
    + *create | see available -> movies*
    + *create | see -> cinema halls*
    + *create | change | delete | see -> movie sessions*

## :card_file_box: Structure :card_file_box:
This project has **N-tier architecture**. It consists of:
>>**Controller** - accept http requests from users and display information.
>
>>**Service** - is responsible for the business logic of the application.
>
>>**DAO** - all the work with the database takes place at this level.
## :computer: Technologies :computer:
:wrench: _**Java 11**_

:wrench: _**Spring MVC**_

:wrench: _**Spring Security**_

:wrench: _**Hibernate**_

:wrench: _**Maven**_

:wrench: _**MySQL**_

:wrench: _**Tomcat**_

## :man_shrugging::rocket: Houston we have a problem! How it works? :rocket::woman_shrugging:
- :walking:**Step 1** - _Fork this repository._
- :walking:**Step 2** - _Open IntelliJ IDEA and write `git clone <SSH link>` in your console._
- :walking:**Step 3** - _Configure resources -> "db.properties" file_
```java
        db.driver=YOUR_DRIVER
        db.url=YOUR_URL
        db.user=YOUR_USERNAME
        db.password=YOUR_PASSWORD
```
- :walking:**Step 4** - _Install Tomcat. (you can install it [here](https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.50/bin/))._
- :walking:**Step 5** - _Add Tomcat server in configurations._
- :man_dancing:**Final Step** - _Run project and Houston will be glad it works! :man_dancing:_
___
