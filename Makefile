APP=StatsGenerater

all:
	javac $(APP).java AttributePicker.java
	mkdir -p com/fredollinger
	mv *.class com/fredollinger

test:
	java -cp . com/fredollinger/$(APP)

clean:
	rm -rvf com/fredollinger
