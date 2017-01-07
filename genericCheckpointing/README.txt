CS542 Design Patterns
Spring 2016
PROJECT <FIVE> README FILE

Due Date: <Sunday, May 8, 2016>
Submission Date: <Sunday, May 8, 2016>
Grace Period Used This Project: <ZERO> Days
Grace Period Remaining: <ZERO> Days
Author(s): <Plash Sachdeva>
e-mail(s): <psachde3@binghamton.edu>


PURPOSE:

The purpose of this assignment is to create a generic library to serialize and deserialize objects. 
The code should allow the conversion of objects into a wire format. 
The code should be designed using dynamic proxies and reflection so that addition of new objects or serialization formats causes minimal changes (reduces the ripple effect).

PERCENT COMPLETE:

I believe I have completed 100% of this project.

PARTS THAT ARE NOT COMPLETE:

None.

BUGS:

None.

FILES:

FileProcessor.java
Driver.java
RestoreI.java
StoreI.java
StoreRestoreI.java,
File_Interface.java,
MyAllTypesFirst.java,
MyAllTypesSecond.java,
ProxyCreator.java,
SerializableObject.java,
DeserializableTypes.java,
DeserializationStrategy.java,
SerializationStrategy.java,
SerializeTypes.java,
StoreRestoreHandler.java,
XMLDeSerialize,java,
XMLSerialize.java,
RandomGenerator.java
build.xml, the file used to compile and run the code
README.txt, the text file you are presently reading

SAMPLE OUTPUT:


genericCheckpointing
/import/linux/home/psachde3/plash_sachdeva_assign5$ ant genericCheckpointing/build.xml all
Build failed
Buildfile: build.xml does not exist!
/import/linux/home/psachde3/plash_sachdeva_assign5$ cd genericCheckpointing
/import/linux/home/psachde3/plash_sachdeva_assign5/genericCheckpointing$ ls
build.xml
src
/import/linux/home/psachde3/plash_sachdeva_assign5/genericCheckpointing$ ant -buildfile build.xml all
Buildfile: /import/linux/home/psachde3/plash_sachdeva_assign5/genericCheckpointing/build.xml

prepare:
    [mkdir] Created dir: /import/linux/home/psachde3/plash_sachdeva_assign5/BUILD
    [mkdir] Created dir: /import/linux/home/psachde3/plash_sachdeva_assign5/BUILD/classes

genericCheckpointing:
    [javac] Compiling 18 source files to /import/linux/home/psachde3/plash_sachdeva_assign5/BUILD/classes
    [javac] Note: Some input files use unchecked or unsafe operations.
    [javac] Note: Recompile with -Xlint:unchecked for details.

compile_all:

all:

BUILD SUCCESSFUL
Total time: 3 seconds
/import/linux/home/psachde3/plash_sachdeva_assign5/genericCheckpointing$ ant -buildfile build.xml run -Darg0=serdeser -Darg1=10 -Darg2=ouptut.txt
Buildfile: /import/linux/home/psachde3/plash_sachdeva_assign5/genericCheckpointing/build.xml

jar:
    [mkdir] Created dir: /import/linux/home/psachde3/plash_sachdeva_assign5/BUILD/jar
      [jar] Building jar: /import/linux/home/psachde3/plash_sachdeva_assign5/BUILD/jar/genericCheckpointing.jar

run:
     [java] 0 mismatched objects

BUILD SUCCESSFUL
Total time: 2 seconds
/import/linux/home/psachde3/plash_sachdeva_assign5/genericCheckpointing$ ant -buildfile build.xml run -Darg0=deser -Darg1=20 -Darg2=ouptut.txt
Buildfile: /import/linux/home/psachde3/plash_sachdeva_assign5/genericCheckpointing/build.xml

jar:

