alter table address drop foreign key FK6jk1v3eoi3wqwvcpsqlsie3uv;
alter table user drop foreign key FKddefmvbrws3hvl5t0hnnsv8ox;
alter table user drop foreign key FK1fl6ut5w9xebf7364dyyq6w5j;
alter table user drop foreign key FKgcjy88ysvwgqo3umk010mjuxv;
alter table user drop foreign key FKej2avcl6cpogh299jyfgtoqs5;
alter table user drop foreign key FKb3msv39y7d4obq9nnmey7okq9;
drop table if exists address;
drop table if exists coordinates;
drop table if exists credit_card;
drop table if exists employment;
drop table if exists subscription;
drop table if exists user;
