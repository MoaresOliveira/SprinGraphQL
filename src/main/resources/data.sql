create table coffee
(
    id int primary key auto_increment,
    name VARCHAR not null,
    size VARCHAR not null
);
INSERT INTO coffee (name, size) VALUES ('Cappuccino', 'GRANDE'),
                                         ('Latte','VENTI'),
                                         ('Machiatto','SHORT'),
                                         ('Tricolore','TALL');