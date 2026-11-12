CREATE TABLE cuello_user
(
    user_id   BIGINT PRIMARY KEY,
    user_name varchar(255) NOT NULL
);

CREATE SEQUENCE cuello_user_seq START WITH 1 INCREMENT BY 2;

CREATE TABLE cuello_task
(
    task_id          BIGINT PRIMARY KEY,
    task_name        varchar(255) NOT NULL,
    task_desc        text,
    task_created_by  BIGINT       NOT NULL, -- MUST BE CREATED BY AN USER
    task_assigned_to BIGINT,
    task_status      varchar(100) NOT NULL,
    FOREIGN KEY (task_created_by) REFERENCES cuello_user (user_id),
    FOREIGN KEY (task_assigned_to) REFERENCES cuello_user (user_id)
);

CREATE SEQUENCE cuello_task_seq START WITH 1 INCREMENT BY 50;
