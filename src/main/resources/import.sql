
INSERT INTO regiones (id, nombre) VALUES (1, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Suramérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (id, nombre, apellido, email, fecha, imagen, region_id) VALUES (1, 'Dennis', 'Ritchie', 'dritchie@gmail.com', '2023-03-01', NULL, 1);
INSERT INTO clientes (id, nombre, apellido, email, fecha, imagen, region_id) VALUES (2, 'Bjarne', 'Stroustrup', 'bstroustrup@gmail.com', '2023-03-01', NULL, 4);
INSERT INTO clientes (id, nombre, apellido, email, fecha, imagen, region_id) VALUES (3, 'James', 'Gosling', 'jgosling@gmail.com', '2023-03-01', NULL, 1);
INSERT INTO clientes (id, nombre, apellido, email, fecha, imagen, region_id) VALUES (4, 'Anders', 'Anders', 'hejlsberg@gmail.com', '2023-03-01', NULL, 1);
INSERT INTO clientes (id, nombre, apellido, email, fecha, imagen, region_id) VALUES (5, 'Guido', 'Van Rossum', 'gvrossum@gmail.com', '2023-03-01', NULL, 4);
INSERT INTO clientes (id, nombre, apellido, email, fecha, imagen, region_id) VALUES (6, 'Rasmus', 'Lerdof', 'rlerdorf@gmail.com', '2023-03-01', NULL, 4);
INSERT INTO clientes (id, nombre, apellido, email, fecha, imagen, region_id) VALUES (7, 'Brendan', 'Eich', 'beich@gmail.com', '2023-03-01', NULL, 4);
INSERT INTO clientes (id, nombre, apellido, email, fecha, imagen, region_id) VALUES (8, 'Yukihiro', 'Matsumoto', 'ymatsumoto@gmail.com', '2023-03-01', NULL, 5);
INSERT INTO clientes (id, nombre, apellido, email, fecha, imagen, region_id) VALUES (9, 'Linus', 'Torvals', 'ltorvals@gmail.com', '2023-03-01', NULL, 4);
INSERT INTO clientes (id, nombre, apellido, email, fecha, imagen, region_id) VALUES (10, 'Frederick', 'Kottler', 'fdxdesarrollos@gmail.com', '2023-03-01', NULL, 1);
INSERT INTO clientes (id, nombre, apellido, email, fecha, imagen, region_id) VALUES (11, 'John', 'Doe', 'john.doe@gmail.com', '2023-03-05', NULL, 3);
INSERT INTO clientes (id, nombre, apellido, email, fecha, imagen, region_id) VALUES (12, 'Andrés José', 'Guzmán', 'ajguzman@gmail.com', '2023-03-05', NULL, 3);

INSERT INTO usuarios (id, username, password, enabled, nombre, apellido, email) VALUES (1,'andres','$2a$10$.kQg8enDOl4wPKnm8lr6U.u.UZHdJ01Czx.CFM6yn9S6sBAtkL7P6',1, 'XXXXXXXX', 'WWWWWWWW', 'xxx.www@gmail.com');
INSERT INTO usuarios (id, username, password, enabled, nombre, apellido, email) VALUES (2,'admin','$2a$10$shru64A1oDPr38bZ04snbOBB7AjXlh6gOxhxXxwVkl99N.Ycj6jga',1, 'AAAAAAAAAA', 'BBBBBBBBBB', 'aaa.bbb@gmail.com');
INSERT INTO usuarios (id, username, password, enabled, nombre, apellido, email) VALUES (3,'gabriel','$2a$10$2zPCj95xiguFGrMT/cKaROCAcGcViXuxZDbDGtR19KGZWFHK0E1sW',1, 'GGGGGGGG', 'HHHHHHHH', 'ggg.hhh@gmail.com');

INSERT INTO perfiles (id, perfil) VALUES (1, 'ROLE_USER');
INSERT INTO perfiles (id, perfil) VALUES (2, 'ROLE_ADMIN');

INSERT INTO usuarios_perfiles (usuario_id, perfil_id) VALUES (1,1);
INSERT INTO usuarios_perfiles (usuario_id, perfil_id) VALUES (2,2);
INSERT INTO usuarios_perfiles (usuario_id, perfil_id) VALUES (2,1);
INSERT INTO usuarios_perfiles (usuario_id, perfil_id) VALUES (3,1);

INSERT INTO productos (nombre, precio, fecha) VALUES ('Panasonic Pantalla LCD', 259990, NOW());
INSERT INTO productos (nombre, precio, fecha) VALUES ('Sony Camara digital DSC-W320B', 123490, NOW());
INSERT INTO productos (nombre, precio, fecha) VALUES ('Apple iPod shuffle', 14999990, NOW());
INSERT INTO productos (nombre, precio, fecha) VALUES ('Dell Notebook Z110', 37990, NOW());
INSERT INTO productos (nombre, precio, fecha) VALUES ('HP Multifuncional F2280', 69990, NOW());
INSERT INTO productos (nombre, precio, fecha) VALUES ('Bianchi Bicicleta Aro 26', 69990, NOW());
INSERT INTO productos (nombre, precio, fecha) VALUES ('MIca Comoda 5 cajones', 299990, NOW());

INSERT INTO facturas (descripcion, observacion, cliente_id, fecha) VALUES('Factura equipos de oficina', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1,1,1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2,1,4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1,1,5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1,1,7);

INSERT INTO facturas (descripcion, observacion, cliente_id, fecha) VALUES('Factura Bicicleta', 'Alguna nota !', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3,2,6);

