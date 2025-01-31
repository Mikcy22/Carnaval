-- Chirigotas
INSERT INTO agrupaciones (nombre, modalidad, numero_de_componentes, localidad) VALUES
('Los Chisposos', 'Chirigota', 12, 'Cádiz'),
('Los Descarados', 'Chirigota', 12, 'Cádiz'),
('Los Graciosillos', 'Chirigota', 12, 'Cádiz'),
('Los Sin Director', 'Chirigota', 12, 'Cádiz');

-- Comparsas
INSERT INTO agrupaciones (nombre, modalidad, numero_de_componentes, localidad) VALUES
('Los Elegantes', 'Comparsa', 15, 'Cádiz'),
('Los Soñadores', 'Comparsa', 15, 'Cádiz'),
('Los Románticos', 'Comparsa', 15, 'Cádiz'),
('Los Sin Director', 'Comparsa', 15, 'Cádiz');

-- Coros
INSERT INTO agrupaciones (nombre, modalidad, numero_de_componentes, localidad) VALUES
('Los Armónicos', 'Coro', 25, 'Cádiz'),
('Los Melódicos', 'Coro', 25, 'Cádiz'),
('Los Ritmicos', 'Coro', 25, 'Cádiz'),
('Los Sin Director', 'Coro', 25, 'Cádiz');

-- Cuartetos
INSERT INTO agrupaciones (nombre, modalidad, numero_de_componentes, localidad) VALUES
('Los Cuatro Fantásticos', 'Cuarteto', 4, 'Cádiz'),
('Los Cuatro Mosqueteros', 'Cuarteto', 4, 'Cádiz'),
('Los Cuatro Ases', 'Cuarteto', 4, 'Cádiz'),
('Los Sin Director', 'Cuarteto', 4, 'Cádiz');

-- Insertar componentes para las Chirigotas
INSERT INTO componentes (nombre, edad, rol, instrumento, agrupacion_id) VALUES
-- Chirigota 1: Los Chisposos
('Juan Pérez', 35, 'Director', NULL, 1),
('Luis Gómez', 28, 'Cantante', NULL, 1),
('Ana López', 30, 'Guitarra', 'Guitarra', 1),
('Carlos Ruiz', 25, 'Guitarra', 'Guitarra', 1),
('María Díaz', 27, 'Bombo', 'Bombo', 1),
('Pedro Sánchez', 29, 'Caja', 'Caja', 1),
('Sofía Martínez', 26, 'Corista', NULL, 1),
('Jorge Fernández', 24, 'Corista', NULL, 1),
('Lucía González', 23, 'Corista', NULL, 1),
('Miguel Torres', 22, 'Corista', NULL, 1),
('Elena Ramírez', 21, 'Corista', NULL, 1),
('David Jiménez', 20, 'Corista', NULL, 1),

-- Chirigota 2: Los Descarados
('Manuel García', 40, 'Director', NULL, 2),
('Carmen Ruiz', 32, 'Cantante', NULL, 2),
('Javier López', 29, 'Guitarra', 'Guitarra', 2),
('Sara Martín', 31, 'Guitarra', 'Guitarra', 2),
('Alberto Sánchez', 28, 'Bombo', 'Bombo', 2),
('Laura Pérez', 27, 'Caja', 'Caja', 2),
('Pablo Gómez', 26, 'Corista', NULL, 2),
('Marta Díaz', 25, 'Corista', NULL, 2),
('Raúl Martínez', 24, 'Corista', NULL, 2),
('Nuria Fernández', 23, 'Corista', NULL, 2),
('Óscar González', 22, 'Corista', NULL, 2),
('Isabel Torres', 21, 'Corista', NULL, 2),

-- Chirigota 3: Los Graciosillos
('Antonio Ruiz', 38, 'Director', NULL, 3),
('Eva Sánchez', 33, 'Cantante', NULL, 3),
('Diego López', 30, 'Guitarra', 'Guitarra', 3),
('Cristina Martín', 29, 'Guitarra', 'Guitarra', 3),
('Roberto Pérez', 28, 'Bombo', 'Bombo', 3),
('Patricia Gómez', 27, 'Caja', 'Caja', 3),
('Alejandro Díaz', 26, 'Corista', NULL, 3),
('Natalia Martínez', 25, 'Corista', NULL, 3),
('Rubén Fernández', 24, 'Corista', NULL, 3),
('Silvia González', 23, 'Corista', NULL, 3),
('Héctor Torres', 22, 'Corista', NULL, 3),
('Clara Ramírez', 21, 'Corista', NULL, 3),

