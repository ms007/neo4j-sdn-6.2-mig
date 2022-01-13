# neo4j-sdn-6.2-mig

There are two applications, each comes with a different version of Spring Boot Neo4j

Both applications have the same package structure.

The application under sdn5.2 contains the example source code of the implementation as it was created with OGM

The application under sdn 6.2 shows the problem we face after the migration to 6.2

In order to run through the respective migration issues, each example must first be commented out in both applications.

Then the application under sdn5.2 must be started first in order to create the graph with the sample entities. Then run the application unter 6.2 to show the problem we are running into with the new version.

In the following table the individual problems are described in more detail

| Problem           | Name          | Description                                                                                                                                                                       |
| ----------------- | ------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Infinite fetching | relationships | Remove comments for relationshipsService.process();<br>With version 5.2 the fetching of the related entities stops at depth 1.<br>With version 6.2 every relationship is fetched. |
