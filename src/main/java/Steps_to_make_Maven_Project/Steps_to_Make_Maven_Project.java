//--Step 1:
//--File > New > Other > Maven --- Maven Project > Next
//--in the filter section type maven-archetype-quickstart
//--Select version 1.4
//
//--Step 2:
//--fill the GroupID - com.projectname.functionality
//--artifactID - name of the maven Project
//--Click on Finish
//
//--Step 3: 
//--Wait till you see Y: :___ in your output console
//--Enter Y and hit the enter button
//--You will see Build Success
//
//--Step 4:
//--In Eclipse on the left hand side the Maven Project will show up
//--Expand the Maven Project
//--you see src/main/java
//--        src/test/java
//
//--         pom.xml file
//
//--delete the default packages created inside src/main/java and src/test/java
//--WARNING: Do not delete the src/main/java or src/test/java. just delete the packages inside
//
//--Step 5:
//--open pom.xml file
//--<properties> tag change it to 17 at both the places. Save it (Ctrl+S)
//--open mvnrepository.com and type selenium-java
//--copy the latest selenium-java 4.16.1 dependency and carefully paste within the <dependencies> tag
//
//
//--Step 6
//--Right click on maven project > Maven > Update Project > Select the checkbox force update of snapshots/releases and click on OK
