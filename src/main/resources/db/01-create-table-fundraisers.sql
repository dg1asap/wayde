--liquibase formatted sql
--changeset dg1asap:1

create table FUNDRAISERS
(
    FUNDRAISER_ID  UUID           not null,
    EVENT_ID       UUID           not null
        constraint FNDR_EVENT_ID_UK
            unique,
    MINIMUM_AMOUNT NUMERIC(20, 2) not null,
    MAXIMUM_AMOUNT NUMERIC(20, 2) not null,
    START_DATE     DATE           not null,
    END_DATE       DATE           not null,
    constraint FNDR_PK
        primary key (FUNDRAISER_ID)
);
