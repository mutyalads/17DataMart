## Data Mart

* Database has columunar transformations (functions and higher order functions)
    * Machine Learning models as a transformation
* Database has table joins
    * Between File locations and tables
    * Can be cached and compressed
    * Can be appended to
        * cassandra
        * hive (external table only partitioned)
        * elasticsearch
        * kafka
* Database has scheduling of these joins (watch rate, on failure watch rate)
    * On availablity of data
    * On schedule (similar to crontab)
    * On function true (crontab+availability)
        * machine learning model regression condition
    * next value generator using function
* Database has data ingest details (Store haus)
     https://index.scala-lang.org/twitter/storehaus/storehaus/0.13.0?target=_2.11
        * kafka
        * redis
        * memcache
        * mysql
        * dynamodb
        * elasticsearch
        * cache


* Data types are Int and Indexes of Strings and String (Bijection)
    * Cassandra has the data type and values for categorical data
        * Hash Map the values
        * Easier for placing the values
        * note: < > on categorical data should not work if ordered by frequency
    * Start and End string lengths are stored, Before all the strings
          *  Bijection
               Reversible conversion between types
                https://index.scala-lang.org/twitter/bijection/bijection-algebird/0.5.2?target=_2.10

* Auto JOINS
    Partitioner
    Broadcast join
    Join splitter


* RataTool
 A tool for data sampling and diff tool
    table difference
    data sampling


Streaming and inmemory cache
   * SnappyData
   * Gearpump(akka streaming)

LuceneRDD
   Each executor as a lucene rdd
           used for searches

Dendrites (ACK in smack)
    streaming components in scala for building microservices
        kafka
        akka streams
        actors
        cassandra
        algebird
        avro
