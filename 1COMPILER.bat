@echo off
Title Compiler
:build
"C:\Program Files (x86)\java\jdk1.7.0_45\bin\javac.exe" -d ./locandclass ./Javafiles/*.java ./Javafiles/sign/*.java
pause
goto :build