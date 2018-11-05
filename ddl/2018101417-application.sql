CREATE TABLE main.application (
	company_name varchar NOT NULL,
	date_applied date NOT NULL,
	application_site varchar NOT NULL,
	process varchar NULL,
	status varchar NOT NULL,
	"type" varchar NOT NULL
)
WITH (
	OIDS=FALSE
) ;
