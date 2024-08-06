INSERT INTO categoria(id, name) VALUES(1, 'Vinos');
INSERT INTO categoria(id, name) VALUES(2, 'Piqueos');
INSERT INTO categoria(id, name) VALUES(3, 'Tortas');
INSERT INTO categoria(id, name) VALUES(4, 'Infusion');
INSERT INTO categoria(id, name) VALUES(5, 'Combos');
INSERT INTO categoria(id, name) VALUES(6, 'Broaster');

INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(1, 'Vino tinto', 50.00,10, 1);
INSERT INTO producto(id, name, price,stock ,id_categoria) VALUES(2, 'Vino blanco', 60.00,10, 1);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(3, 'Tequeños', 15.00,10, 2);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(4, 'Torta de chocolate', 8.50,10, 3);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(5, 'Té', 5.00,10, 4);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(6, 'Manzanilla', 5.00,10, 4);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(7, 'Chaufa & gaseosa 500ml', 26.00,10, 5);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(8, 'Alita broaster', 16.50,10,  6);

INSERT INTO cliente(id,name,last_name,email) VALUES(1, 'Miguel', 'Zare','miguel@gmail.com');
INSERT INTO cliente(id,name,last_name,email) VALUES(2, 'Camila', 'Ocampo','camila@gmail.com');
INSERT INTO cliente(id,name,last_name,email) VALUES(3, 'Amalia', 'Sanchez','amalia@gmail.com');
INSERT INTO cliente(id,name,last_name,email) VALUES(4, 'Pepito', 'Suarez','pepito@gmail.com');
INSERT INTO cliente(id,name,last_name,email) VALUES(5, 'Angel', 'Cruz','angel@gmail.com');
INSERT INTO cliente(id,name,last_name,email) VALUES(6, 'Liberson', 'Chinguel','liberson@gmail.com');