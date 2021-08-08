CREATE TABLE MY_ADDRESSES(
    id BIGINT primary key not null AUTO_INCREMENT,
    city varchar(40),
    street varchar(40) not null,
    postal_code varchar(7)

);

create table USERS_ADDRESSES(
  user_id BIGINT not null,
  address_id BIGINT not null ,
  FOREIGN KEY (user_id) references MY_USERS(id),
  FOREIGN KEY (address_id) references MY_ADDRESSES(id)
);