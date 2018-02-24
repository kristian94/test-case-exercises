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
