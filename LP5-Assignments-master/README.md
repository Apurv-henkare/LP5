# LP5-Assignments

Assignment 1:

Terminal 1:

javac *.java

rmic AddServerImpl


Terminal 2: 

rmiregistry


Terminal 3: 

java AddServer


Terminal 4: 

java AddClient 127.0.0.1 5 8


Assignment 2:

Terminal 1:

idlj -fall ReverseModule.idl 

javac *.java ReverseModule/ *.java

orbd -ORBInitialPort 1056&

java ReverseServer -ORBInitialPort 1056& -ORB


Terminal 2:
java ReverseClient -ORBInitialPort 1056 -ORBInitialHost localhost


Assignment 3:

Terminal: 


export MPJ_HOME=/home/disha/Downloads/mpj

export PATH=$MPJ_HOME/bin:$PATH

javac -cp $MPJ_HOME/lib/mpj.jar a3.java

$MPJ_HOME/bin/mpjrun.sh -np 4 a3


