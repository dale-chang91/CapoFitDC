# CapoFitDC

### Use-Case
The goal of this project is to create an Android app for Capoeira Fitness DC. The primary functions of this app are as follows:
* Keep track of the attendance of students
* Keep track of the payment status of individuals
* Other yet-undefined functions

### Software Architecture
* Calendar Object
* Student Object
  * Child or Adult
  * Number of classes attended
  * Paid status
  * Contact info
  * General availability
  * Teacher's notes
  * 

### Flow
* Two main interfaces:
  * Calendar
    * Defaults to today's date
    * Always have a button that says add student
      * Can be existing student or create new student
    * Have a back button for the month view
    * Show a list of students that have been added for attendance
    * Students are clickable, which brings you to profile
  * Admin
    * Create student
    * Update student
    * Delete student
    * Calendar button at bottom
  * Toolbar at the bottom with two buttons
    * One button for Calendar
    * One button for Admin
