START TRANSACTION;

DROP TABLE IF EXISTS member, interest_group, event CASCADE;

CREATE TABLE member (
    member_id serial,
    first_name varchar(20) NOT NULL,
    last_name varchar(20) NOT NULL,
    email_address varchar(50) NULL,
    phone_number varchar(10) NULL,
    date_of_birth date NOT NULL,
    email_offers boolean NOT NULL DEFAULT (FALSE),
    CONSTRAINT PK_member PRIMARY KEY(member_id)
);

CREATE TABLE interest_group (
    group_id serial,
    group_name varchar(200) UNIQUE NOT NULL,
    number_of_members int NOT NULL,
    CONSTRAINT PK_interest_group PRIMARY KEY(interest_group),
    CONSTRAINT CK_number_of_members CHECK (number_of_members >= 0)
);

CREATE TABLE event (
    event_id serial,
    event_name varchar(200) UNIQUE NOT NULL,
    description text NOT NULL,
    start_date_and_time DATETIME NOT NULL,
    duration int NOT NULL,
    organizing_group varchar(200) UNIQUE NOT NULL,
    number_of_members int NOT NULL,
    CONSTRAINT PK_event PRIMARY KEY(size_id),
    CONSTRAINT CK_base_price CHECK (duration >= 30)
);

CREATE TABLE group_members (
    member_id int NOT NULL,
    group_id int NOT NULL,
    CONSTRAINT PK_group_members PRIMARY KEY(member_id, group_id),
    CONSTRAINT FK_group_members_member FOREIGN KEY(member_id) REFERENCES member(member_id),
    CONSTRAINT FK_group_members_interest_group FOREIGN KEY(group_id) REFERENCES interest_group(group_id)
);

CREATE TABLE event_members (
    member_id int NOT NULL,
    event_id int NOT NULL,
    CONSTRAINT PK_event_members PRIMARY KEY(member_id, event_id),
    CONSTRAINT FK_event_members_member FOREIGN KEY(member_id) REFERENCES member(member_id),
    CONSTRAINT FK_event_members_event FOREIGN KEY(event_id) REFERENCES event(event_id)
);

INSERT INTO member (first_name, last_name, email_address, phone_number, date_of_birth, email_offers) VALUES ('Ada', 'Lovelace', 'firsttechstartup@steampower.uk', null, 1815/12/10, FALSE);
INSERT INTO member (first_name, last_name, email_address, phone_number, date_of_birth, email_offers) VALUES ('Brad', 'Pitt', 'bradman@hotmale.com', '615-348-2206', 1963/12/18, TRUE);
INSERT INTO member (first_name, last_name, email_address, phone_number, date_of_birth, email_offers) VALUES ('Catherine', 'Romanova', 'thegreatest@empire.ru', '732-447-5904', 1729/05/02, TRUE);
INSERT INTO member (first_name, last_name, email_address, phone_number, date_of_birth, email_offers) VALUES ('Dean', 'Martin', 'thatsamore@speakeasy.smooth', null, 1917/06/07, FALSE);
INSERT INTO member (first_name, last_name, email_address, phone_number, date_of_birth, email_offers) VALUES ('Emma', 'Watson', 'peakedinhighschool@hogwarts.uk', '628-925-1782', 1990/04/15, TRUE);
INSERT INTO member (first_name, last_name, email_address, phone_number, date_of_birth, email_offers) VALUES ('Frank', 'Sinatra', 'ididitmyway@concerthall.classic', null, 1915/12/12, FALSE);
INSERT INTO member (first_name, last_name, email_address, phone_number, date_of_birth, email_offers) VALUES ('Gemma', 'Chan', 'crazyrich@hollywood.net', '738-882-9251', 1982/11/29, TRUE);
INSERT INTO member (first_name, last_name, email_address, phone_number, date_of_birth, email_offers) VALUES ('Hank', 'Green', 'coolscienceguy@gmail.com', '614-883-0318', 1980/05/05, TRUE);

INSERT INTO interest_group (group_name) VALUES ('ScienceBros');
INSERT INTO interest_group (group_name) VALUES ('RichAndCrazy');
INSERT INTO interest_group (group_name) VALUES ('OldSchoolBlues');

