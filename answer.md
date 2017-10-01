What is the complexity of each of the four search methods in terms of array or list size n?
findTeamPosition (array) = O(n)
findTeamPosition (list)  = O(n)
findTeamMinFunding       = O(n) 
findTeamMinFundingFast   = O(log(n))

- What happens in the case of binary search if the array is not sorted?
   Binary search works by assuming the middle of the array contains the median value in the array. 
   If it is not sorted, this assumption does not make sense, since the median can be anywhere and 
   cutting the array in half could mean that you cut off the number you were searching for.


- What is the purpose of constructor argument validity checking?
  If an invalid parameter value is passed to a method and the method checks its parameters before execution, 
it will fail quickly and cleanly with an appropriate exception. If the method fails to check its parameters, 
several things could happen. The method could fail with a confusing exception in the midst of processing.
Constructors represent a special case of the principle that you should check the validity of parameters that 
are to be stored away for later use. It is very important to check the validity of parameters to constructors 
to prevent the construction of an object that violates class invariants.

- What is the purpose of using the keyword `final` with variables and arguments?
     The keyword 'final' is used to stop value change, stop method overriding, stop inheritance
      For example you might get a compilation error if you try to change the value of a final variable.
   
- What are alternatives to using `Optional` and how do they compare
 Optional object is used to represent null with absent value. It provides various utility methods to 
facilitate code to handle values as ‘available’ or ‘not available’ instead of checking null values. 
isNullOrEmpty(String string) method Returns true if the given string is null or is the empty string.