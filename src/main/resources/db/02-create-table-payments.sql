--liquibase formatted sql
--changeset dg1asap:2

create table PAYMENTS
(
    PAYMENT_ID      UUID                   not null,
    FUNDRAISER_ID   UUID                   not null,
    STIPE_CHARGE_ID CHARACTER VARYING(200) not null
        constraint PMNT_STIPE_CHARGE_ID_UK
            unique,
    PAYER           UUID                   not null,
    EVENT_ID        UUID                   not null,
    AMOUNT          NUMERIC(20, 2)         not null,
    CURRENCY        CHARACTER VARYING(5)   not null,
    STATUS          CHARACTER VARYING      not null,
    DESCRIPTION     CHARACTER VARYING(2000),
    constraint PMNT_PK
        primary key (PAYMENT_ID),
    constraint PMNT_FUNDRAISER_ID_FK
        foreign key (FUNDRAISER_ID) references FUNDRAISERS
);
