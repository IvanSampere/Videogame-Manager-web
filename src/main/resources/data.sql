insert into item (id, name, value, type, grievance, weight, type_id) values (2147483645, 'Sword', 100, 'WEAP', 50, 30, 'WEAP')
insert into item (id, name, value, type, armor, weight, type_id) values (2147483643,'Helmet1', 90, 'ARMOR', 150, 20, 'ARMOR')
insert into item (id, name, value, type, armor, weight, type_id) values (2147483644,'Helmet2', 90, 'ARMOR', 150, 20, 'ARMOR')
insert into item (id, name, value, type, armor, weight, type_id) values (2147483646,'Helmet3', 90, 'ARMOR', 150, 20, 'ARMOR')
insert into item (id, name, value, type, quantity, type_id) values (2147483647,'Potion', 25, 'CONS', 5, 'CONS')


insert into hability (id, name, life, energy, type, item) values (2147483643, 'Burn', 10, 2, 'Fire', 2147483645)
insert into hability (id, name, life, energy, type, item) values (2147483640, 'Burn2', 10, 2, 'Fire', 2147483643)
insert into hability (id, name, life, energy, type, item) values (2147483644, 'Freeze', 15, 3, 'Ice', 2147483645)
insert into hability (id, name, life, energy, type, item) values (2147483641, 'Spark', 30, 5, 'Electricity', 2147483643)
insert into hability (id, name, life, energy, type, item) values (2147483642, 'Spark2', 30, 5, 'Electricity', 2147483644)
insert into hability (id, name, life, energy, type, item) values (2147483645, 'Spark3', 30, 5, 'Electricity', 2147483646)
insert into hability (id, name, life, energy, type, item) values (2147483646, 'Sink', 10, 2, 'Water', 2147483647)
insert into hability (id, name, life, energy, type, item) values (2147483647, 'Earthquake', 50, 10, 'Ground', 2147483645)