run:
     [java] MyAllTypesFirst:  [ myInt :  2528, myLong :  283498, myString  :  lfdntg, myBoolean  :  true]
     [java] 
     [java] MyAllTypesSecond: [myDoubleT  :  3059.0, myFloatT  :  90524.0, myShortT  :  19852, myCharT  :  e]
     [java] 
     [java] MyAllTypesFirst:  [ myInt :  55111, myLong :  835120, myString  :  plcxux, myBoolean  :  false]
     [java] 
     [java] MyAllTypesSecond: [myDoubleT  :  29985.0, myFloatT  :  23188.0, myShortT  :  16340, myCharT  :  h]
     [java] 
     [java] MyAllTypesFirst:  [ myInt :  24332, myLong :  670372, myString  :  bcnezy, myBoolean  :  true]
     [java] 
     [java] MyAllTypesSecond: [myDoubleT  :  43692.0, myFloatT  :  14048.0, myShortT  :  32279, myCharT  :  t]
     [java] 
     [java] MyAllTypesFirst:  [ myInt :  58761, myLong :  506256, myString  :  thleph, myBoolean  :  false]
     [java] 
     [java] MyAllTypesSecond: [myDoubleT  :  87303.0, myFloatT  :  18072.0, myShortT  :  26546, myCharT  :  b]
     [java] 
     [java] MyAllTypesFirst:  [ myInt :  66236, myLong :  225975, myString  :  qqjdrx, myBoolean  :  true]
     [java] 
     [java] MyAllTypesSecond: [myDoubleT  :  86628.0, myFloatT  :  34662.0, myShortT  :  12176, myCharT  :  u]
     [java] 
     [java] MyAllTypesFirst:  [ myInt :  24259, myLong :  657703, myString  :  prwmqt, myBoolean  :  false]
     [java] 
     [java] MyAllTypesSecond: [myDoubleT  :  76999.0, myFloatT  :  6804.0, myShortT  :  2083, myCharT  :  q]
     [java] 
     [java] MyAllTypesFirst:  [ myInt :  8130, myLong :  454794, myString  :  qbgqvn, myBoolean  :  true]
     [java] 
     [java] MyAllTypesSecond: [myDoubleT  :  1164.0, myFloatT  :  48343.0, myShortT  :  15881, myCharT  :  l]
     [java] 
     [java] MyAllTypesFirst:  [ myInt :  26620, myLong :  431411, myString  :  gzoeje, myBoolean  :  false]
     [java] 
     [java] MyAllTypesSecond: [myDoubleT  :  52858.0, myFloatT  :  23506.0, myShortT  :  2904, myCharT  :  e]
     [java] 
     [java] MyAllTypesFirst:  [ myInt :  27138, myLong :  579274, myString  :  uuypvj, myBoolean  :  true]
     [java] 
     [java] MyAllTypesSecond: [myDoubleT  :  67210.0, myFloatT  :  20894.0, myShortT  :  24089, myCharT  :  a]
     [java] 
     [java] MyAllTypesFirst:  [ myInt :  6445, myLong :  105812, myString  :  khsycj, myBoolean  :  false]
     [java] 
     [java] MyAllTypesSecond: [myDoubleT  :  64556.0, myFloatT  :  91083.0, myShortT  :  32455, myCharT  :  p]
     [java] 

BUILD SUCCESSFUL
Total time: 1 second


DATA STRUTURE USED:

I have used vectors to store and compare objects. 
Vectors can be allocated dynamically, they are synchronized and they default to doubling the size of its array.

TO COMPILE:


/import/linux/home/psachde3/plash_sachdeva_assign5/genericCheckpointing$ ant -buildfile build.xml all

TO RUN:

/import/linux/home/psachde3/plash_sachdeva_assign5/genericCheckpointing$ ant -buildfile build.xml run -Darg0=serdeser -Darg1=20 -Darg2=ouptut.txt
/import/linux/home/psachde3/plash_sachdeva_assign5/genericCheckpointing$ ant -buildfile build.xml run -Darg0=deser -Darg1=20 -Darg2=ouptut.txt


EXTRA CREDIT:

N/A

BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.