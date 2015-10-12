NAME=Test

VERSION =
JAVAC = javac${VERSION}

JAVA = java${VERSION}
AVIEWER = appletviewer${VERSION}

JAVADOC=javadoc${VERSION}

default:
	${JAVAC} ${NAME}.java
	cd ../.. ; ${JAVA} -cp . ff_collections/gg_SortTest/${NAME} this is a very good joke aa aaa aa0


applet:
	${JAVAC} ${NAME}.java
	${AVIEWER} ${NAME}.html


doc:
	- rm -r html
	mkdir html
	${JAVADOC} *.java

