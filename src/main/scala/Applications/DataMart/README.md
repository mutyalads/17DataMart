## Data Mart

* DSL columunar transformations (functions and higher order functions)
    * Machine Learning models as a transformation function
    * Automatic logging of stages for each job and workflow to elastic search
* DSL for table joins
    * Between File locations and tables
    * Can be cached and compressed
    * Monitoring cache df scope, job failure and reporting
    * Can be appended to
        * Cassandra
        * Hive (external table only partitioned)
        * ElasticSearch
        * Kafka
* DSL for scheduling of these joins (watch rate, on failure watch rate)
    * On availablity of data
    * On schedule (similar to crontab)
    * On function true (crontab+availability)
        * machine learning model regression condition
    * Next value generator using function
        * Machine learning regression
        * I/O file location
* DSL for data ingest details
    * Kafka
    * HDFS
    * Sqoop
* Data types are Int and Indexes of Strings and String
    * Cassandra has the data type and values for categorical data
        * Hash Map the values
        * Easier for placing the values
        * note: </> on categorical data should not work, if normalization is ordered by frequency
    * Start and End string lengths are stored, Before all the strings
* Auto JOINS
    * Partitioner
    * Broadcast join
    * Join splitter


