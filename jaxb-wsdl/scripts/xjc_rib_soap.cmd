SET "JAVA_HOME=C:\Java\jdk1.8.0_144"
SET "PATH=%PATH%;%JAVA_HOME%\bin"

xjc.exe -d src "..\src\main\resources\rib-soap.xsd"


pause