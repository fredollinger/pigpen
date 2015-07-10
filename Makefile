clean:
	rm -f *.class

build:
	javac HelloWorld.java

test:
	java -classpath . HelloWorld
