CREATE TABLE main.job_posting (
	nucareersid int4 NOT NULL,
	minwage int4 NOT NULL,
	maxwage int4 NOT NULL,
	title varchar(50) NOT NULL,
	company varchar(100) NOT NULL,
	CONSTRAINT job_posting_pkey PRIMARY KEY (nucareersid)
)
WITH (
	OIDS=FALSE
);
