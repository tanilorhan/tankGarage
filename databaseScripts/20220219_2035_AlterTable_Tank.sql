


ALTER TABLE "Tank" 
DROP COLUMN "Type";

ALTER TABLE "Tank" Add column "ClassId" bigint;

ALTER TABLE "Tank" add constraint fk_type_id foreign key ("ClassId") references "TankClass" ("Id");

ALTER TABLE "Tank" add constraint "Tank_Name_Unique" Unique ("Name");

