create table categorias(
id int auto_increment,
descripcion varchar(100),
CONSTRAINT idcategoriapk primary key (id)
);

insert into categorias (descripcion) values ('Alimento'),('Jueguetes');

create table productos(
id int auto_increment,
nombre varchar(100),
precioUnitario double(10,2),
categoria int,
CONSTRAINT idproductopk primary key (id),
CONSTRAINT FK_categoria FOREIGN KEY (categoria)
    REFERENCES categorias(id)
);

INSERT INTO `productos`(`nombre`, `precioUnitario`, `categoria`) VALUES ('Agility Gold cachorros',25700.00,1),('Agility Gold adultos',35700.00,1);

create table carrito(
id int auto_increment,
detalle varchar(100),
CONSTRAINT idcarritopk primary key (id)
);

INSERT INTO `carrito`(`detalle`) VALUES ('carro cliente invitado'),('carro cliente invitado');

create table productoCarrito(
id int auto_increment,
carrito int,
producto int,
cantidad int,
precio double(10,2),
CONSTRAINT idcarpropk primary key (id),
CONSTRAINT FK_carrito FOREIGN KEY (carrito)
    REFERENCES carrito(id),
CONSTRAINT FK_producto FOREIGN KEY (producto)
    REFERENCES productos(id)
);

INSERT INTO `productocarrito`(`carrito`, `producto`) VALUES (1,1),(1,2);

