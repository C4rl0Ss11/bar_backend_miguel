INSERT INTO categoria(id, name) VALUES(1, 'Vinos');
INSERT INTO categoria(id, name) VALUES(2, 'Piqueos');
INSERT INTO categoria(id, name) VALUES(3, 'Combos');;

INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(1, 'Vino tinto', 50.00,10, 1);
INSERT INTO producto(id, name, price,stock ,id_categoria) VALUES(2, 'Vino blanco', 60.00,20, 1);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(3, 'Cabernet franc', 70.00,15, 1);
INSERT INTO producto(id, name, price,stock ,id_categoria) VALUES(4, 'Cabernet Sauvignon', 80.00,30, 1);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(5, 'Merlot:', 90.00,40, 1);
INSERT INTO producto(id, name, price,stock ,id_categoria) VALUES(6, 'Pinot Noir', 100.00,60, 1);

INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(7, 'Tequeños', 13.00,18, 2);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(8, 'Alitas BBQ', 18.00,16, 2);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(9, 'Causa x3', 12.50,60, 2);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(10, 'Papas Bravas', 14.99,50, 2);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(11, 'Queso frito con mermelada de ají', 16.00,20, 2);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(12, 'Nachos con guacamole', 10.90,15, 2);

INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(13, 'Arroz Chaufa + 1/8 de pollo + papas', 21.99,15, 3);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(14, 'Alita broaster + papas', 15.00,20, 3);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(15, '2x1 Salchipapas de la casa', 30.90,25, 3);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(16, 'Pizza Pepperoni +  pepsi 500 ml',22.90,80, 3);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(17, 'Parrilla familiar  + Inca Kola 2L', 90.50,5, 3);
INSERT INTO producto(id, name, price,stock, id_categoria) VALUES(18, 'Hamburguesa de carne + coca cola 350ml ', 15.99,35, 3);

INSERT INTO cliente(id,name,last_name,email) VALUES(1, 'Miguel', 'Zare','miguel@gmail.com');
INSERT INTO cliente(id,name,last_name,email) VALUES(2, 'Camila', 'Ocampo','camila@gmail.com');
INSERT INTO cliente(id,name,last_name,email) VALUES(3, 'Amalia', 'Sanchez','amalia@gmail.com');
INSERT INTO cliente(id,name,last_name,email) VALUES(4, 'Pepito', 'Suarez','pepito@gmail.com');
INSERT INTO cliente(id,name,last_name,email) VALUES(5, 'Angel', 'Cruz','angel@gmail.com');
INSERT INTO cliente(id,name,last_name,email) VALUES(6, 'Liberson', 'Chinguel','liberson@gmail.com');

INSERT INTO venta (estado, fecha, id_cliente, id_venta,total) VALUES(1,'2024-08-01',1,1,20.00);
INSERT INTO venta (estado, fecha, id_cliente, id_venta,total)  VALUES(1,'2024-08-01',2,2,60.00);
INSERT INTO venta (estado, fecha, id_cliente, id_venta,total) VALUES(1,'2024-08-01',3,3,50.00);
INSERT INTO venta (estado, fecha, id_cliente, id_venta,total) VALUES(1,'2024-08-01',4,4,200.00);
INSERT INTO venta (estado, fecha, id_cliente, id_venta,total)  VALUES(1,'2024-08-01',5,5,220.00);
INSERT INTO venta (estado, fecha, id_cliente, id_venta,total) VALUES(1,'2024-08-01',6,6,30.00);
