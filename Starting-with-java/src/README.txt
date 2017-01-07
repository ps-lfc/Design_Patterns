CS542 Design Patterns
Spring 2016
PROJECT <ONE> README FILE

Due Date: <Friday, January 29, 2016>
Submission Date: <Friday, January 29, 2016>
Grace Period Used This Project: <ZERO> Days
Grace Period Remaining: <THREE> Days
Author(s): <Plash Sachdeva>
e-mail(s): <psachde3@binghamton.edu>


PURPOSE:

The purpose of this project is to determine the most frequently occurring element name in the XML document amazon.wsdl.

PERCENT COMPLETE:

I believe I have completed 100% of this project.

PARTS THAT ARE NOT COMPLETE:

None.

BUGS:

None.

FILES:

Included with this project are 4 files:

FileProcessor.java, the file which reads the input file line by line and passes it as a string.
Driver.java, the main file associated with the program also contains main.
StringOperations.java, file where all the string operations have been performed. 
README.txt, the text file you are presently reading

SAMPLE OUTPUT:

bingsuns2% javac *.java
bingsuns2% java Driver amazon.wsdl
The most frequently occurring element is ASIN. It appears 15 times

DATA STRUTURE USED:

Tree Map structure has been used for this assignment. One advantage of using a map structure for this assignment is that maps can store both key and values in the same data structure, 
so it saves space to implement a counter in the value field itself rather than creating a separate structure for it. Another advantage of this is that we need only one instance of a key 
to implement the counter and not multiple instances. In terms of time complextity, operations in Tree Map take O(logn) time. But since Tree Maps are sorted, it takes only O(1) time 
to determine the element with most frequently occuring element name.

TO COMPILE:

Just extract the files and then compile as : javac *.java.

TO RUN:

Please run as: java Driver amazon.wsdl

EXTRA CREDIT:

N/A
