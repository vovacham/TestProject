CREATE TABLE public.tab
(
    id integer NOT NULL,
    mestype text COLLATE pg_catalog."default",
    mes1 text COLLATE pg_catalog."default",
    mes2 text COLLATE pg_catalog."default",
    CONSTRAINT table_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.tab
    OWNER to postgres;