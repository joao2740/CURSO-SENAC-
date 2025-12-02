CREATE DATABASE IF NOT EXISTS api_usuarios;

USE api_usuarios;

CREATE TABLE usuarios (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(100) UNIQUE NOT NULL
);

INSERT INTO usuarios (nome, email) VALUES
  ('João Silva', 'joao@email.com'),
  ('Maria Santos', 'maria@email.com');