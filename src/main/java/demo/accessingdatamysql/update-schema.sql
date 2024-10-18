CREATE TABLE user
(
    id        INT          NOT NULL,
    user_name VARCHAR(255) NULL,
    email     VARCHAR(255) NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);