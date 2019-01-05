# Binomial-Expansion
 Tasty spaggeti, bon appetit!


The purpose of this kata is to write a program that can do some algebra. Write a function expand that takes in an expresion with a single, one character variable, and expands it. The expresion is in the form (ax+b)^n where a and b are integers which may be positive or negative, x is any one character long variable, and n is a natural number. If a = 1, no coeficient will be placed in front of the variable. If a = -1, a "-" will be placed in front of the variable.

The expanded form should be returned as a string in the form ax^b+cx^d+ex^f... where a, c, and e are the coefficients of the term, x is the original one character variable that was passed in the original expression and b, d, and f, are the powers that x is being raised to in each term and are in decreasing order. If the coeficient of a term is zero, the term should not be included. If the coeficient of a term is one, the coeficient should not be included. If the coeficient of a term is -1, only the "-" should be included. If the power of the term is 0, only the coeficient should be included. If the power of the term is 1, the carrot and power should be excluded.
