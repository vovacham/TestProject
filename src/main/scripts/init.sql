PGDMP         5    	    
        w            test    11.5    11.5     �
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            �
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            �
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            �
           1262    16402    test    DATABASE     �   CREATE DATABASE test WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Russian_Russia.1251' LC_CTYPE = 'Russian_Russia.1251';
    DROP DATABASE test;
             postgres    false            �            1259    16414    tab    TABLE     e   CREATE TABLE public.tab (
    id integer NOT NULL,
    mestype text,
    mes1 text,
    mes2 text
);
    DROP TABLE public.tab;
       public         postgres    false            }
           2606    16421    tab table_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.tab
    ADD CONSTRAINT table_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.tab DROP CONSTRAINT table_pkey;
       public         postgres    false    196           