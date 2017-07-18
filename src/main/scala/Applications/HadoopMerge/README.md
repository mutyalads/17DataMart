## Hadoop merge DE(extract)+d(qality)+visualisation+scheduler+streaming+query+Webservice


Akka actors and microservices model:
Kubernetes

    model:
        web table crawler model
            table model
            transformations model
            usage model
            datadictionary model
        input storage models
            hdfs/tachyon
            kafka/Kinesis
            sqoop/specific extracts
            csvfiles
        output storage models
            spark Memory
            kafka/Kinesis
            file location
            web service
            Hbase/Cassandra
            Elasticsearch/KibanaQueries and PageLink/WebService
            Mysql/Teradata/Oracle

   view:
       Graphql request/response

   Controller:
        Calculation:
            user defined functions pluggable scala code, python , R code
            sql using multiple queries
            Incache and querying using webservice
        Machine Reading:
            Ai of understanding table transformations using sql parsing
            Intelligent schema recognition over multiple databases
   Streaming Task:
            All jobs are of repeating in nature
                All tasks are of part data (partitioned by timestamp)
   Scheduler:
            When to start a task (time or location or jobid or taskid)
            When to start a job


Visualisation:
    Table DAG(Graph) visualisation
    Time predictions
    Resources cost prediction
    Scheduling status and killing jobs and sample data
    UserDefined functions

    Frontend:
        GraphQL
        scala.js
        React.js
        D3.js


sparkContext Provider:
    sc + python + scala + r

I/O provider: @insertTime
    hdfs + mysql + hbase +

SparkCache handler:
    destroy all
    up all
    query all
    backup (tachyon or in memory)

Advanced:
    SQOOP Handling
    Hbase Handling
    DynamoDB
    Kinesis

