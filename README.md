<h1 align="center"> Java Portscanner </h1>

<img alt="GitHub" src="https://img.shields.io/github/license/c0ncatenate/java-portscanner?label=license"> <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/c0ncatenate/java-portscanner"> <a href="https://instagram.com/xaash_" target="_blank"> <img alt="Instagram Follow" src="https://img.shields.io/badge/Instagram-xaash__-red?style=flat&logo=instagram&logoColor=white"></a>

This portscanner scans ports 1 to 65535 and tries to determine which of them are open. The ports, if open, are printed on the screen.
 
## TODO
- Add a feature to output results to a file.
- Specify more info about certain ports. (ex. 22 = SSH. 80 = HTTP, 443 = HTTPS)
- Take inputs as both arguments and query.
- Add multi threading to increase scan speed even further.

## Features
- Scans all known ports (can be changed)
- Supports Threading (increased scanning speed)
- Supports both IPs and URLs

## Usage
Make sure you have the Java JDK installed on your PC: https://www.oracle.com/java/technologies/downloads/

1.  Clone the repository:

    `git clone https://www.github.com/c0ncatenate/java-portscanner`
    
2.  Open the Windows/Mac/Linux Terminal in the directory of the cloned repository.
3.  Compile the java file into a class:
    
    `javac Main.java`
    
4. Run the java file after compilation finishes:

    `java Main.java`

