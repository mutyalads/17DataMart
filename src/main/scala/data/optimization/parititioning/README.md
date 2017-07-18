## Advanced Partitioning

* Partition the source use hash partitions or range partitions or you can write custom partitions if you know better about the joining fields.
* Partition will help to avoid repartition during joins as spark data from same partition across tables will exist in same location. ORC will definitely help the cause.
* IF this is still causing spill, try using tachyon which will be faster than disk