--liquibase formatted sql
--changeset dg1asap:2

CREATE TABLE Users
(
    user_id BIGINT DEFAULT nextval('user_id_sequence') PRIMARY KEY,
    name VARCHAR(50) not null
);
