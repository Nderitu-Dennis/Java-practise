# StringBuilder Class in Java
The StringBuilder class in Java is a mutable sequence of characters, 
designed for efficiently building and modifying strings. In the context of the Roman numeral converter code, 
StringBuilder is used to construct the Roman numeral string as we iterate through the number.
## Why use StringBuilder?
- [x] Efficient Modifications: Unlike String, which is immutable (every modification creates a new object), StringBuilder allows modifications without creating new objects, improving performance when working with many string operations.
- [x] You can append characters or strings to a StringBuilder instance without worrying about creating new objects.
      
```java
StringBuilder roman = new StringBuilder();
```

Initialization: A new StringBuilder instance named roman is created. Initially, it is empty.
```java
roman.append(numerals[i]);
```

Appending Strings: The append() method adds the corresponding Roman numeral (numerals[i]) to the current sequence in roman. Each time a numeral is appended, the StringBuilder is updated in place, avoiding the creation of new string objects.
Converting to a String: Once all Roman numeral symbols have been appended, the toString() method converts the StringBuilder contents into a standard String for the final output.