INSERT INTO event (event_name, description, start_date_and_time, duration, organizing_group) VALUES ('Steampunk Sharktank', 'Present your business proposals to a panel of angel investors.', 2024/03/25 10:30:00, 120, (SELECT group_name FROM interest_group WHERE group_id = 1));
INSERT INTO event (event_name, description, start_date_and_time, duration, organizing_group) VALUES ('Meet Gala', 'No, we didn\'t misspell Met. We just couldn\'t afford the licencing cost.', 2024/08/05 13:00:00, 300, (SELECT group_name FROM interest_group WHERE group_id = 2));
INSERT INTO event (event_name, description, start_date_and_time, duration, organizing_group) VALUES ('Silent Theatre', 'Rewatch some of Charlie Chaplin\'s greatest movies.', 2024/10/20 16:00:00, 240, (SELECT group_name FROM interest_group WHERE group_id = 3));

INSERT INTO group_members (member_id, group_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'firsttechstartup@steampower.uk'), (SELECT group_id FROM interest_group WHERE group_name = 'ScienceBros'));
INSERT INTO group_members (member_id, group_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'firsttechstartup@steampower.uk'), (SELECT group_id FROM interest_group WHERE group_name = 'OldSchoolBlues'));
INSERT INTO group_members (member_id, group_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'bradman@hotmale.com'), (SELECT group_id FROM interest_group WHERE group_name = 'RichAndCrazy'));
INSERT INTO group_members (member_id, group_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'thegreatest@empire.ru'), (SELECT group_id FROM interest_group WHERE group_name = 'OldSchoolBlues'));
INSERT INTO group_members (member_id, group_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'thegreatest@empire.ru'), (SELECT group_id FROM interest_group WHERE group_name = 'RichAndCrazy'));
INSERT INTO group_members (member_id, group_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'thatsamore@speakeasy.smooth'), (SELECT group_id FROM interest_group WHERE group_name = 'OldSchoolBlues'));
INSERT INTO group_members (member_id, group_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'peakedinhighschool@hogwarts.uk'), (SELECT group_id FROM interest_group WHERE group_name = 'RichAndCrazy'));
INSERT INTO group_members (member_id, group_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'ididitmyway@concerthall.classic'), (SELECT group_id FROM interest_group WHERE group_name = 'OldSchoolBlues'));
INSERT INTO group_members (member_id, group_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'crazyrich@hollywood.net'), (SELECT group_id FROM interest_group WHERE group_name = 'RichAndCrazy'));
INSERT INTO group_members (member_id, group_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'coolscienceguy@gmail.com'), (SELECT group_id FROM interest_group WHERE group_name = 'ScienceBros'));

INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'firsttechstartup@steampower.uk'), (SELECT event_id FROM event WHERE event_name = 'Steampunk Sharktank'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'bradman@hotmale.com'), (SELECT event_id FROM event WHERE event_name = 'Steampunk Sharktank'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'thegreatest@empire.ru'), (SELECT event_id FROM event WHERE event_name = 'Steampunk Sharktank'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'peakedinhighschool@hogwarts.uk'), (SELECT event_id FROM event WHERE event_name = 'Steampunk Sharktank'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'crazyrich@hollywood.net'), (SELECT event_id FROM event WHERE event_name = 'Steampunk Sharktank'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'coolscienceguy@gmail.com'), (SELECT event_id FROM event WHERE event_name = 'Steampunk Sharktank'));

INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'firsttechstartup@steampower.uk'), (SELECT event_id FROM event WHERE event_name = 'Meet Gala'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'bradman@hotmale.com'), (SELECT event_id FROM event WHERE event_name = 'Meet Gala'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'thegreatest@empire.ru'), (SELECT event_id FROM event WHERE event_name = 'Meet Gala'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'thatsamore@speakeasy.smooth'), (SELECT event_id FROM event WHERE event_name = 'Meet Gala'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'peakedinhighschool@hogwarts.uk'), (SELECT event_id FROM event WHERE event_name = 'Meet Gala'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'ididitmyway@concerthall.classic'), (SELECT event_id FROM event WHERE event_name = 'Meet Gala'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'crazyrich@hollywood.net'), (SELECT event_id FROM event WHERE event_name = 'Meet Gala'));

INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'firsttechstartup@steampower.uk'), (SELECT event_id FROM event WHERE event_name = 'Silent Theatre'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'thegreatest@empire.ru'), (SELECT event_id FROM event WHERE event_name = 'Silent Theatre'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'thatsamore@speakeasy.smooth'), (SELECT event_id FROM event WHERE event_name = 'Silent Theatre'));
INSERT INTO event_members (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE email_address = 'ididitmyway@concerthall.classic'), (SELECT event_id FROM event WHERE event_name = 'Silent Theatre'));

UPDATE interest_group SET number_of_members = (SELECT COUNT(member_id) FROM group_members WHERE group_members.group_id = interest_group.group_id);
UPDATE event SET number_of_members = (SELECT COUNT(member_id) FROM event_members WHERE event_members.event_id = event.event_id);

COMMIT;