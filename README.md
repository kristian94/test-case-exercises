# Test Case Exercises

## Equivalence Classes

#### 1.

Equivalence classes for ```isEven(int n)```

|even       |uneven     |
| ---         |     ---     |
|n % 2 == 0 |n % 2 == 1 |

*Absolute value of n should be used for negative numbers*

#### 2.

Equivalence class for mortgage applicant's salary

 invalid (too low) | valid | invalid (too high)
 --- | --- | ---
 n < 1000 | n >= 1000 && n <= 75000 | n > 75000 

#### 3.

Equivalence classes for ```getNumDaysInMonth(int month, int year)

###### month

invalid (too low) | valid | invalid (too high) 
--- | --- | ---
n < 0 | n >= 0 && n <= 11 | n > 11

*my solution assumes that months are 0-indexed (0 == January)*

###### year

If the implementation uses UNIX-time based Date instances, the lowest valid value for "year" would be 1970 and the classes would look like this:

invalid (too low) | valid
--- | ---
n < 1970 | n >= 1970 

But it might make more sense to have the implementation support gregorian dates, in which case the classes would look like this:

invalid (too low) | valid
--- | ---
n < 0 | n <= 0
