CREATE TABLE DISTRIBUTOR (
    DISTRIBUTOR_ID VARCHAR2(100 CHAR),
    DISTRIBUTOR_NAME VARCHAR2(100 CHAR),
    DISTRIBUTOR_HIERARCHY CLOB,
    REGION VARCHAR2(100 CHAR),
    EVENT_STATUS VARCHAR2(100 CHAR),
    CREATED_ON TIMESTAMP (6) DEFAULT SYSTIMESTAMP,
    UPDATED_ON TIMESTAMP (6) DEFAULT SYSTIMESTAMP
);

CREATE TABLE RETAILER (
    RETAILER_ID VARCHAR2(100 CHAR),
    RETAILER_NAME VARCHAR2(100 CHAR),
    DIRECT_DISTRIBUTOR VARCHAR2(100 CHAR),
    LINKED_DISTRIBUTORS CLOB,
    REGION VARCHAR2(100 CHAR),
    EVENT_TYPE VARCHAR2(100 CHAR),
    OPERATION_TYPE VARCHAR2(100 CHAR),
    EVENT_STATUS VARCHAR2(100 CHAR),
    CREATED_ON TIMESTAMP (6) DEFAULT SYSTIMESTAMP,
    UPDATED_ON TIMESTAMP (6) DEFAULT SYSTIMESTAMP
);