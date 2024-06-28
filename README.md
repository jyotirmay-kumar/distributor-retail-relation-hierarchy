# distributor-retail-relation-hierarchy
Project to establish relationship between distributor and retailer, and to maintain distributor hierarchy


- distributor-retail-event-subscriber
Writes the message from the event to database tables.

- distributor-aggregation-scheduler
Publishes event for all distributors whose relationship with the retailers have been changed.

- distributor-retail-relation-cache-manager
Update the relation for each distributor in cache for faster retrieval. 
