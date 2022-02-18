Welcome to *FileHandling*

1.) Create a File 

This program is creating a file, telling the user if there is already a folder with the same name and catches other data that occurs in the drive-log with the keyword *catch*


-choose a working path for your new file /Users/master/Desktop/Filename

-Execute 
-System Output: File created: Filename
//With Execute the file gets created
-Execute
-System Output: File already exists.
//The System tells you if there is already a folder with the same name.

-If any other data occurs in the drive-log it will be handled with catch

2.) Get the "File Information"

With this program you are able to display informations about any file by implementing the File name in the working path. 

After executing the program is checking if the File exists and will display 
the Name, the Absolute Path, if the File is writable and readable and what's the exact file size. 

- ("/User/master/Desktop/Filename")
-Execute
-Systemoutput: 	First name: "Filename"
		Absolute path: "/User/master/Desktop/Filename"
		Writable: true "(if writable/ false if not writable)"
		Readable: true "(if readable/ false if not readable)"
		File size in bytes: "20"

3.) Read from a File

With this Program you can read in any File by choosing the working path and entering the Filename. 

-If any other data occurs in the drive-log it will be handled with catch and output an error.

4.) Write to a File

With this Program you write direct into the File by choosing the working path and entering the Filename. 

Whatever you write in the field ("I like Java Fun") will be written in the selected .txt-folder. 

-If any other data occurs in the drive-log it will be handled with catch and output an error.
		