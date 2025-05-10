# basic_algorithms

Here's an overview of basic algorithms commonly used in Java:

Sorting Algorithms
===================

Bubble Sort: 
-----------
Compares adjacent elements and swaps them if they are in the incorrect order, iterating through the list until sorted. It is simple but inefficient for large datasets.

Insertion Sort:
---------------
Builds a sorted sublist one element at a time by inserting elements into their correct position within the sorted sublist. Efficient for small or nearly sorted lists.

Selection Sort:
---------------
Finds the minimum element in the unsorted portion and places it at the beginning, repeating until the list is sorted.

Merge Sort:
------------
A divide-and-conquer algorithm that divides the list into halves, recursively sorts them, and then merges the sorted halves. It is efficient and stable.

Quick Sort:
-----------
Another divide-and-conquer algorithm that picks an element as a pivot and partitions the list around it, recursively sorting the sublists. It is generally very efficient but can have worst-case performance.


Searching Algorithms
====================
Linear Search:
--------------
Sequentially checks each element in the list until the target is found or the end of the list is reached. It is simple but inefficient for large datasets.

Binary Search:
--------------
Efficiently searches a sorted list by repeatedly dividing the search interval in half.


Data Structure Algorithms
==========================
Linked List:
A linear data structure where elements are stored in nodes, with each node containing a value and a pointer to the next node.
Stack:
A LIFO (Last-In, First-Out) data structure where elements are added and removed from the top.
Queue:
A FIFO (First-In, First-Out) data structure where elements are added at the rear and removed from the front.
Binary Search Tree:
A tree data structure where each node has at most two children, and the left child is less than the node's value, while the right child is greater.
Heap:
A tree-based data structure that satisfies the heap property (e.g., in a min-heap, the value of each node is less than or equal to the value of its children).
Hashing:
A technique for mapping keys to values in a hash table, allowing for efficient data retrieval.


Other Algorithms
===================
Recursion:
----------
A technique where a function calls itself to solve smaller instances of the same problem.

Dynamic Programming:
--------------------
Solves complex problems by breaking them down into simpler overlapping subproblems, storing the solutions to these subproblems to avoid redundant computations.

Greedy Algorithm:
-----------------
Makes locally optimal choices at each step with the hope of finding a global optimum.

String Matching Algorithms:
---------------------------
Algorithms used to find occurrences of a pattern within a text (e.g., Knuth-Morris-Pratt, Boyer-Moore).


Java Built-in Methods for Algorithm Implementation
==================================================
# Arrays.sort(): Sorts an array.
# Collections.sort(): Sorts a collection (e.g., ArrayList).
# Collections.reverse(): Reverses the order of elements in a list.
# Collections.fill(): Replaces every element in a list with a specified value.
# Collections.copy(): Copies elements from a source list to a destination list.
# Collections.swap(): Swaps elements at specified positions in a list.
# Collections.addAll(): Adds all elements of a collection to another collection. 