-- Chirigota 4: Los Sin Director
('Luis Pérez', 34, 'Cantante', NULL, 4),
('Ana Gómez', 29, 'Guitarra', 'Guitarra', 4),
('Carlos López', 27, 'Guitarra', 'Guitarra', 4),
('María Ruiz', 26, 'Bombo', 'Bombo', 4),
('Pedro Sánchez', 25, 'Caja', 'Caja', 4),
('Sofía Martínez', 24, 'Corista', NULL, 4),
('Jorge Fernández', 23, 'Corista', NULL, 4),
('Lucía González', 22, 'Corista', NULL, 4),
('Miguel Torres', 21, 'Corista', NULL, 4),
('Elena Ramírez', 20, 'Corista', NULL, 4),
('David Jiménez', 19, 'Corista', NULL, 4),
('Laura Díaz', 18, 'Corista', NULL, 4);

-- Insertar componentes para las Comparsas
INSERT INTO componentes (nombre, edad, rol, instrumento, agrupacion_id) VALUES
-- Comparsa 1: Los Elegantes
('Francisco García', 45, 'Director', NULL, 5),
('María López', 35, 'Cantante', NULL, 5),
('Javier Ruiz', 32, 'Guitarra', 'Guitarra', 5),
('Sara Martín', 30, 'Guitarra', 'Guitarra', 5),
('Alberto Sánchez', 29, 'Guitarra', 'Guitarra', 5),
('Laura Pérez', 28, 'Bombo', 'Bombo', 5),
('Pablo Gómez', 27, 'Caja', 'Caja', 5),
('Marta Díaz', 26, 'Corista', NULL, 5),
('Raúl Martínez', 25, 'Corista', NULL, 5),
('Nuria Fernández', 24, 'Corista', NULL, 5),
('Óscar González', 23, 'Corista', NULL, 5),
('Isabel Torres', 22, 'Corista', NULL, 5),
('Alejandro Ramírez', 21, 'Corista', NULL, 5),
('Natalia Jiménez', 20, 'Corista', NULL, 5),
('Rubén Sánchez', 19, 'Corista', NULL, 5),

-- Comparsa 2: Los Soñadores
('Manuel López', 42, 'Director', NULL, 6),
('Carmen Ruiz', 34, 'Cantante', NULL, 6),
('Javier Martín', 31, 'Guitarra', 'Guitarra', 6),
('Sara Pérez', 30, 'Guitarra', 'Guitarra', 6),
('Alberto Gómez', 29, 'Guitarra', 'Guitarra', 6),
('Laura Díaz', 28, 'Bombo', 'Bombo', 6),
('Pablo Martínez', 27, 'Caja', 'Caja', 6),
('Marta Fernández', 26, 'Corista', NULL, 6),
('Raúl González', 25, 'Corista', NULL, 6),
('Nuria Torres', 24, 'Corista', NULL, 6),
('Óscar Ramírez', 23, 'Corista', NULL, 6),
('Isabel Jiménez', 22, 'Corista', NULL, 6),
('Alejandro Sánchez', 21, 'Corista', NULL, 6),
('Natalia López', 20, 'Corista', NULL, 6),
('Rubén Ruiz', 19, 'Corista', NULL, 6),

-- Comparsa 3: Los Románticos
('Antonio Martín', 40, 'Director', NULL, 7),
('Eva Pérez', 33, 'Cantante', NULL, 7),
('Diego Gómez', 30, 'Guitarra', 'Guitarra', 7),
('Cristina Díaz', 29, 'Guitarra', 'Guitarra', 7),
('Roberto Martínez', 28, 'Guitarra', 'Guitarra', 7),
('Patricia Fernández', 27, 'Bombo', 'Bombo', 7),
('Alejandro González', 26, 'Caja', 'Caja', 7),
('Natalia Torres', 25, 'Corista', NULL, 7),
('Rubén Ramírez', 24, 'Corista', NULL, 7),
('Silvia Jiménez', 23, 'Corista', NULL, 7),
('Héctor Sánchez', 22, 'Corista', NULL, 7),
('Clara López', 21, 'Corista', NULL, 7),
('Luis Ruiz', 20, 'Corista', NULL, 7),
('Ana Martín', 19, 'Corista', NULL, 7),
('Carlos Pérez', 18, 'Corista', NULL, 7),

