
My default advice on how to optimize joins is:
* Use a broadcast join if you can (see this notebook). From your question it seems your tables are large and a broadcast join is not an option.
* Consider using a very large cluster (it's cheaper that you may think). $250 right now (6/2016) buys about 24 hours of 800 cores with 6Tb RAM and many SSDs on the EC2 spot instance market. When thinking about total cost of a big data solution, I find that humans tend to substantially undervalue their time.
* Use the same partitioner. See this question for information on co-grouped joins.
* If the data is huge and/or your clusters cannot grow such that even (3) above leads to OOM, use a two-pass approach. First, re-partition the data and persist using partitioned tables (dataframe.write.partitionBy()). Then, join sub-partitions serially in a loop, "appending" to the same final result table.
    * Side note: I say "appending" above because in production I never use SaveMode.Append. It is not idempotent and that's a dangerous thing. I use SaveMode.Overwrite deep into the subtree of a partitioned table tree structure. Prior to 2.0.0 and 1.6.2 you'll have to delete _SUCCESS or metadata files or dynamic partition discovery will choke.
* Use tachyon
* ?? Partitioning such a way you can have all the partitions on same place
