Based on I/O-driven test techniques.

### Equivalence Partitioning
Divide a set of test conditions into sets. A good technique to use first but applicable at all levels of testing.

For example, a system preventing the sale of alcohol to minors will act in the same way given an input of 2, 9, or 15. These conditions are equivalent.

There can be **valid partitions** (eg. over the age of 0 and within a realistic human lifespan) and **invalid partitions** (less than 0 or more than a human lifespan)

## Boundary Value Analysis
Testing boundaries between partitions. You can have three tests or two tests for each boundary.

![[Boundary Value Analysis.png]]

## Decision Table Testing
A systematic method for selecting combinations of test data.

How decision table testing works:
1. Input conditions are identified
2. Actions expected to result from those combinations are defined
3. Identify a **unique** combination of conditions that result in the execution of one or more actions.