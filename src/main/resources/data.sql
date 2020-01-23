INSERT INTO users VALUES('user','pass',true);
INSERT INTO users VALUES('admin','pass',true);
INSERT INTO users VALUES('peter','secret',true);

INSERT INTO authorities VALUES('user','ROLE_USER');
INSERT INTO authorities VALUES('admin','ROLE_ADMIN');
INSERT INTO authorities VALUES('peter','ROLE_ADMIN');