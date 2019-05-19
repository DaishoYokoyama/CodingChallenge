# Analytic like backend system design

## Requirement

  1) handle large write volume: Billions write events per day.
	
  2) handle large read/query volume: Millions merchants want to get insight about their business. Read/Query patterns are time-series related metrics. 
	
  3) provide metrics to customers with at most one hour delay.	
 
  4) run with minimum downtime.

  5) have the ability to reprocess historical data in case of bugs in the processing logic.

## Design
  1) 
