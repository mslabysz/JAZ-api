create table address (coordinates_id integer, id integer not null, city varchar(255), country varchar(255), state varchar(255), street_address varchar(255), street_name varchar(255), zip_code varchar(255), primary key (id)) engine=InnoDB;
create table coordinates (id integer not null, lat float(53) not null, lng float(53) not null, primary key (id)) engine=InnoDB;
create table credit_card (id integer not null, cc_number varchar(255), primary key (id)) engine=InnoDB;
create table employment (id integer not null, key_skill varchar(255), title varchar(255), primary key (id)) engine=InnoDB;
create table subscription (id integer not null, payment_method varchar(255), plan varchar(255), status varchar(255), term varchar(255), primary key (id)) engine=InnoDB;
create table user (address_id integer, coordinates_id integer, credit_card_id integer, employment_id integer, id integer not null, subscription_id integer, avatar varchar(255), date_of_birth varchar(255), email varchar(255), first_name varchar(255), gender varchar(255), last_name varchar(255), phone_number varchar(255), social_insurance_number varchar(255), uid varchar(255), username varchar(255), primary key (id)) engine=InnoDB;
alter table address add constraint UK_t53ge4jlr6f4oykuqateowb3r unique (coordinates_id);
alter table user add constraint UK_dhlcfg8h1drrgu0irs1ro3ohb unique (address_id);
alter table user add constraint UK_iop7x4xefax6yieeb43ulyubq unique (coordinates_id);
alter table user add constraint UK_tb0ux6oqvfcj4grky8ptq2e21 unique (credit_card_id);
alter table user add constraint UK_mfs53csvy1p3nw8io347h1rqx unique (employment_id);
alter table user add constraint UK_ohv44mvnywk6egq8fokpjhj15 unique (subscription_id);
alter table address add constraint FK6jk1v3eoi3wqwvcpsqlsie3uv foreign key (coordinates_id) references coordinates (id);
alter table user add constraint FKddefmvbrws3hvl5t0hnnsv8ox foreign key (address_id) references address (id);
alter table user add constraint FK1fl6ut5w9xebf7364dyyq6w5j foreign key (coordinates_id) references coordinates (id);
alter table user add constraint FKgcjy88ysvwgqo3umk010mjuxv foreign key (credit_card_id) references credit_card (id);
alter table user add constraint FKej2avcl6cpogh299jyfgtoqs5 foreign key (employment_id) references employment (id);
alter table user add constraint FKb3msv39y7d4obq9nnmey7okq9 foreign key (subscription_id) references subscription (id);