Design Question: Design A Google Analytic like Backend System. We need to provide Google Analytic like services to our customers. Pls provide a high level solution design for the backend system. Feel free to choose any open source tools as you want.

The system needs to:

-   handle large write volume: Billions write events per day.

-   handle large read/query volume: Millions merchants want to get insight about their business. Read/Query patterns are time-series related metrics.

-   provide metrics to customers with at most one hour delay.

-   run with minimum downtime.

-   have the ability to reprocess historical data in case of bugs in the processing logic.
