all:
	javac HelloJava.java Attribute.java
	mkdir -p com/fredollinger
	mv *.class com/fredollinger

test:
	java -cp . com/fredollinger/HelloJava

clean:
	rm -rvf com/fredollinger
