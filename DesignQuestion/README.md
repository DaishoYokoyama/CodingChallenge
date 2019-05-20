# Analytic like backend system design

## Requirement

1. handle large write volume: Billions write events per day.

2. handle large read/query volume: Millions merchants want to get insight about their business. Read/Query patterns are time-series related metrics.

3. provide metrics to customers with at most one hour delay.

4. run with minimum downtime.

5. have the ability to reprocess historical data in case of bugs in the processing logic.

## Design

system needs to be scalable so that it can cope with the increase of users.

### Apache Kafka

Use Kafka to respond to sudden load increases.
Kafka is delivered high throughput by performing distributed processing.

### Apache Spark

Use Apache Spark to process data at high speed.

### Open TSDB

Time-series databases should be adopted as it is necessary to read a large amount of time-series data.

### Hadoop (HBase on HDFS)

Distributed processing file system used by DB.
be good at handling a large amount of data.

## Design Overview

![overview](https://github.com/DaishoYokoyama/CodingChallenge/blob/master/DesignQuestion/Design.png)
