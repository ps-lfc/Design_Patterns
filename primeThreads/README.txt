CS542 Design Patterns
Spring 2016
PROJECT <TWO> README FILE

Due Date: <Monday, February 29, 2016>
Submission Date: <Monday, February 29, 2016>
Grace Period Used This Project: <ZERO> Days
Grace Period Remaining: <THREE> Days
Author(s): <Plash Sachdeva>
e-mail(s): <psachde3@binghamton.edu>


PURPOSE:
To get familiar with the application of design principles for a simple multi-threaded application.

PERCENT COMPLETE:

I believe I have completed 100% of this project.

PARTS THAT ARE NOT COMPLETE:

None.

BUGS:

None.

FILES:

Included with this project are 11 files:

FileProcessor.java, the file which reads the input file line by line and passes it as a string.
Driver.java, the main file associated with the program also contains main.
File_Interface.java, interface to read one line from the life 
CreateWorkers.java, file that creates and starts threads
WorkerThread.java,file that implements run method
IsPrime.java, checks if the number is prime or not
Results.java, file that adds number to the data structure and calculates the sum of prime numbers
stdIN.java, interface to overide add number class
StdoutDisplayInterface.java, interface to override writeSumToScreen method
Logger.java, class to make cases for various debug levels. 
README.txt, the text file you are presently reading

SAMPLE OUTPUT:

bingsuns2% ant -buildfile src/build.xml all
Buildfile: src/build.xml

prepare:
    [mkdir] Created dir: /u0/users/6/psachde3/plash_sachdeva_assign2/primeThreads/BUILD
    [mkdir] Created dir: /u0/users/6/psachde3/plash_sachdeva_assign2/primeThreads/BUILD/classes

primeThreads:
    [javac] Compiling 10 source files to /u0/users/6/psachde3/plash_sachdeva_assign2/primeThreads/BUILD/classes

compile_all:

all:

BUILD SUCCESSFUL
Total time: 4 seconds
bingsuns2% ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=3 -Darg2=0
Buildfile: src/build.xml

jar:
    [mkdir] Created dir: /u0/users/6/psachde3/plash_sachdeva_assign2/primeThreads/BUILD/jar
      [jar] Building jar: /u0/users/6/psachde3/plash_sachdeva_assign2/primeThreads/BUILD/jar/primeThreads.jar

run:
     [java] The sum of all the prime numbers is: 900


DATA STRUTURE USED:

Array List structure has been used for this assignment. One advantage of using this structure for this assignment is that the load factor of array list is 50% which makes it space efficient.
In terms of time complextity, it takes the usual time complexity of array list with synchronized methods.

TO COMPILE:

bingsuns2% ant -buildfile src/build.xml all

TO RUN:

Please run as: 

bingsuns2% ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=3 -Darg2=0

EXTRA CREDIT:

N/A
