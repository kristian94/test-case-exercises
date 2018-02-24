# Test Case Exercises

## Equivalence Classes

#### 1. isEven

Equivalence classes for ```isEven(int n)```

even number |uneven number  
 ---   |  ---   
n % 2 == 0 |n % 2 == 1 

*Absolute value of n should be used for negative numbers*

#### 2. Mortgage Applicant's Salary

Equivalence class for mortgage applicant's salary

 invalid (too low) | valid amount | invalid (too high)
 --- | --- | ---
 n < 1000 | n >= 1000 && n <= 75000 | n > 75000 

#### 3. GetNumDaysInMonth

Equivalence classes for ```getNumDaysInMonth(int month, int year)

###### month

invalid (too low) | valid month | invalid (too high) 
--- | --- | ---
n < 0 | n >= 0 && n <= 11 | n > 11

*my solution assumes that months are 0-indexed (0 == January)*

###### year

If the implementation uses UNIX-time based Date instances, the lowest valid value for "year" would be 1970 and the classes would look like this:

invalid (too low) | valid year
--- | ---
n < 1970 | n >= 1970 

But it might make more sense to have the implementation support gregorian dates, in which case the classes would look like this:

invalid (too low) | valid year
--- | ---
n < 0 | n <= 0


## Boundary Analysis

#### 1. IsEven

Boundary values would depend on the Integer type. If we assume the type is
int32 (32 bit integer), the boundaries are the following:
 
invalid (too low) | min | min+ | normal | max- | max | invalid (too high) |
---|---|---|---|---|---|---
-2147483649 | -2147483648 | -2147483647 | 0 | 2147483647 | 2147483648 | 2147483649 |


#### 2. Mortgage Applicant's Salary

Boundaries for valid amount are 1000-75000, producing the following values:

invalid (too low) | min | min+ | normal | max- | max | invalid (too high) |
---|---|---|---|---|---|---|
999 | 1000 | 1001 | 37000 | 74999 | 75000 | 75001|

#### 3. GetNumDaysInMonth

###### month

Valid months are between 0 (January) - 11 (December):

invalid (too low) | min | min+ | normal | max- | max | invalid (too high)
---|---|---|---|---|---|---
-1 | 0 | 1 | 5 | 10 | 11 | 12

## Decision Tables

#### Reimburse

Decision table for reimbursing patients based on deductible status and visit type:

conditions           |   |   |   |   |   |   |   |   |
:---                 |---|---|---|---|---|---|---|--- 
decuctibleHasBeenMet | T | T | T | T | F | F | F | F
doctorsOfficeVisit   | T | T | F | F | T | T | F | F
hospitalVisit        | T | F | T | F | T | F | T | F
**actions**          |   |   |   |   |   |   |   |   |
don't reimburse      |   |   |   | X | X | X | X | X 
reimburse 50%        |   | X |   |   |   |   |   |   |
reimburse 80%        | X |   | X |   |   |   |   |   |

*The scenario where `doctorsOfficeVisit` and `hospitalVisit` is a bit unlikely and would probably be handled as 2 individual
scenarios*

#### Leap Year

Table for deciding wether or not a given year is a leap year

conditions              |   |   |   |   |   |   |   |   |
:---                    |---|---|---|---|---|---|---|--- 
divisibleByFour         | T | T | T | T | F | F | F | F
divisibleByOneHundred   | T | T | F | F | T | T | F | F
divisibleByFourHundred  | T | F | T | F | T | F | T | F
**actions**             |   |   |   |   |   |   |   |   |
isLeapYear              | X |   | X | X | X |   | X |   |
isNotYearLeap           |   | X |   |   |   | X |   | X |

*Since 100 will always be divisble by 4 and 400 will also always be divisble by both 4 and 100, some of the scenarios will techichally be impossible*


## State Transition

#### 1. State Diagrams

Diagram for add:

![](https://github.com/kristian94/test-case-exercises/blob/master/img/add.png)

---

Diagram for size:

![](https://github.com/kristian94/test-case-exercises/blob/master/img/size.png)

---

Diagram for get:

![](https://github.com/kristian94/test-case-exercises/blob/master/img/get.png)

---

Diagram for add (with index):

![](https://github.com/kristian94/test-case-exercises/blob/master/img/add%20with%20index.png)

---

Diagram for remove:

![](https://github.com/kristian94/test-case-exercises/blob/master/img/remove.png)

---

#### 2. Test Cases:

###### add

input | expected output
--- | ---
new Object() | list updated
null | exception thrown

###### size

input | expected output
--- | ---
new 'MyArrayList' instance | return 0
populated 'MyArrayList' instance | return number of elements

###### get

input | expected output
--- | ---
valid index | return object at index
invalid | throw IndexOutOfBoundsException

###### add (with index)

input index | input object | expected output
--- | --- | ---
valid index | valid object | insert object at index
valid index | invalid object | throw NullPointerException
invalid index | valid object | throw IndexOutOfBoundsException
invalid index | invalid object | throw IndexOutOfBoundsException

###### remove

input | expected output
--- | ---
valid index | remove element from list, return removed element
invalid | throw IndexOutOfBoundsException

#### 3. Unit Tests

See 


