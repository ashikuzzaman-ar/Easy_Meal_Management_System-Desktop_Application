# Easy Meal Management System #

Easy Meal Management System is a desktop application which is written in Java programming language. Latest version is compiled in JDK 1.8.0_91. To run this application please download the latest JRE from this link http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html and install to your system. 


# What is this #

Easy Meal Management System is a software aimed to reduce the effort of bachelors living outside from family. There have a lot of bachelors and students who live outside from their family. They need to calculate their shopping costs for food service. This is a overhead and sometime it’s a hard task to manage all calculation in one hand. This application is a small effort to create a solution for this task. 


# Download #

To download this application please go to this link: https://drive.google.com/drive/folders/0B81hnwVCMD_gTVl5MlVnemg5RkE . Download the latest version of EMMS and unzip the file. Be careful , don’t delete anything from this extracted folder. 


# Run #

To run this application on, 
**Windows:** Just double click on EMMS.jar file and the application will be launched. If you can write click on this file and can create a shortcut to desktop. You can then launch this application from desktop by clicking this shortcut. 

**Unix/Linux:** Just go to the folder and open terminal. Just type `java -jar EMMS.jar` and press enter. You can also create a desktop entry to run this application from application launcher. To create a desktop entry just follow the steps. 

1. Create a file named **emms.desktop** to `/usr/share/application`  directory.
2. Run this command : `chmod +x emms.dektop` .
3. open the emms.dektop file by typing executing this command `gedit emms.desktop` .
4. Write this lines to the file:
```lua	
    [Desktop Entry]
	Encoding=UTF-8
	Name=Easy Meal Management System
	Comment=The smarter way to manage your meal
	Exec=java -jar [here is the path of your jar file]
	Icon=[Here is the path of your favorite icon for this application]
	Categories=Application;Java
	Version=1.0
	Type=Application
	Terminal=0
```

For any query please drop an email to `ashikuzzaman.ar@gmail.com` 
