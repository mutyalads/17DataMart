Machine Reading and ML Modelling and data outsoursing kiosk




## [Machine Reading](https://www.cs.washington.edu/sites/default/files/ai/papers/Poon.pdf)


* End-to-end: the system should input raw text, extract
knowledge, and be able to answer questions and support
other end tasks;
* High quality: the system should extract knowledge with
high accuracy;
* Large-scale: the system should acquire knowledge at Webscale
and be open to arbitrary domains, genres, and languages;
* Maximally autonomous: the system should incur minimal
human effort;
* Continuous learning from experience: the system should
constantly integrate new information sources (e.g., new
text documents) and learn from user questions and feedback
(e.g., via performing end tasks) to continuously improve
its performance.


* Libraries used:

  * algebird
	  * adv data structures (map(1->MAX(1)+(1->Max(2))) => map(1->Max(2)))
	    This PR adds two examples for streaming that use monoids from Twitter's Algebird library:

        HyperLogLog for approximate distinct object counting with low memory overhead
        CountMinSketch for approximating object frequency in a stream as well as TopK or "heavy hitters" estimation
        See https://groups.google.com/forum/?fromgroups=#!topic/spark-users/4ht9ndVaZQY

  * BigDL:
	Intel library for faster deep learning projects on spark comparable to gpu

  * Breeze:
	library for numerical processing. Generic clean and powerful

  * Figario: Statistical relationship learning, markov logic networks
	https://www.cs.washington.edu/sites/default/files/ai/papers/Poon.pdf

  * Factorie:
	natural language processing using factor graphs
    * chalk:
   	natural language processing library

  * SparkML:
	 Machine learning libraries for spark

  * Store haus
     https://index.scala-lang.org/twitter/storehaus/storehaus/0.13.0?target=_2.11

        * kafka
        * redis
        * memcache
        * mysql
        * dynamodb
        * elasticsearch
        * cache
  *  Bijection
       Reversible conversion between types
        https://index.scala-lang.org/twitter/bijection/bijection-algebird/0.5.2?target=_2.10

Streaming and inmemory cache
   * SnappyData
   * Gearpump(akka streaming)

RataTool
 A tool for data sampling and diff tool
    table difference
    data sampling

LuceneRDD
   Each executor as lucene rdd
           used for searches

Dendrites (ACK in smack)
    streaming components in scala for building microservices
        kafka
        akka streams
        actors
        cassandra
        algebird
        avro

