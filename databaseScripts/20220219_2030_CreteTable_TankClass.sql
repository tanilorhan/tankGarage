


Create Table "TankClass" (
"Id" bigint UNIQUE not null,
"CreateTime" Timestamp default NOW()::timestamp not null,
"UpdateTime" Timestamp default NOW()::timestamp not null,
"UpdatedBy" varchar(50) default 'torhan',
"Deleted" boolean default false not null,
"Name" varchar(250) not null,
"ClassFeaturesSummary" varchar(2500)
);

Alter table "TankClass" ADD PRIMARY KEY ("Id");