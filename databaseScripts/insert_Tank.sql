
insert into public."Tank" ("Name","Type","Tier","HitPoints") values ('t34','Medium',5,660);

 select
        t1_0."Id",
        t1_0."CreateTime",
        t1_0."Deleted",
        t1_0."HitPoints",
        t1_0."Name",
        t1_0."Tier",
        t1_0."Type",
        t1_0."UpdateTime",
        t1_0."UpdatedBy" 
    from
        "Tank" t1_0