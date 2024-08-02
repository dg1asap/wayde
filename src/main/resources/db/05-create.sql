--liquibase formatted sql
--changeset dg1asap:5

CREATE TABLE Agencies
(
    agency_id BIGINT DEFAULT nextval('agency_id_sequence') PRIMARY KEY
);


CREATE TABLE Agency_members
(
    agency_member_id BIGINT DEFAULT nextval('agency_member_id_sequence') PRIMARY KEY
);


CREATE TABLE Marketing_campaigns
(
    marketing_campaign_id BIGINT DEFAULT nextval('marketing_campaign_id_sequence') PRIMARY KEY
);


CREATE TABLE Influencers
(
    influencer_id BIGINT DEFAULT nextval('influencer_id_sequence') PRIMARY KEY
);


CREATE TABLE Agreements
(
    agreement_id BIGINT DEFAULT nextval('agreement_id_sequence') PRIMARY KEY
);


CREATE TABLE AgreementVersions
(
    agreement_version_id BIGINT DEFAULT nextval('agreement_version_id_sequence') PRIMARY KEY
);


CREATE TABLE Notes
(
    note_id BIGINT DEFAULT nextval('note_id_sequence') PRIMARY KEY
);


CREATE TABLE Meetings
(
    meeting_id BIGINT DEFAULT nextval('meeting_id_sequence') PRIMARY KEY
);


CREATE TABLE Actions
(
    action_id BIGINT DEFAULT nextval('action_id_sequence') PRIMARY KEY
);

CREATE TABLE ActionTypes
(
    action_type_id BIGINT DEFAULT nextval('action_type_id_sequence') PRIMARY KEY
);

CREATE TABLE Tasks
(
    task_id BIGINT DEFAULT nextval('task_id_sequence') PRIMARY KEY
);
