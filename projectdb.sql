----------movie----------
create table Movie(movie_name varchar(20)not null,
Movie_id number,
movie_type varchar2(30)not null,
price number,
constraint movie_id primary key(movie_d));


------theatre information------
create table theatre(theatre_name varchar(30),
theatre_id number,
    number_seats number,
    theatre_address varchar2(40) not null,
    theatre_rating number,
    constraint theatre_uq unique(theatre_name,theatre_id),
    constraint theatre_id primary key (theatre_id));


--------movie theatre---------
create table movie_theatre(movie_id number not null,
        theatre_id number not null,
        active number default 1,
        movie_timing varchar2(20),
        constraint theatre_id_fk foreign key (theatre_id) references theatre (theatre_id),
        constraint movie_id_fk foreign key (movie_id) references movie (movie_id));
        
        
--------user details-------------
create table user_details(user_name varchar2(30) not null ,
email_id varchar2(30) not null,
epassword VARCHAR2(18) not null,
mobile_num number not null,
gender varchar(20) not null,
constraint user_uq unique(email_id,mobile_num),
constraint user_pk primary key(user_id));


-------booking details------------
create table booking_detail( booking_id number not null,
user_id number not null,
booked_seats number not null,
amount number,
booking_status varchar2(50)not null,
seat_type varchar2(20),
payment_status VARCHAR2(20),
constraint users_id_fk foreign key(users_id) references users(user_id));



        
