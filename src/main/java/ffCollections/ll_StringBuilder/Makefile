NAME=Test

VERSION =
JAVAC = javac${VERSION}

JAVA = java${VERSION}
AVIEWER = appletviewer${VERSION}

JAVADOC=javadoc${VERSION}

default:
	${JAVAC} ${NAME}.java
	time ${JAVA} ${NAME}


applet:
	${JAVAC} ${NAME}.java
	${AVIEWER} ${NAME}.html


doc:
	- rm -r html
	mkdir html
	${JAVADOC} *.java