-- Comparsa 4: Los Sin Director
('María Gómez', 36, 'Cantante', NULL, 8),
('Javier Díaz', 31, 'Guitarra', 'Guitarra', 8),
('Sara Martínez', 30, 'Guitarra', 'Guitarra', 8),
('Alberto Fernández', 29, 'Guitarra', 'Guitarra', 8),
('Laura González', 28, 'Bombo', 'Bombo', 8),
('Pablo Torres', 27, 'Caja', 'Caja', 8),
('Marta Ramírez', 26, 'Corista', NULL, 8),
('Raúl Jiménez', 25, 'Corista', NULL, 8),
('Nuria Sánchez', 24, 'Corista', NULL, 8),
('Óscar López', 23, 'Corista', NULL, 8),
('Isabel Ruiz', 22, 'Corista', NULL, 8),
('Alejandro Martín', 21, 'Corista', NULL, 8),
('Natalia Pérez', 20, 'Corista', NULL, 8),
('Rubén Gómez', 19, 'Corista', NULL, 8),
('Silvia Díaz', 18, 'Corista', NULL, 8);

-- Insertar componentes para los Coros
INSERT INTO componentes (nombre, edad, rol, instrumento, agrupacion_id) VALUES
-- Coro 1: Los Armónicos
('José García', 50, 'Director', NULL, 9),
('María López', 40, 'Cantante', NULL, 9),
('Javier Ruiz', 38, 'Instrumentista', 'Piano', 9),
('Sara Martín', 37, 'Instrumentista', 'Violín', 9),
('Alberto Sánchez', 36, 'Instrumentista', 'Flauta', 9),
('Laura Pérez', 35, 'Instrumentista', 'Trompeta', 9),
('Pablo Gómez', 34, 'Instrumentista', 'Bajo', 9),
('Marta Díaz', 33, 'Corista', NULL, 9),
('Raúl Martínez', 32, 'Corista', NULL, 9),
('Nuria Fernández', 31, 'Corista', NULL, 9),
('Óscar González', 30, 'Corista', NULL, 9),
('Isabel Torres', 29, 'Corista', NULL, 9),
('Alejandro Ramírez', 28, 'Corista', NULL, 9),
('Natalia Jiménez', 27, 'Corista', NULL, 9),
('Rubén Sánchez', 26, 'Corista', NULL, 9),
('Silvia López', 25, 'Corista', NULL, 9),
('Héctor Ruiz', 24, 'Corista', NULL, 9),
('Clara Martín', 23, 'Corista', NULL, 9),
('Luis Pérez', 22, 'Corista', NULL, 9),
('Ana Gómez', 21, 'Corista', NULL, 9),
('Carlos López', 20, 'Corista', NULL, 9),
('María Ruiz', 19, 'Corista', NULL, 9),
('Pedro Sánchez', 18, 'Corista', NULL, 9),
('Sofía Martínez', 17, 'Corista', NULL, 9),
('Jorge Fernández', 16, 'Corista', NULL, 9),

-- Coro 2: Los Melódicos
('Manuel López', 48, 'Director', NULL, 10),
('Carmen Ruiz', 39, 'Cantante', NULL, 10),
('Javier Martín', 37, 'Instrumentista', 'Guitarra', 10),
('Sara Pérez', 36, 'Instrumentista', 'Violonchelo', 10),
('Alberto Gómez', 35, 'Instrumentista', 'Saxofón', 10),
('Laura Díaz', 34, 'Instrumentista', 'Trombón', 10),
('Pablo Martínez', 33, 'Instrumentista', 'Batería', 10),
('Marta Fernández', 32, 'Corista', NULL, 10),
('Raúl González', 31, 'Corista', NULL, 10),
('Nuria Torres', 30, 'Corista', NULL, 10),
('Óscar Ramírez', 29, 'Corista', NULL, 10),
('Isabel Jiménez', 28, 'Corista', NULL, 10),
('Alejandro Sánchez', 27, 'Corista', NULL, 10),
('Natalia López', 26, 'Corista', NULL, 10),
('Rubén Ruiz', 25, 'Corista', NULL, 10),
('Silvia Martín', 24, 'Corista', NULL, 10),
('Héctor Pérez', 23, 'Corista', NULL, 10),
('Clara Gómez', 22, 'Corista', NULL, 10),
('Luis Díaz', 21, 'Corista', NULL, 10),
('Ana Martínez', 20, 'Corista', NULL, 10),
('Carlos Fernández', 19, 'Corista', NULL, 10),
('María González', 18, 'Corista', NULL, 10),
('Pedro Torres', 17, 'Corista', NULL, 10),
('Sofía Ramírez', 16, 'Corista', NULL, 10),
('Jorge Jiménez', 15, 'Corista', NULL, 10),

