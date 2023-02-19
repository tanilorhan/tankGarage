
select * from "Tank"

delete from "Tank" where "Id" =2

update "Tank" set "UpdateTime"=NOW()::timestamp,"ClassId"=1 where "Id" = 1 ;

--Medium

--tier 5
insert into "Tank" ("Name","Tier","HitPoints","ClassId") values ('Pz.Kpfw. IV Ausf. H',5,'630',1);
insert into "Tank" ("Name","Tier","HitPoints","ClassId") values ('M4A1 Sherman',5,'600',1);
--executed

--tier 6
insert into "Tank" ("Name","Tier","HitPoints","ClassId") values ('M4A3E8 Sherman',6,'900',1);
insert into "Tank" ("Name","Tier","HitPoints","ClassId") values ('T-34-85',6,'810',1);
insert into "Tank" ("Name","Tier","HitPoints","ClassId") values ('Cromwell',6,'840',1);
--executed

--Heavy

--Tier 5
insert into "Tank" ("Name","Tier","HitPoints","ClassId") values ('KV-1',5,'840',2);

--Tier 7
insert into "Tank" ("Name","Tier","HitPoints","ClassId") values ('Tiger 1',7,'1500',2);

--Tier 8
insert into "Tank" ("Name","Tier","HitPoints","ClassId") values ('T32M',8,'1550',2);

--Light
insert into "Tank" ("Name","Tier","HitPoints","ClassId") values ('MT-25',6,'660',3);
insert into "Tank" ("Name","Tier","HitPoints","ClassId") values ('M24 Chaffee',5,'550',3);

--TD
insert into "Tank" ("Name","Tier","HitPoints","ClassId") values ('SU-85',5,'460',4);
insert into "Tank" ("Name","Tier","HitPoints","ClassId") values ('Jagdtiger',9,'2100',4);




