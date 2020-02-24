drop database cab_booking_service;


create table login(id int auto_increment unique, loginid varchar(25) primary key, emailid varchar(25),
 fullname varchar(25), isadmin boolean default false, mobile long, password varchar(25));


create table  driverdetails(driverid int primary key, drivername varchar(25), rating int(1), city varchar(25),
mobile long);

create table carcategory(categoryid int primary key, categoryname varchar(25), priceperkm double(10,2));


create table cardetails(carid int primary key, carname varchar(25), rating int(1), categoryid int,
foreign key(categoryid) references carcategory(categoryid));

create table tripdetails(tripid int primary key, triporigin varchar(25), tripdestination varchar(25),
 userid int, carid int, driverid int, foreign key (userid) references login(id) on delete cascade,
 foreign key (carid) references cardetails(carid),
 foreign key (driverid) references driverdetails(driverid));

create table paymentdetails(paymentid int primary key, amount double(10,2), discount double(10,2),
userid int, tripid int, driverid int, 
foreign key (userid) references login(id),
foreign key (driverid) references driverdetails(driverid),
 foreign key (tripid) references tripdetails(tripid));

create table offerdetails(offerid int primary key, offerdetails varchar(50), offercode varchar(25));