-- Coro 3: Los Ritmicos
('Antonio Martín', 47, 'Director', NULL, 11),
('Eva Pérez', 38, 'Cantante', NULL, 11),
('Diego Gómez', 36, 'Instrumentista', 'Piano', 11),
('Cristina Díaz', 35, 'Instrumentista', 'Violín', 11),
('Roberto Martínez', 34, 'Instrumentista', 'Flauta', 11),
('Patricia Fernández', 33, 'Instrumentista', 'Trompeta', 11),
('Alejandro González', 32, 'Instrumentista', 'Bajo', 11),
('Natalia Torres', 31, 'Corista', NULL, 11),
('Rubén Ramírez', 30, 'Corista', NULL, 11),
('Silvia Jiménez', 29, 'Corista', NULL, 11),
('Héctor Sánchez', 28, 'Corista', NULL, 11),
('Clara López', 27, 'Corista', NULL, 11),
('Luis Ruiz', 26, 'Corista', NULL, 11),
('Ana Martín', 25, 'Corista', NULL, 11),
('Carlos Pérez', 24, 'Corista', NULL, 11),
('María Gómez', 23, 'Corista', NULL, 11),
('Javier Díaz', 22, 'Corista', NULL, 11),
('Sara Martínez', 21, 'Corista', NULL, 11),
('Alberto Fernández', 20, 'Corista', NULL, 11),
('Laura González', 19, 'Corista', NULL, 11),
('Pablo Torres', 18, 'Corista', NULL, 11),
('Marta Ramírez', 17, 'Corista', NULL, 11),
('Raúl Jiménez', 16, 'Corista', NULL, 11),
('Nuria Sánchez', 15, 'Corista', NULL, 11),
('Óscar López', 14, 'Corista', NULL, 11),

-- Coro 4: Los Sin Director
('María Ruiz', 37, 'Cantante', NULL, 12),
('Javier López', 36, 'Instrumentista', 'Guitarra', 12),
('Sara Martín', 35, 'Instrumentista', 'Violonchelo', 12),
('Alberto Sánchez', 34, 'Instrumentista', 'Saxofón', 12),
('Laura Pérez', 33, 'Instrumentista', 'Trombón', 12),
('Pablo Gómez', 32, 'Instrumentista', 'Batería', 12),
('Marta Díaz', 31, 'Corista', NULL, 12),
('Raúl Martínez', 30, 'Corista', NULL, 12),
('Nuria Fernández', 29, 'Corista', NULL, 12),
('Óscar González', 28, 'Corista', NULL, 12),
('Isabel Torres', 27, 'Corista', NULL, 12),
('Alejandro Ramírez', 26, 'Corista', NULL, 12),
('Natalia Jiménez', 25, 'Corista', NULL, 12),
('Rubén Sánchez', 24, 'Corista', NULL, 12),
('Silvia López', 23, 'Corista', NULL, 12),
('Héctor Ruiz', 22, 'Corista', NULL, 12),
('Clara Martín', 21, 'Corista', NULL, 12),
('Luis Pérez', 20, 'Corista', NULL, 12),
('Ana Gómez', 19, 'Corista', NULL, 12),
('Carlos López', 18, 'Corista', NULL, 12),
('María Ruiz', 17, 'Corista', NULL, 12),
('Pedro Sánchez', 16, 'Corista', NULL, 12),
('Sofía Martínez', 15, 'Corista', NULL, 12),
('Jorge Fernández', 14, 'Corista', NULL, 12),
('Lucía González', 13, 'Corista', NULL, 12);

