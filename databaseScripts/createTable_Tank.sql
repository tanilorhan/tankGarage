

Create Table "Tank" (
	"Id"  serial not null,
	"CreateTime" Timestamp default NOW()::timestamp not null,
	"UpdateTime" Timestamp default NOW()::timestamp not null,
	"UpdatedBy" varchar(50) default 'torhan',
	"Deleted" boolean default false not null,
	"Name" varchar(250) not null,
	"Type"  varchar(50) not null,
	"Tier" int not null,
	"HitPoints" int not null,
	 primary key ("Id")
)

