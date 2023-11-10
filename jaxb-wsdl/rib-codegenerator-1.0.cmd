@ECHO ON
@SET "JAVA_HOME=%JAVA_HOME%"
@SET "CLASSPATH=%~dp0*;%~dp0lib\*"
REM "%JAVA_HOME%\bin\java" -cp "%CLASSPATH%" de.dotnet.services.gaebsrv.CodeGenerator "C:\Users\10170328\git\dotnet-tutorials\jaxb-wsdl\src\main\resources\230921_rib.wsdl" "C:\Users\10170328\git\dotnet-tutorials\jaxb-wsdl"
"%JAVA_HOME%\bin\java" -cp "%CLASSPATH%" de.dotnet.services.gaebsrv.CodeGenerator
pause