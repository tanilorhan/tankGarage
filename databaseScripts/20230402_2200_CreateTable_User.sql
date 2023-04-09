

Create Table "User" (
	"Id"  serial not null,
	"CreateTime" Timestamp default NOW()::timestamp not null,
	"UpdateTime" Timestamp default NOW()::timestamp not null,
	"UpdatedBy" varchar(50) default 'torhan',
	"Deleted" boolean default false not null,
	"Username" varchar(250) not null,
	"Password"  varchar(250) not null,
	 primary key ("Id")
);

drop table "User";

insert into "User" values (1,NOW()::timestamp,NOW()::timestamp,'torhan',false,'torhan','$2a$12$3VAMLeojDngyz13VKIezXeF5dvvPNbZGfAcfsBdqcVV9y7jG3fSwG');

