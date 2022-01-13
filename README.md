# neo4j-sdn-6.2-mig

There are two applications, each comes with a different version of Spring Boot Neo4j

Both applications have the same package structure.

The application under sdn5.2 contains the example source code of the implementation as it was created with OGM

The application under sdn 6.2 shows the problems or questions we face after the migration to 6.2

In order to run through the respective migration issues, each example must first be commented out in both applications.
Then run the application under sdn5.2 to create the graph with the sample entities.

The cypher script `MATCH (n) RETURN n` shows the created sample graph.

Then run the application under 6.2 to show the issues we are running into with the new version.

Caution: Application sdn5.2 purges the database at startup.

The following table contains details about the topics.

| Topic                    | Name          | Description                                                                                                                                                                                           |
| ------------------------ | ------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Infinite fetching        | relationships | Remove comments for relationshipsService.process();<br>With version 5.2 the fetching of the related entities stops at depth 1.<br>With version 6.2 every relationship is fetched.                     |
| localDateTime precision  | localdatetime | Remove coments for localDateTimeService.process();<br>With version 5.2 a different precision is persisted and loading with 6.2 throws an mapping exception                                            |
| projection best practice | projection    | Remove coments for projectionService.process();<br>With 6.2 root entity must be loaded in query. <br>Question: Is migration correct? Are there best practices? Why should projection be an interface? |