-- Insertar componentes para los Cuartetos
INSERT INTO componentes (nombre, edad, rol, instrumento, agrupacion_id) VALUES
-- Cuarteto 1: Los Cuatro Fantásticos
('Juan García', 30, 'Cantante', NULL, 13),
('María López', 28, 'Cantante', NULL, 13),
('Javier Ruiz', 27, 'Cantante', NULL, 13),
('Sara Martín', 26, 'Cantante', NULL, 13),

-- Cuarteto 2: Los Cuatro Mosqueteros
('Manuel López', 32, 'Director', NULL, 14),
('Carmen Ruiz', 30, 'Cantante', NULL, 14),
('Javier Martín', 29, 'Cantante', NULL, 14),
('Sara Pérez', 28, 'Cantante', NULL, 14),

-- Cuarteto 3: Los Cuatro Ases
('Antonio Martín', 35, 'Director', NULL, 15),
('Eva Pérez', 33, 'Cantante', NULL, 15),
('Diego Gómez', 32, 'Cantante', NULL, 15),
('Cristina Díaz', 31, 'Cantante', NULL, 15),

-- Cuarteto 4: Los Sin Director
('María Gómez', 29, 'Cantante', NULL, 16),
('Javier Díaz', 28, 'Cantante', NULL, 16),
('Sara Martínez', 27, 'Cantante', NULL, 16),
('Alberto Fernández', 26, 'Cantante', NULL, 16);

-- Actualizar las agrupaciones con los directores correspondientes
UPDATE agrupaciones SET director_id = 1 WHERE id = 1; -- Chirigota 1
UPDATE agrupaciones SET director_id = 13 WHERE id = 2; -- Chirigota 2
UPDATE agrupaciones SET director_id = 25 WHERE id = 3; -- Chirigota 3
UPDATE agrupaciones SET director_id = 37 WHERE id = 5; -- Comparsa 1
UPDATE agrupaciones SET director_id = 52 WHERE id = 6; -- Comparsa 2
UPDATE agrupaciones SET director_id = 67 WHERE id = 7; -- Comparsa 3
UPDATE agrupaciones SET director_id = 82 WHERE id = 9; -- Coro 1
UPDATE agrupaciones SET director_id = 107 WHERE id = 10; -- Coro 2
UPDATE agrupaciones SET director_id = 132 WHERE id = 11; -- Coro 3
UPDATE agrupaciones SET director_id = 157 WHERE id = 14; -- Cuarteto 2
UPDATE agrupaciones SET director_id = 161 WHERE id = 15; -- Cuarteto 3;


-- Insertar puntuaciones para todas las agrupaciones en todas las fases
INSERT INTO puntuaciones (agrupacion_id, fase, puntos) VALUES
-- Chirigotas
-- Chirigota 1: Los Chisposos
(1, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(1, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(1, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(1, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Chirigota 2: Los Descarados
(2, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(2, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(2, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(2, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Chirigota 3: Los Graciosillos
(3, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(3, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(3, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(3, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Chirigota 4: Los Sin Director
(4, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(4, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(4, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(4, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Comparsas
-- Comparsa 1: Los Elegantes
(5, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(5, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(5, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(5, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Comparsa 2: Los Soñadores
(6, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(6, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(6, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(6, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Comparsa 3: Los Románticos
(7, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(7, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(7, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(7, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Comparsa 4: Los Sin Director
(8, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(8, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(8, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(8, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Coros
-- Coro 1: Los Armónicos
(9, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(9, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(9, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(9, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Coro 2: Los Melódicos
(10, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(10, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(10, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(10, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Coro 3: Los Ritmicos
(11, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(11, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(11, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(11, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Coro 4: Los Sin Director
(12, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(12, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(12, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(12, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Cuartetos
-- Cuarteto 1: Los Cuatro Fantásticos
(13, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(13, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(13, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(13, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Cuarteto 2: Los Cuatro Mosqueteros
(14, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(14, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(14, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(14, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Cuarteto 3: Los Cuatro Ases
(15, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(15, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(15, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(15, 'Final', ROUND(RAND() * (100 - 50) + 50, 2)),

-- Cuarteto 4: Los Sin Director
(16, 'Preliminares', ROUND(RAND() * (100 - 50) + 50, 2)),
(16, 'Cuartos', ROUND(RAND() * (100 - 50) + 50, 2)),
(16, 'Semifinales', ROUND(RAND() * (100 - 50) + 50, 2)),
(16, 'Final', ROUND(RAND() * (100 - 50) + 50, 2));


