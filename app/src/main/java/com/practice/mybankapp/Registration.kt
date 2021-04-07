package com.practice.mybankapp

class Registration() {

    lateinit var firstName: String
    lateinit var lastName: String
    lateinit var email: String
    lateinit var username: String
    lateinit var password: String

    //*************** GETTERS DEFINED BELOW *************************

    public fun getPassword(): Any? {
        return password
    }

    public fun getUserName(): Any? {
        return username
    }

    public fun getEmail(): Any? {
        return email
    }

    public fun getLastName(): Any? {
        return lastName
    }

    public fun getFirstName(): Any? {
        return firstName
    }


    //*************** SETTERS DEFINED BELOW *************************

    public fun setPassword(password: String): Any? {
        this.password = password
        return password
    }

    public fun setUserName(userName: String): Any? {
        this.username = userName
        return userName
    }

    public fun setEmail(email: String): Any?{
        this.email = email
        return email
    }

    public fun setLastName(lastName: String): Any?{
        this.lastName = lastName
        return lastName
    }

    public fun setFirstName(firstName: String): Any? {
        this.firstName = firstName
        return firstName
    }

}