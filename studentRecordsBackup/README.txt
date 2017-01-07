CS542 Design Patterns
Spring 2016
PROJECT 3 README FILE

Due Date: Tuesday, March 22, 2016
Submission Date: Wednesday, March 23, 2016
Grace Period Used This Project: 0 Days
Grace Period Remaining: N/A Days
Author(s): Plash Sachdeva
e-mail(s): psachde3@binghamton.edu


PURPOSE:

To apply and implement Observer pattern.

PERCENT COMPLETE:

As per my understanding, all the requirements for this assignment are getting completed. So 100% complete.

BUGS:

None.

FILES:

Included with this project are 10 files:

README.txt the text file you are presently reading
Driver.java the main file associated with the program also contains main
BSTBuilder.java reads a line from the input file, and calls the insert method of the BST 
EvenFilterImpl.java which checks if number is even
OddFilterImpl.java which checks if number is odd
Node.java which store the B-Number
SubjectI.java interface for adding,removing, and notifying observers.
ObserverI.java interface for updating values in a node
BST.java which store Nodes in accordance with the BST rules applied to the B-Number of each Node. 
File_Interface.java implemented by BSTBuilder.java

SAMPLE OUTPUT:

remote04:~/test/plash_sachdeva_assign3/studentRecordsBackup> ant -buildfile src/                                                                                        build.xml all
Buildfile: /import/linux/home/psachde3/test/plash_sachdeva_assign3/studentRecord                                                                                        sBackup/src/build.xml

prepare:
    [mkdir] Created dir: /import/linux/home/psachde3/test/plash_sachdeva_assign3                                                                                        /studentRecordsBackup/BUILD
    [mkdir] Created dir: /import/linux/home/psachde3/test/plash_sachdeva_assign3                                                                                        /studentRecordsBackup/BUILD/classes

studentRecordsBackup:
    [javac] /import/linux/home/psachde3/test/plash_sachdeva_assign3/studentRecor                                                                                        dsBackup/src/build.xml:48: warning: 'includeantruntime' was not set, defaulting                                                                                         to build.sysclasspath=last; set to false for repeatable builds
    [javac] Compiling 10 source files to /import/linux/home/psachde3/test/plash_                                                                                        sachdeva_assign3/studentRecordsBackup/BUILD/classes

compile_all:

all:

BUILD SUCCESSFUL
Total time: 2 seconds
remote04:~/test/plash_sachdeva_assign3/studentRecordsBackup>

remote04:~/test/plash_sachdeva_assign3/studentRecordsBackup> ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=3
Buildfile: /import/linux/home/psachde3/test/plash_sachdeva_assign3/studentRecordsBackup/src/build.xml

jar:
    [mkdir] Created dir: /import/linux/home/psachde3/test/plash_sachdeva_assign3/studentRecordsBackup/BUILD/jar
      [jar] Building jar: /import/linux/home/psachde3/test/plash_sachdeva_assign3/studentRecordsBackup/BUILD/jar/studentRecordsBackup.jar

run:
     [java] File not found exception
     [java] Java Result: 1

BUILD SUCCESSFUL
Total time: 1 second
remote04:~/test/plash_sachdeva_assign3/studentRecordsBackup>

remote04:~/test/plash_sachdeva_assign3/studentRecordsBackup> ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=3
Buildfile: /import/linux/home/psachde3/test/plash_sachdeva_assign3/studentRecordsBackup/src/build.xml

jar:
    [mkdir] Created dir: /import/linux/home/psachde3/test/plash_sachdeva_assign3/studentRecordsBackup/BUILD/jar
      [jar] Building jar: /import/linux/home/psachde3/test/plash_sachdeva_assign3/studentRecordsBackup/BUILD/jar/studentRecordsBackup.jar

run:
     [java] Inorder Traversal for tree 1
     [java] 1
     [java] 2
     [java] 3
     [java] 4
     [java] Inorder Traversal for tree 2
     [java] 1
     [java] 2
     [java] 3
     [java] 4
     [java] Inorder Traversal for tree 3
     [java] 1
     [java] 2
     [java] 3
     [java] 4
     [java] Sum of all nodes for tree 1
     [java] 10
     [java] Sum of all nodes for tree 2
     [java] 10
     [java] Sum of all nodes for tree 3
     [java] 10
     [java] Updated Sum of all nodes for tree 1
     [java] 25
     [java] Updated Sum of all nodes for tree 2
     [java] 10
     [java] Updated Sum of all nodes for tree 3
     [java] 22

BUILD SUCCESSFUL
Total time: 1 second
remote04:~/test/plash_sachdeva_assign3/studentRecordsBackup>



TO COMPILE:

[
  Extract.
  Follow Path: plash_sachdeva_assign3/studentRecordsBackup/
  Assuming you are in the directory containing this README

  ## To compile: 
  ant -buildfile src/build.xml all
]

Extract 

TO RUN:

[
ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=3
]

EXTRA CREDIT:

"N/A"

BIBLIOGRAPHY:

HashMap has been used to store obervers which helps in applying odd and even filter .

This serves as evidence that I am in no way intending Academic Dishonesty.
Plash Sachdeva