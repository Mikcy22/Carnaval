DROP DATABASE IF EXISTS carnaval_cadiz;

-- Crear la base de datos
CREATE DATABASE carnaval_cadiz;

-- Usar la base de datos
USE carnaval_cadiz;

-- Crear la tabla de agrupaciones
CREATE TABLE agrupaciones (
    id BIGINT AUTO_INCREMENT PRIMARY KEY, -- Identificador único
    nombre VARCHAR(100) NOT NULL,         -- Nombre de la agrupación
    director_id BIGINT,                   -- Relación uno a uno con la tabla de componentes (director)
    modalidad ENUM('Chirigota', 'Comparsa', 'Coro', 'Cuarteto') NOT NULL, -- Modalidad
    numero_de_componentes INT,            -- Número de componentes en la agrupación
    localidad VARCHAR(100)		          -- Ciudad de origen

);

-- Crear la tabla de componentes
CREATE TABLE componentes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY, -- Identificador único
    nombre VARCHAR(100) NOT NULL,         -- Nombre del componente
    edad INT NOT NULL,                    -- Edad del componente
    rol VARCHAR(100),                     -- Rol en la agrupación
    instrumento VARCHAR(100),             -- Instrumento que toca (opcional)
    agrupacion_id BIGINT				  -- Relación muchos a uno con la tabla agrupaciones
);

ALTER TABLE agrupaciones ADD CONSTRAINT fk_director FOREIGN KEY (director_id) REFERENCES componentes(id) ON DELETE SET NULL;
ALTER TABLE componentes ADD CONSTRAINT fk_agrupacion FOREIGN KEY (agrupacion_id) REFERENCES agrupaciones(id) ON DELETE CASCADE;

-- Crear la tabla de puntuaciones
CREATE TABLE puntuaciones (
    id BIGINT AUTO_INCREMENT PRIMARY KEY, -- Identificador único
    agrupacion_id BIGINT NOT NULL,        -- Relación muchos a uno con la tabla agrupaciones
    fase ENUM('Preliminares', 'Cuartos', 'Semifinales', 'Final') NOT NULL, -- Fase del concurso
    puntos DOUBLE NOT NULL,               -- Puntuación obtenida
    CONSTRAINT fk_puntuacion_agrupacion FOREIGN KEY (agrupacion_id) REFERENCES agrupaciones(id) ON DELETE CASCADE
);
