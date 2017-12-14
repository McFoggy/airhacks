#!/usr/bin/jjs -fv --language=es6
const cmd = "mvn clean install"
const output = (msg) => print(`Output: ${msg}`);
output('starting mvn');
const System = Java.type("java.lang.System");
$EXEC(cmd, System.in, System.out, System.err);