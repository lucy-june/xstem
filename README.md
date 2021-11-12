# Development Environment Setup

## Coding
- Install jdk8 https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html and configure JAVA_HOME and PATH environment variables.
- Install eclipse java EE: https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2018-12/R/eclipse-jee-2018-12-R-win32-x86_64.zip
- Import the project: Open eclipse > File > Import >  Maven > Existing Maven Projects, then choose this project folder and click "Finish".
- To run the project, find the "Application.java", right click Run As > Run Configurations > Arguments > VM Arguments, add "-Dspring.profiles.active=production" so as to run in prod mode with the parameters in "src/main/resources/application-production.properties  -Dserver.port=8081". If successful, the last line of the console will print "Started Application in *** seconds (JVM running for ***)"
- To check web page, open http://localhost:8081. The page has three different mode: Candidate mode(username:w1@qq.com, pwd:123), HR mode(username:hr@qq.com, pwd:123), Manager mode(username:mg1@qq.com, pwd:123)


## Database
- Install postgresql 9.6 database: https://content-www.enterprisedb.com/postgresql-tutorial-resources-training?cid=71
- Install pgAdmin4 client UI: https://ftp.postgresql.org/pub/pgadmin/pgadmin4/v6.1/windows/pgadmin4-6.1-x64.exe, we can use this tool to restore and bootstrap the demo data. Use pgAdmin4 setup the db connection with host:localhost, port:5432, database:stm, username:ss1604c195, password=7a940306. Make sure the user is the owner of the db. Create a db schema "ss1604c195_rd2", right click it to restore and bootstrap data from the latest "src\main\resources\script\bak_pgadmin_*.backup". Alternatively, You can also run the sqls to restore the schema and data, make sure you run the "reset.sql" first and then run the "bak_*.sql"
- After we restore db structure, we can use JOOQ reverse-engine to generate the DB model code with the following command: cd to project's folder, run $ generate。cmd


# Others

## Production Mode

At first, copy `src/main/resources/application-production.properties.example` to `src/main/resources/application-production.properties` and fill in your production database information.

But specifying `-Dspring.profiles.active=production` as VM options, such as what the `Procfile` does, the application will start up under production mode.

## Package & Submit

Run `mvnw assembly:single` (or `mvnw.cmd` in Windows) to package the bundle, and then submit the zip file generated in `target` through STM web system.

Hint: you can use `mvnw` instead of `mvn` during your development. `mvnw` will download and install maven automatically so you don't need to do it.

## Cautions

1. The submitted content should follow [Heroku Standard](https://devcenter.heroku.com/articles/getting-started-with-java#define-a-procfile),
`Procfile` must exist to describe how to run the application. You may need to change the jar file name in `Procfile` if you change application name or version.
2. Your applications will be deployed by STM web system using **Heroku Java Buildpack**.
3. `src/assembly/bundle.xml` describe the content of the zip bundle. If you add files which are required to run your application, you need to add them in it.
4. You **must** use production database in deployed application.
