--
-- PostgreSQL database dump
--

-- Dumped from database version 14.5
-- Dumped by pg_dump version 14.5

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: sc_evaluacion; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA sc_evaluacion;


ALTER SCHEMA sc_evaluacion OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: eva_cat_evaluacion; Type: TABLE; Schema: sc_evaluacion; Owner: postgres
--

CREATE TABLE sc_evaluacion.eva_cat_evaluacion (
    cod_evaluacion character varying(50) NOT NULL,
    desc_evaluacion character varying(50) NOT NULL
);


ALTER TABLE sc_evaluacion.eva_cat_evaluacion OWNER TO postgres;

--
-- Name: eva_tch_notas_evaluacion; Type: TABLE; Schema: sc_evaluacion; Owner: postgres
--

CREATE TABLE sc_evaluacion.eva_tch_notas_evaluacion (
    id_nota_evaluacion integer NOT NULL,
    cod_alumno character varying(100) NOT NULL,
    cod_evaluacion character varying(50) NOT NULL,
    md_fch timestamp without time zone,
    md_uuid character varying(50),
    nota_evaluacion integer NOT NULL,
    evaluacion_cod_evaluacion character varying(50)
);


ALTER TABLE sc_evaluacion.eva_tch_notas_evaluacion OWNER TO postgres;

--
-- Name: eva_tch_notas_evaluacion_id_nota_evaluacion_seq; Type: SEQUENCE; Schema: sc_evaluacion; Owner: postgres
--

CREATE SEQUENCE sc_evaluacion.eva_tch_notas_evaluacion_id_nota_evaluacion_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sc_evaluacion.eva_tch_notas_evaluacion_id_nota_evaluacion_seq OWNER TO postgres;

--
-- Name: eva_tch_notas_evaluacion_id_nota_evaluacion_seq; Type: SEQUENCE OWNED BY; Schema: sc_evaluacion; Owner: postgres
--

ALTER SEQUENCE sc_evaluacion.eva_tch_notas_evaluacion_id_nota_evaluacion_seq OWNED BY sc_evaluacion.eva_tch_notas_evaluacion.id_nota_evaluacion;


--
-- Name: eva_tch_notas_evaluacion id_nota_evaluacion; Type: DEFAULT; Schema: sc_evaluacion; Owner: postgres
--

ALTER TABLE ONLY sc_evaluacion.eva_tch_notas_evaluacion ALTER COLUMN id_nota_evaluacion SET DEFAULT nextval('sc_evaluacion.eva_tch_notas_evaluacion_id_nota_evaluacion_seq'::regclass);


--
-- Data for Name: eva_cat_evaluacion; Type: TABLE DATA; Schema: sc_evaluacion; Owner: postgres
--

INSERT INTO sc_evaluacion.eva_cat_evaluacion VALUES ('PR', 'Primera Evaluación');
INSERT INTO sc_evaluacion.eva_cat_evaluacion VALUES ('SG', 'Segunda Evaluación');
INSERT INTO sc_evaluacion.eva_cat_evaluacion VALUES ('TC', 'Tercera Evaluación');


--
-- Data for Name: eva_tch_notas_evaluacion; Type: TABLE DATA; Schema: sc_evaluacion; Owner: postgres
--

INSERT INTO sc_evaluacion.eva_tch_notas_evaluacion VALUES (1, 'alumno-1', 'PR', NULL, NULL, 5, NULL);
INSERT INTO sc_evaluacion.eva_tch_notas_evaluacion VALUES (2, 'alumno-2', 'SG', NULL, NULL, 7, NULL);
INSERT INTO sc_evaluacion.eva_tch_notas_evaluacion VALUES (3, 'alumno-3', 'TC', NULL, NULL, 9, NULL);


--
-- Name: eva_tch_notas_evaluacion_id_nota_evaluacion_seq; Type: SEQUENCE SET; Schema: sc_evaluacion; Owner: postgres
--

SELECT pg_catalog.setval('sc_evaluacion.eva_tch_notas_evaluacion_id_nota_evaluacion_seq', 3, true);


--
-- Name: eva_cat_evaluacion eva_cat_evaluacion_pkey; Type: CONSTRAINT; Schema: sc_evaluacion; Owner: postgres
--

ALTER TABLE ONLY sc_evaluacion.eva_cat_evaluacion
    ADD CONSTRAINT eva_cat_evaluacion_pkey PRIMARY KEY (cod_evaluacion);


--
-- Name: eva_tch_notas_evaluacion eva_tch_notas_evaluacion_pkey; Type: CONSTRAINT; Schema: sc_evaluacion; Owner: postgres
--

ALTER TABLE ONLY sc_evaluacion.eva_tch_notas_evaluacion
    ADD CONSTRAINT eva_tch_notas_evaluacion_pkey PRIMARY KEY (id_nota_evaluacion);


--
-- Name: eva_tch_notas_evaluacion uk_9fdg9dmjsaku7twvrs49ablni; Type: CONSTRAINT; Schema: sc_evaluacion; Owner: postgres
--

ALTER TABLE ONLY sc_evaluacion.eva_tch_notas_evaluacion
    ADD CONSTRAINT uk_9fdg9dmjsaku7twvrs49ablni UNIQUE (cod_evaluacion);


--
-- Name: eva_tch_notas_evaluacion fkrp66ej86kq5ma68gbwrjs9k7d; Type: FK CONSTRAINT; Schema: sc_evaluacion; Owner: postgres
--

ALTER TABLE ONLY sc_evaluacion.eva_tch_notas_evaluacion
    ADD CONSTRAINT fkrp66ej86kq5ma68gbwrjs9k7d FOREIGN KEY (evaluacion_cod_evaluacion) REFERENCES sc_evaluacion.eva_cat_evaluacion(cod_evaluacion);


--
-- PostgreSQL database dump complete
--

