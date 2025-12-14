
The problem with multi threading is we have inconsistency during the execution of the program

say if we have a method run() and we have multple thread for that now the biggest problem with this is inconsistency

-> It voilaes ACID properties
-> it cause dirty read/ write problem in RDBMS

<h3> now this can be solved using synchronisation where multi threading is not allowed, it says that once a thread is running no other thread can get the chance, but it iself could be a problem because if we use parallel ususage of resource then there will be a mismatch in reasource usage.</h3>

see Problem.java for more