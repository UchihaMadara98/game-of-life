println "Hello, this is Hudson calling. This build is running with the below system properties:"
System.properties.each {
    println it
}
