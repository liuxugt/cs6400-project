#create database cs6400;

create table cs6400.collections(
	id int auto_increment not null primary key,
    name varchar(255),
    poster_path varchar(255)
);

create table cs6400.movies(
    id int auto_increment not null primary key,
    belongs_to_collection_id int,
    foreign key (belongs_to_collection_id) references collections(id),
    budget int,
    original_language varchar(255),
    popularity double,
    poster_path varchar(255),
    release_date date,
    revenue int,
    runtime double,
    status varchar(255),
    title varchar(255),
    video varchar(255),
    vote_average double,
    vote_count int
);
-- update movies set belongs_to_collection_id = null where belongs_to_collection_id = "";
-- alter table movies modify column belongs_to_collection_id int;

create table cs6400.genres(
	id int auto_increment not null primary key,
    name varchar(255)
);

create table movie_genre_relation(
	id int auto_increment not null,
    primary key (id),
    movie_id int not null,
    FOREIGN KEY (movie_id) references movies(id),
    genre_id int not null,
    FOREIGN KEY (genre_id) references genres(id)
);

create table cs6400.companies(
	id int auto_increment not null primary key,
    name varchar(255)
);

create table cs6400.movie_company_relation(
    id int not null auto_increment primary key,
	company_id int,
    foreign key (company_id) references companies(id),
    movie_id int,
    foreign key (movie_id) references movies(id)
);
create table cs6400.countries(
    iso_3166_1 varchar(31) primary key not null,
    name varchar(255)
);
create table cs6400.movie_country_relation(
	id int auto_increment not null primary key,
    country_id varchar(31),
    foreign key (country_id) references countries(iso_3166_1), 
    movie_id int,
    foreign key (movie_id) references movies(id)
);



create table cs6400.languages(
	iso_639_1 varchar(31) primary key not null,
    name varchar(255)
);
create table cs6400.movie_language_relation(
	id int not null primary key auto_increment,
	language_id varchar(31),
    foreign key (language_id) references languages(iso_639_1),
    movie_id int,
    foreign key (movie_id) references movies(id)
);

create table crews(
    gender int,
    id int auto_increment not null primary key,
    name varchar(255),
    profile_path  varchar(255)
);
create table movie_crew_relation(
	id int auto_increment not null primary key,
    movie_id int,
    foreign key (movie_id) references movies(id),
    crew_id int,
    foreign key (crew_id) references crews(id),
	department varchar(255),
    job varchar(255)
);

create table movie_cast_relation(
	id int not null auto_increment primary key,
    movie_id int,
    cast_id int,
    characters varchar(255),
    cast_order int,
    crew_id int,
    foreign key(movie_id) references movies(id),
    foreign key(crew_id) references crews(id)
);

create table parent_company(
	id int not null auto_increment primary key,
    company_id int,
    parent_id int,
	foreign key(company_id) references companies(id),
    foreign key(parent_id) references companies(id)
);